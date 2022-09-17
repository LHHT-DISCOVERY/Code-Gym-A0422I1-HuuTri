package write_file;

import model.SPNhapKhau;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    public static void writeToFileSPNhapKhau(String path, List<SPNhapKhau> nhapKhauList, boolean append) {
        BufferedWriter writer;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path, append);
            writer = new BufferedWriter(fileWriter);
            for (SPNhapKhau spNhapKhau : nhapKhauList) {
                writer.write(spNhapKhau.getIdSP() +
                        "," + spNhapKhau.getTenSp() + "," + spNhapKhau.getMaSP() + "," + spNhapKhau.getGiaSP() + "," + spNhapKhau.getSoLuongSP() + ","
                        + spNhapKhau.getNhaSX() + "," +
                        spNhapKhau.getGiaNhapKhau() + "," + spNhapKhau.getTinhNhapKhau() + ","
                        + spNhapKhau.getThueNhapKhau());
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

    public static List<SPNhapKhau> readFileSPNhapKhau(String path) {
        List<SPNhapKhau> nhapKhauList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String data;
            while ((data = reader.readLine()) != null) {
                if ("".equals(data.trim())) {
                    continue;
                }
                String[] result = data.split(",");
                String idSP = result[0];
                String tenSP = result[2];
                String maSP = result[3];
                double giaSP = Double.parseDouble(result[4]);
                int soLuongSP = Integer.parseInt(result[5]);
                String nhaSX = result[6];
                double giaNhapKhau = Double.parseDouble(result[7]);
                String tinhThanh = result[8];
                double thueNhap = Double.parseDouble(result[9]);

                nhapKhauList.add(new SPNhapKhau(idSP, tenSP, maSP, giaSP, soLuongSP, nhaSX, giaNhapKhau, tinhThanh, thueNhap));

            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR : File này hiện chưa có ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nhapKhauList;
    }
}
