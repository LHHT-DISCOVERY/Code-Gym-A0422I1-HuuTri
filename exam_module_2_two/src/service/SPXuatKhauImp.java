package service;

import model.SPNhapKhau;
import model.SPXuatKhau;
import write_file.WriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SPXuatKhauImp implements ServiceInterface {
    public static final String DATA_DATA_NK = "src\\data\\data_spxk.csv";
    List<SPXuatKhau> xuatKhauList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Nhập id sản phầm : ");
        String idSP = scanner.nextLine();
        System.out.println("Nhập mã sản phẩm : ");
        String maSP = scanner.nextLine();
        System.out.println("Nhập ten sản phẩm : ");
        String tenSP = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm : ");
        double giaSP = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng sản phẩm : ");
        int soLuongSP = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà Sản xuất : ");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Nhập giá xuất khẩu : ");
        double giaXuatKhau = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập quốc gia nhập khẩu : ");
        String quocGiaNhapSP = scanner.nextLine();
        SPXuatKhau spXuatKhau = new SPXuatKhau(idSP, tenSP, maSP, giaSP, soLuongSP, nhaSanXuat, giaXuatKhau, quocGiaNhapSP);
        xuatKhauList.add(spXuatKhau);

    }

    public boolean remove(SPXuatKhau maSP) {
        return this.xuatKhauList.remove(maSP);
    }
//    public void ghiFile() {
//        WriteFile.writeToFileSPXuatKhau(DATA_DATA_NK,xuatKhauList, true);
//    }

    @Override
    public void display() {
        for (SPXuatKhau spXuatKhau : xuatKhauList
        ) {
            System.out.println(spXuatKhau);
        }
    }

    @Override
    public void search(String name) {
        boolean isFlag = false;
        for (SPXuatKhau spXuatKhau : xuatKhauList
        ) {
            if (spXuatKhau.getMaSP().contains(name)) {
                System.out.println(spXuatKhau);
                isFlag = true;
            }
        }
        if (!isFlag) {
            System.out.println(" Không tìm thấy sp này ");
        }

    }
}
