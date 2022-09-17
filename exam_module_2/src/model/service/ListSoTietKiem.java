package model.service;

import exception.UserException;
import model.SoTietKiemNganHan;
import validate.Validator;
import write_file.WriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ListSoTietKiem {
    public static final String REGEX_MASOTIETKIEM = "STK-([\\d]{0,9})";
    public static final String DATA_DATA_SO_TIET_KIEM = "src\\data\\data_employee.csv";
    Scanner scanner = new Scanner(System.in);
    List<SoTietKiemNganHan> soTietKiemNganHans = new ArrayList<>();

    public void add() {
        String maSoTietKiem = enterMaTietKiem();
        System.out.println("Nhập mã khách hàng : ");
        String maKhachHang = scanner.nextLine();
        System.out.println("Nhập ngày mở sổ ");
        String date = enterDate();
        System.out.println("Nhập thời gian gửi : ");
        String thoiGianGui = scanner.nextLine();
        System.out.println("Nhập số tiền gửi : ");
        double soTienGui = enterSoTienGui();
        System.out.println("Nhập lãi xuất : ");
        float laiXuat = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập kì hạn ");
        int kiHan = Integer.parseInt(scanner.nextLine());
        SoTietKiemNganHan tietKiemNganHan = new SoTietKiemNganHan(maSoTietKiem, maKhachHang, date, thoiGianGui, soTienGui, laiXuat, kiHan);
        soTietKiemNganHans.add(tietKiemNganHan);
        ghiFile();
    }

    // validate ngày
    public String enterDate() {
        do {
            System.out.print("Enter Date  :");
            String date = scanner.nextLine();
            try {
                Validator.validate(date);
                return date;
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
     public void ghiFile(){
         WriteFile.writeToFileSoTietKiem(DATA_DATA_SO_TIET_KIEM, soTietKiemNganHans, true);
     }

     // validate String
    public String enterMaTietKiem() {
        Pattern pattern = Pattern.compile(REGEX_MASOTIETKIEM);
        do {
            System.out.println("Nhâp mã sổ tiết kiệm : ");
            String maSoTietKiem = scanner.nextLine();
            if (!pattern.matcher(maSoTietKiem).matches()) {
                System.out.println(" !! false again  ");
            } else {
                System.out.println("Enter successful");
                return maSoTietKiem;
            }
        } while (true);
    }

    // validate biến
    public Double enterSoTienGui() {
        do {
            System.out.print("Enter Số Tiền Gửi  : ");
            double soTienGui = Double.parseDouble(scanner.nextLine());
            try {
                if (Validator.validateTienGui(soTienGui)) {
                    return soTienGui;
                }
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public void display() {
        for (SoTietKiemNganHan tietKiemNganHan : soTietKiemNganHans
        ) {
            System.out.println(tietKiemNganHan);
        }
    }
    // xóa
    public boolean remove(SoTietKiemNganHan MSTK) {
        return this.soTietKiemNganHans.remove(MSTK);
    }


}
