package tests.testSubtraction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//
public class ReadCsvDataSub {
    private static String[][] dataSubArray = null;

    public static void readSumData() throws IOException {
        BufferedReader dataSubFile = new BufferedReader(new FileReader("src/test/resources/testData/dataTestSub.csv"));

        List<String> lines = new ArrayList<String>();
        while (dataSubFile.ready()) {
            lines.add(dataSubFile.readLine());
        }
        int dataSubArrayWidth = lines.get(0).split("\\|").length;
        int dataSubArrayHeight = lines.size();

        dataSubArray = new String[dataSubArrayHeight][dataSubArrayWidth];

        for (int i = 0; i < dataSubArrayHeight; i++) {
            for (int j = 0; j < dataSubArrayWidth; j++) {
                String[] line = lines.get(i).split("\\|");
                dataSubArray[i][j] = line[j];
            }
        }
    }

    public static String[][] getDataSubArray() {
        return dataSubArray;
    }
}
