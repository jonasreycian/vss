package naxxhi.com.vss.grabber;

import android.os.Environment;
import android.util.Log;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.ml.CvKNearest;
import org.opencv.ml.CvSVM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * Created by jonsa on 3/24/2018.
 */

public class DigitRecognizer {

    private final String TRAIN_IMAGES_PATH =
            "/storage/extSdCard/Android/data/com.vss.sudokusolver/train-images.idx3-ubyte.idx3";
    private final String LABELS_IMAGES_PATH =
            "/storage/extSdCard/Android/data/com.vss.sudokusolver/train-labels.idx1-ubyte";

    private CvKNearest knn;
    private static CvSVM svm;

    public void ReadMNISTData() throws FileNotFoundException {

        File external_storage = Environment.getExternalStorageDirectory();

        File mnist_images_file = new File(external_storage, TRAIN_IMAGES_PATH);

        FileInputStream images_reader = new FileInputStream(mnist_images_file);

        Mat training_images = null;

        int total_images = 0, width, height;
        try {
            // Read the file headers which contain the total number of images and dimensions.
            // First 16 bytes hold the header
            /*
            byte 0 -3 : Magic Number (Not to be used)
            byte 4 - 7: Total number of images in the dataset
            byte 8 - 11: width of each image in the dataset
            byte 12 - 15: height of each image in the dataset
            */

            byte [] header = new byte[16];
            images_reader.read(header, 0, 16);

            //Combining the bytes to form an integer
            ByteBuffer temp = ByteBuffer.wrap(header, 4, 12);
            total_images = temp.getInt();
            width = temp.getInt();
            height = temp.getInt();

            //Total number of pixels in each image
            int px_count = width * height;
            training_images = new Mat(total_images, px_count, CvType.CV_8U);

            //images_data = new byte[total_images][px_count];
            //Read each image and store it in an array.

            for (int i = 0 ; i < total_images ; i++)
            {
                byte[] image = new byte[px_count];
                images_reader.read(image, 0, px_count);
                training_images.put(i,0,image);
            }

            training_images.convertTo(training_images, CvType.CV_32FC1);
            images_reader.close();

        }catch (IOException e){
            Log.i("MNIST Read Error:", "" + e.getMessage());
        }

        //Read Labels
        Mat training_labels = null;
        byte[] labels_data = new byte[total_images];

        File mnist_labels_file = new File(external_storage, LABELS_IMAGES_PATH);
        FileInputStream labels_reader = new FileInputStream(mnist_labels_file);

        try{
            training_labels = new Mat(total_images, 1, CvType.CV_8U);
            Mat temp_labels = new Mat(1, total_images, CvType.CV_8U);
            byte[] header = new byte[8];

            //Read the header
            labels_reader.read(header, 0, 8);

            //Read all the labels at once
            labels_reader.read(labels_data,0,total_images);
            temp_labels.put(0,0, labels_data);

            //Take a transpose of the image
            Core.transpose(temp_labels, training_labels);
            training_labels.convertTo(training_labels, CvType.CV_32FC1);
            labels_reader.close();
        }
        catch (IOException e)
        {
            Log.i("MNIST Read Error:", "" + e.getMessage());
        }

        // KNN Algorithm
        /*
        knn = new CvKNearest();
        knn.train(training_images, training_labels, new Mat(), false, 10, false);
        */

        // SVM Algorithm
        svm = new CvSVM();
        svm.train(training_images, training_labels);
    }

    public static String printFilePath(){
        File external_storage = Environment.getExternalStorageDirectory();

        return external_storage.getAbsolutePath();
    }

    public static CvSVM getSvm(){
        return svm;
    }
}
