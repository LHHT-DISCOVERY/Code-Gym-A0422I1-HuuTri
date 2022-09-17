package controller;

import model.SPNhapKhau;
import model.SPXuatKhau;
import model.SanPham;
import service.SPNhapKhauImp;
import service.SPXuatKhauImp;
import write_file.WriteFile;

import java.util.List;
import java.util.Scanner;

public class Controller {
    public static final String DATA_DATA_NK = "src\\data\\data_spnk.csv";
    SPNhapKhauImp nhapKhauImp = new SPNhapKhauImp();
    SPXuatKhauImp xuatKhauImp = new SPXuatKhauImp();
    Scanner scanner = new Scanner(System.in);
    int select = 0;

    public void displayMenu() {
        do {
            System.out.println("Chọn chức năng theo số (để tiếp tục ): ");
            System.out.println("1. Thêm mới \n" +
                    "2. Xóa\n" +
                    "3. xem danh sách sản phẩm\n" +
                    "4. tìm kiếm\n" +
                    "5. thoát");
            System.out.println("vui òng nhập sự lựa chọn của bạn : ");
            select = Integer.parseInt(scanner.nextLine());

            switch (select) {
                case 1:
                    selectAddSP();
                    break;
                case 2:
                    selectRemoveSP();
                    break;
                case 3:
                    selectDisplaySP();
                    break;
                case 4:
                    selectSearchSP();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("vui lòng nhâp đúng số trong menu");
            }

        } while (select != 5);
    }

    public void selectAddSP() {
        do {
            System.out.println("vui lòng chọn");
            System.out.println("1. thêm sản phẩn nhập khẩu ");
            System.out.println("2. thêm sản phẩm xuất khẩu ");
            System.out.println("9. để quay lại menu chính ");
            System.out.println("nhập vào sự lựa chọn của bạn ");
            select = Integer.parseInt( scanner.nextLine());
            switch (select) {
                case 1:
                    nhapKhauImp.add();
                    break;
                case 2:
                    xuatKhauImp.add();
                case 9:
                    return;
                default:
                    System.out.println("Không có lựa chọn này ");
            }
        } while (true);
    }

    public void selectDisplaySP() {
        do {
            System.out.println("vui lòng chọn");
            System.out.println("1. xem sản phẩn nhập khẩu ");
            System.out.println("2. xem sản phẩm xuất khẩu ");
            System.out.println("9. để quay lại menu chính ");
            System.out.println("nhập vào sự lựa chọn của bạn ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    nhapKhauImp.display();
//                    List<SPNhapKhau> r = WriteFile.readFileSPNhapKhau(DATA_DATA_NK);
//                    r.forEach(System.out::println);
                    break;
                case 2:
                    xuatKhauImp.display();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Không có lựa chọn này ");
            }
        } while (true);
    }

    public void selectSearchSP() {
        do {
            System.out.println("vui lòng chọn");
            System.out.println("1. tìm kiếm sản phẩn nhập khẩu ");
            System.out.println("2. tìm sản phẩm xuất khẩu ");
            System.out.println("9. để quay lại menu chính ");
            System.out.println("nhập vào sự lựa chọn của bạn ");
            select =Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    System.out.print(" Nhập mã sp  : ");
                    String name = scanner.nextLine().trim();
                    System.out.println(" Kết quả tìm kiếm ");
                    nhapKhauImp.search(name);
                    break;
                case 2:
                    System.out.print(" Nhập mã sp  : ");
                    String name2 = scanner.nextLine().trim();
                    System.out.println(" Kết quả tìm kiếm ");
                    nhapKhauImp.search(name2);
                case 9:
                    return;
                default:
                    System.out.println("Không có lựa chọn này ");
            }
        } while (true);
    }

    public void selectRemoveSP() {
        do {
            System.out.println("vui lòng chọn");
            System.out.println("1. remove sản phẩn nhập khẩu ");
            System.out.println("2. remove sản phẩm xuất khẩu ");
            System.out.println("9.  quay lại menu chính ");
            System.out.println("nhập sự lựa chọn của bạn ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    System.out.print(" Nhập mã sp : ");
                    String maSP = scanner.nextLine().trim();
                    SPNhapKhau spNhapKhau = new SPNhapKhau(maSP);
                    nhapKhauImp.remove(spNhapKhau);

                    break;
                case 2:
                    System.out.print(" Nhập mã sp : ");
                    String maSP1 = scanner.nextLine().trim();
                    SPXuatKhau spXuatKhau = new SPXuatKhau(maSP1);
                    xuatKhauImp.remove(spXuatKhau);
                case 9:
                    return;
                default:
                    System.out.println("Không có lựa chọn này ");
            }
        } while (true);
    }
}
