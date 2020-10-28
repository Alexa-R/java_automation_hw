package tests.testMultiplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//
public class ReadCsvDataMult {
    private static String[][] dataMultArray = null;

    public static void readSumData() throws IOException {
        BufferedReader dataMultFile = new BufferedReader(new FileReader("src/test/resources/testData/dataTestMult.csv"));

        List<String> lines = new ArrayList<String>();
        while (dataMultFile.ready()) {
            lines.add(dataMultFile.readLine());
        }
        int dataMultArrayWidth = lines.get(0).split("\\|").length;
        int dataMultArrayHeight = lines.size();

        dataMultArray = new String[dataMultArrayHeight][dataMultArrayWidth];

        for (int i = 0; i < dataMultArrayHeight; i++) {
            for (int j = 0; j < dataMultArrayWidth; j++) {
                String[] line = lines.get(i).split("\\|");
                dataMultArray[i][j] = line[j];
            }
        }
    }

    public static String[][] getDataMultArray() {
        return dataMultArray;
    }
}
