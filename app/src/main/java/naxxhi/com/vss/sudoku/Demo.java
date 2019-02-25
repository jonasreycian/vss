package naxxhi.com.vss.sudoku;


public class Demo {

    public static void main(String[] args) {

        HarmonySearch hs = new HarmonySearch();
        hs.setBW(.2);
        hs.setNVAR(5);
        hs.setHMCR(.9);
        hs.setHMS(5);
        hs.setPAR(.4);
        hs.setMaxIteration(100000);

        double low[] = { 2.0, 3.0, 1.0, 1.0, 1.0 };
        double high[] = { 5.0, 6.0, 2.0, 2.0, 2.0 };
        hs.setBounds(low, high);
        hs.mainLoop();

    }

}
