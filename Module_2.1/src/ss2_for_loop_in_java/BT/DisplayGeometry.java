package ss2_for_loop_in_java.BT;

import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1. Vẽ Hình Chữ Nhật Rỗng ");
            System.out.println("2. Vẽ Hình Chữ Nhật Kín ");
            System.out.println("3. Vẽ Hình Tam Giác Vuông Góc Vuông Ở Trên ");
            System.out.println("4. Vẽ Hình Tam Giác Vuông Góc Vuông Ở Dưới");
            System.out.println("0. Thoát Chương Trình");
            System.out.println("Xin mời lựa chọn ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Bạn đã chọn vẽ hình chữ nhật rỗng ");
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 7; j++) {
                            if (i == 0 || i == 6 || j == 0 || j == 6) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Bạn đã chọn vẽ hình chữ nhật kín ");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Bạn đã chọn vẽ hình tam giác vuông góc vuông ở trên ");
                    for (int i = 4; i >= 0; i--) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;

                case 4:
                    System.out.println("Bạn đã chọn vẽ hình tam giác vuông góc vuông ở dưới ");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.out.println("Bạn đã chọn thoát chương trình");
                    System.exit(0);
                default:
                    System.out.println("Ko có trong danh sách ! vui lòng chọn lựa lại");
            }
        }

    }
}
