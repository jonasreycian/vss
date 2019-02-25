package naxxhi.com.vss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.FileNotFoundException;

import naxxhi.com.vss.grabber.DigitRecognizer;

public class SplashActivity extends AppCompatActivity {
    public static String TAG = "MainActivity";
    private final int SCREEN_TIMEOUT = 3000;
    private DigitRecognizer digitRecognizer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(SCREEN_TIMEOUT);
                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                    finish();
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t.start();

        digitRecognizer = new DigitRecognizer();
        try {
            digitRecognizer.ReadMNISTData();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
