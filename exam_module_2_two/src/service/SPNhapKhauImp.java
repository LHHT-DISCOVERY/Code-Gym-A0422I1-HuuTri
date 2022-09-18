package service;

import model.SPNhapKhau;
import write_file.WriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SPNhapKhauImp implements ServiceInterface {
//    public static final String DATA_DATA_NK = "src\\data\\data_spnk.csv";
    Scanner scanner = new Scanner(System.in);
    List<SPNhapKhau> nhapKhauList = new ArrayList<>();

    @Override
    public void add() {
        System.out.println("Nhập id sản phầm : ");
        String idSP = scanner.nextLine();
        System.out.println("Nhập ten sản phẩm : ");
        String tenSP = scanner.nextLine();
        System.out.println("Nhập mã sản phẩm : ");
        String maSP = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm : ");
        double giaSP = scanner.nextDouble();
        System.out.println("Nhập số lượng sản phẩm : ");
        int soLuongSP = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập nhà Sản xuất : ");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Nhập giá nhập khẩu : ");
        double giaNhapKhau = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập tỉnh thành nhập : ");
        String tinhThanhNhap = scanner.nextLine();
        System.out.println("Nhập thuế nhập khẩu : ");
        double thueNhapKhau = Double.parseDouble(scanner.nextLine());
        SPNhapKhau spNhapKhau = new SPNhapKhau(idSP, tenSP, maSP, giaSP, soLuongSP, nhaSanXuat, giaNhapKhau, tinhThanhNhap, thueNhapKhau);
        nhapKhauList.add(spNhapKhau);
//        WriteFile.writer(DATA_DATA_NK);

    }

    public boolean remove(SPNhapKhau maSP) {
        return this.nhapKhauList.remove(maSP);
    }

    @Override
    public void display() {
        for (SPNhapKhau spNhapKhau : nhapKhauList
        ) {
            System.out.println(spNhapKhau);
        }
    }

    @Override
    public void search(String name) {
        boolean isFlag = false;
        for (SPNhapKhau spNhapKhau : nhapKhauList
        ) {
            if (spNhapKhau.getMaSP().contains(name)) {
                System.out.println(spNhapKhau);
                isFlag = true;
            }
        }
        if (!isFlag) {
            System.out.println(" Không tìm thấy sp này ");
        }
    }
}
