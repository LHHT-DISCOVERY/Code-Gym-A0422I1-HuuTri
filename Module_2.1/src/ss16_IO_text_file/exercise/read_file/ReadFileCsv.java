package ss16_IO_text_file.exercise.read_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCsv {
    public static List<String> pareCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] cutData = csvLine.split(",");
            for (int i = 0; i < cutData.length; i++) {
                result.add(cutData[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
            String line;
            reader = new BufferedReader(
                    new FileReader(
                            "E:\\Code_Gym_A0422I1_HuuTri\\Module_2.1\\" +
                                    "src\\ss16_IO_text_file\\exercise\\read_file\\country.csv"));
            while ((line = reader.readLine()) != null) {
                System.out.println((pareCsvLine(line)));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}

