package tests.testDivision;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//
public class ReadCsvDataDiv {
    private static String[][] dataDivArray = null;

    public static void readSumData() throws IOException {
        BufferedReader dataDivFile = new BufferedReader(new FileReader("src/test/resources/testData/dataTestDiv.csv"));

        List<String> lines = new ArrayList<String>();
        while (dataDivFile.ready()) {
            lines.add(dataDivFile.readLine());
        }
        int dataDivArrayWidth = lines.get(0).split("\\|").length;
        int dataDivArrayHeight = lines.size();

        dataDivArray = new String[dataDivArrayHeight][dataDivArrayWidth];

        for (int i = 0; i < dataDivArrayHeight; i++) {
            for (int j = 0; j < dataDivArrayWidth; j++) {
                String[] line = lines.get(i).split("\\|");
                dataDivArray[i][j] = line[j];
            }
        }
    }

    public static String[][] getDataDivArray() {
        return dataDivArray;
    }
}
