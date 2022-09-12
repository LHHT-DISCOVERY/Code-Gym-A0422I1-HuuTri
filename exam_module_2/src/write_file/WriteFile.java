package write_file;

import model.SoTietKiemNganHan;
import sun.misc.FloatingDecimal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    public static void writeToFileSoTietKiem(String path, List<SoTietKiemNganHan> soTietKiemNganHans, boolean append) {
        BufferedWriter writer;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path, append);
            writer = new BufferedWriter(fileWriter);
            for (SoTietKiemNganHan tietKiemNganHan : soTietKiemNganHans) {
                writer.write(tietKiemNganHan.getMaSoTietKiem() +
                        "," + tietKiemNganHan.getMaKhachHang() + "," + tietKiemNganHan.getNgayMoSo() + ","
                        + tietKiemNganHan.getThoiGianBatDauGui() + "," +
                        tietKiemNganHan.getSoTienGui() + "," + tietKiemNganHan.getLaiSuat() + ","
                        + tietKiemNganHan.getKiHan());
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

    public static List<SoTietKiemNganHan> readFileSoTietKiem(String path) {
        List<SoTietKiemNganHan> soTietKiemNganHanList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String data;
            while ((data = reader.readLine()) != null) {
                if ("".equals(data.trim())) {
                    continue;
                }
                String[] result = data.split(",");
                String MaSoTietKiem = result[0];
                String MaKhachHang = result[1];
                String NgayMoSo = result[2];
                String ThoiGianBatDauGui = result[3];
                double SoTienGui = Double.parseDouble(result[4]);
                float LaiSuat = Float.parseFloat(result[5]);
                int KiHan = Integer.parseInt(result[6]);

                soTietKiemNganHanList.add(new SoTietKiemNganHan(MaSoTietKiem , MaKhachHang ,NgayMoSo ,ThoiGianBatDauGui
                        ,SoTienGui, LaiSuat, KiHan ));

            }
        } catch (FileNotFoundException e){
            System.out.println("ERROR : File này hiện chưa có ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return soTietKiemNganHanList;
    }
}
