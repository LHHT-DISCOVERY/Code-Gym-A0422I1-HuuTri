package ss3_array_in_java.TH;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        String inputName;
        boolean isFag = false;
        System.out.println("Nhập tên học sinh bạn muốn tìm kiếm : ");
        inputName = scanner.nextLine();
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println(inputName + " Có nằm trong danh sách ");
                isFag = true;
                break;
            }
        }
        if (!isFag) {
            System.out.println(inputName + " Không có nằm trong danh sách ");

        }
    }
}
