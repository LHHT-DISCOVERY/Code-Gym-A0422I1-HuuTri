package ss16_IO_text_file.exercise.copy_file;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import ss16_IO_text_file.practice.read_and_write_file.Country;
import sun.awt.image.ImageWatched;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CopyFile {
    public static List<Country> readFile(String path) {
        List<Country> countries = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String data;
            while ((data = reader.readLine()) != null) {
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

    public static void writeFile(String path, List<Country> countryList) {
        BufferedWriter writer;
        FileWriter fileWriter = null;
        try {
           fileWriter = new FileWriter(path);
           writer = new BufferedWriter(fileWriter);
            for (Country country : countryList
            ) {
                writer.write(country.getStt() + "," + country.getCode() + "," + country.getName());
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Cách 2 tham khảo trên mạng :
//    public static void copyFile(String[] strings) throws IOException {
//        InputStream input;
//        OutputStream out;
//
//        try {
//            input = new FileInputStream(new File("src\\ss16_IO_text_file\\practice\\file.txt"));
//            out = new FileOutputStream(new File("src\\ss16_IO_text_file\\exercise\\copy_file\\file_copy.txt"));
//
//            int length;
//            byte[] buffer = new byte[1024];
//
//            while ((length = input.read(buffer)) > 0) {
//                out.write(buffer, 0, length);
//            }
//            System.out.println("Copy is successful");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) throws IOException {
        List<Country> r = CopyFile.readFile("E:\\Code_Gym_A0422I1_HuuTri\\Module_2.1\\" +
                "src\\ss16_IO_text_file\\exercise\\read_file\\country.csv");
        r.forEach(System.out::println);
        CopyFile.writeFile("E:\\Code_Gym_A0422I1_HuuTri\\Module_2.1\\src\\ss16_IO_text_file\\exercise\\copy_file\\copy_file.txt", r);
    }
}
