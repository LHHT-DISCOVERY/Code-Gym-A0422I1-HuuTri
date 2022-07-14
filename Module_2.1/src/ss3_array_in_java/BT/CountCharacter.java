package ss3_array_in_java.BT;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        String name = "LyHUyYNHHUUTRIii";
        Scanner scanner = new Scanner(System.in);
        // kiểm tra kiểu dữ liệu mà ta lấy từ chuỗi
        // syntax : ((Object)NameValue).getClass().getSimpleName()
        System.out.println(((Object) name.charAt(0)).getClass().getSimpleName());
        System.out.println(((Object) name).getClass().getSimpleName());
        System.out.print("Nhập vào kí tự cần tìm kiếm (có phân biệt chữ hoa với chữ thường): ");
        char input = scanner.next().charAt(0);
        int count = 0;
        boolean isFlag = false;
        for (int i = 0; i < name.length(); i++) {
            if (input == (name.charAt(i))) {
                count++;
                isFlag = true;
            }
        }
        if (!isFlag) {
            System.out.println("Không có kí tự " + " '" + input + "' " + " nào");
        } else {
            System.out.println(" Kí tự " + " '" + input + "' " + " xuất hiện " + count + " lần");
        }
    }
}
