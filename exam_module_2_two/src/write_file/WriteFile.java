package write_file;

import model.SPXuatKhau;
import model.SanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    public static List<String> read(String path) {
        List<String> list = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    list.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void writer(String path, List<SPXuatKhau> sanPhams, boolean isAppen) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, isAppen));) {

            for (SanPham s : sanPhams) {
                bufferedWriter.write(s.data_inf());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
