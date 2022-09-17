package controller;

import model.SoTietKiemNganHan;
import model.service.ListSoTietKiem;
import write_file.WriteFile;

import java.util.List;
import java.util.Scanner;

public class ControllerBank {
    public static final String DATA_DATA_SO_TIET_KIEM = "src\\data\\data_employee.csv";
    ListSoTietKiem listSoTietKiem = new ListSoTietKiem();
    Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        int select = 0;
        do {
            System.out.println("- Chương Trình Quản Lý Sổ Tiết Kiệm - ");
            System.out.println("1. Thêm mới số tiết kiệm \n" +
                    "2. Xóa sổ tiết kiệm\n" +
                    "3. Xem danh sách sổ tiếc kiệm \n" +
                    "4. Thoát");
            System.out.println("Enter select : ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    listSoTietKiem.add();
                    break;
                case 2:
                    System.out.println("Nhập vào mã sổ tiết kiệm cần xóa : ");
                    String maSo = scanner.nextLine().trim();
                    SoTietKiemNganHan MSTK = new SoTietKiemNganHan(maSo);
                    listSoTietKiem.remove(MSTK);
                    if (!listSoTietKiem.remove(MSTK)) {
                        System.out.println("Ko tìm thấy mSTK trong hệ thống ");
                        System.out.println(" ------ Danh sách mã số tài khoản trong hệ thống là  ----");
                        listSoTietKiem.display();
                    }
                    listSoTietKiem.ghiFile();
                    System.out.println("Xóa thành công đối tượng ");
                    listSoTietKiem.display();
                    break;
                case 3:
                    System.out.println("Dữ liệu mới thêm vào ");
                    listSoTietKiem.display();
                    System.out.println("-----------Dữ Liệu Đã đc cập nhật với dữ liệu CÓ Trước ĐÓ-------------");
                    List<SoTietKiemNganHan> r = WriteFile.readFileSoTietKiem(DATA_DATA_SO_TIET_KIEM);
                    r.forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("End");
                    System.exit(0);
                default:
                    System.out.println(" VUi lòng nhập lại! ");
            }

        } while (select != 4);
    }
}
