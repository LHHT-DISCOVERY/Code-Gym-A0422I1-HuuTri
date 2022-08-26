package ss16_IO_text_file.practice.read_and_write_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Country> getCountry(String path) {
        List<Country> countries = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String tempt;
            while ((tempt = reader.readLine()) != null) {
                if ("".equals(tempt.trim())) {
                    continue;
                }
                String[] result = tempt.split(",");
                if (result.length != 3) {
                    continue;
                }

                int stt = Integer.parseInt(result[0]);
                String code = result[1];
                String name = result[2];
                countries.add(new Country(stt, code, name));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countries;
    }

}
