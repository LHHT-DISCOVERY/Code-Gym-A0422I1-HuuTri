package ss16_IO_text_file.exercise.read_file;

import ss16_IO_text_file.practice.read_and_write_file.Country;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCsv {
    public static List<Country> readFile(String path) {
        List<Country> countries = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String data;
            while ((data = reader.readLine()) != null) {
                // kiểm tra hàng tiếp theo có rỗng ko để tiếng hành cắt hoặc bỏ qua
                if ("".equals(data.trim())) {
                    continue;
                }
                String[] result = data.split(",");
                int id = Integer.parseInt(result[0]);
                String code = result[1];
                String name = result[2];

                countries.add(new Country(id, code, name));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return countries;
    }

    public static void main(String[] args) {
        List<Country> countries =
                readFile("E:\\Code_Gym_A0422I1_HuuTri\\Module_2.1\\" +
                        "src\\ss16_IO_text_file\\exercise\\read_file\\country.csv");
        countries.forEach(System.out::println);
    }
}

