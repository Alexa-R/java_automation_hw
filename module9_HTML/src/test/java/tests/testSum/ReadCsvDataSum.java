package tests.testSum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCsvDataSum {
    private static String[][] dataSumArray = null;

    public static void readSumData() throws IOException {
        BufferedReader dataSumFile = new BufferedReader(new FileReader("src/test/resources/testData/dataTestSum.csv"));

        List<String> lines = new ArrayList<String>();
        while (dataSumFile.ready()) {
            lines.add(dataSumFile.readLine());
        }
        int dataSumArrayWidth = lines.get(0).split("\\|").length;
        int dataSumArrayHeight = lines.size();

        dataSumArray = new String[dataSumArrayHeight][dataSumArrayWidth];

        for (int i = 0; i < dataSumArrayHeight; i++) {
            for (int j = 0; j < dataSumArrayWidth; j++) {
                String[] line = lines.get(i).split("\\|");
                dataSumArray[i][j] = line[j];
            }
        }
    }

    public static String[][] getDataSumArray() {
        return dataSumArray;
    }
}
