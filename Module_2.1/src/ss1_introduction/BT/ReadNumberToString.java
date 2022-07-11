package ss1_introduction.BT;

import java.util.Scanner;

public class ReadNumberToString {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào dãy số : ");
        a = scanner.nextInt();
        if (0 <= a && a <= 9) {
            switch (a) {
                case 0:
                    System.out.print("Không ");
                    break;
                case 1:
                    System.out.print("Một ");
                    break;
                case 2:
                    System.out.print("Hai ");
                    break;
                case 3:
                    System.out.print("Ba ");
                    break;
                case 4:
                    System.out.print("Bốn ");
                    break;
                case 5:
                    System.out.print("Năm ");
                    break;
                case 6:
                    System.out.print("Sáu ");
                    break;
                case 7:
                    System.out.print("Bảy ");
                    break;
                case 8:
                    System.out.print("Tám ");
                    break;
                case 9:
                    System.out.print("Chín ");
            }
        } else if (a == 100) {
            System.out.println("một trăm");
        } else if (a > 20 && a < 100) {
            int chuc = a / 10;
            if (chuc >= 1) {
                switch (chuc) {
                    case 1:
                        System.out.print("mười ");
                        break;
                    case 2:
                        System.out.print("Hai mươi ");
                        break;
                    case 3:
                        System.out.print("Ba mươi ");
                        break;
                    case 4:
                        System.out.print("Bốn mươi ");
                        break;
                    case 5:
                        System.out.print("Năm mươi ");
                        break;
                    case 6:
                        System.out.print("Sáu mươi ");
                        break;
                    case 7:
                        System.out.print("Bảy mươi ");
                        break;
                    case 8:
                        System.out.print("Tám mươi ");
                        break;
                    case 9:
                        System.out.print("Chín mươi ");
                        break;
                }
                int dv = a % 10;
                if (chuc <= 1) {
                    switch (dv) {
                        case 1:
                            System.out.print("Một ");
                            break;
                        case 2:
                            System.out.print("Hai ");
                            break;
                        case 3:
                            System.out.print("Ba ");
                            break;
                        case 4:
                            System.out.print("Bốn ");
                            break;
                        case 5:
                            System.out.print("Năm ");
                            break;
                        case 6:
                            System.out.print("Sáu ");
                            break;
                        case 7:
                            System.out.print("Bảy ");
                            break;
                        case 8:
                            System.out.print("Tám ");
                            break;
                        case 9:
                            System.out.print("Chín ");
                    }
                } else {
                    switch (dv) {
                        case 1:
                            System.out.print("Mốt ");
                            break;
                        case 2:
                            System.out.print("Hai ");
                            break;
                        case 3:
                            System.out.print("Ba ");
                            break;
                        case 4:
                            System.out.print("Bốn ");
                            break;
                        case 5:
                            System.out.print("Năm ");
                            break;
                        case 6:
                            System.out.print("Sáu ");
                            break;
                        case 7:
                            System.out.print("Bảy ");
                            break;
                        case 8:
                            System.out.print("Tám ");
                            break;
                        case 9:
                            System.out.print("Chín ");
                    }
                }

            }
        } else if (a == 1000) {
            System.out.println("Một nghìn");
        } else if (a < 1000) {
            int tram = a / 100;
            int chuc = (a - tram * 100) / 10;
            int dv = a % 10;
            if (dv == 0 && chuc == 0) {
                switch (tram) {
                    case 1:
                        System.out.print("Một trăm ");
                        break;
                    case 2:
                        System.out.print("Hai trăm ");
                        break;
                    case 3:
                        System.out.print("Ba trăm ");
                        break;
                    case 4:
                        System.out.print("Bốn trăm ");
                        break;
                    case 5:
                        System.out.print("Năm trăm ");
                        break;
                    case 6:
                        System.out.print("Sáu trăm ");
                        break;
                    case 7:
                        System.out.print("Bảy trăm ");
                        break;
                    case 8:
                        System.out.print("Tám trăm ");
                        break;
                    case 9:
                        System.out.print("Chín trăm ");
                }
            } else {
                switch (tram) {
                    case 1:
                        System.out.print("Một trăm ");
                        break;
                    case 2:
                        System.out.print("Hai trăm ");
                        break;
                    case 3:
                        System.out.print("Ba trăm ");
                        break;
                    case 4:
                        System.out.print("Bốn trăm ");
                        break;
                    case 5:
                        System.out.print("Năm trăm ");
                        break;
                    case 6:
                        System.out.print("Sáu trăm ");
                        break;
                    case 7:
                        System.out.print("Bảy trăm ");
                        break;
                    case 8:
                        System.out.print("Tám trăm ");
                        break;
                    case 9:
                        System.out.print("Chín trăm ");
                }
                if (chuc == 0) {
                    System.out.print("lẻ ");
                }
                switch (chuc) {
                    case 1:
                        System.out.print("mười ");
                        break;
                    case 2:
                        System.out.print("Hai mươi ");
                        break;
                    case 3:
                        System.out.print("Ba mươi ");
                        break;
                    case 4:
                        System.out.print("Bốn mươi ");
                        break;
                    case 5:
                        System.out.print("Năm mươi ");
                        break;
                    case 6:
                        System.out.print("Sáu mươi ");
                        break;
                    case 7:
                        System.out.print("Bảy mươi");
                        break;
                    case 8:
                        System.out.print("Tám mươi ");
                        break;
                    case 9:
                        System.out.print("Chín mươi ");
                        break;
                }
                if (chuc <= 1) {
                    switch (dv) {
                        case 1:
                            System.out.print("Một ");
                            break;
                        case 2:
                            System.out.print("Hai ");
                            break;
                        case 3:
                            System.out.print("Ba ");
                            break;
                        case 4:
                            System.out.print("Bốn ");
                            break;
                        case 5:
                            System.out.print("Năm ");
                            break;
                        case 6:
                            System.out.print("Sáu ");
                            break;
                        case 7:
                            System.out.print("Bảy ");
                            break;
                        case 8:
                            System.out.print("Tám ");
                            break;
                        case 9:
                            System.out.print("Chín ");
                    }
                } else {
                    switch (dv) {
                        case 1:
                            System.out.print("Mốt ");
                            break;
                        case 2:
                            System.out.print("Hai ");
                            break;
                        case 3:
                            System.out.print("Ba ");
                            break;
                        case 4:
                            System.out.print("Bốn ");
                            break;
                        case 5:
                            System.out.print("Năm ");
                            break;
                        case 6:
                            System.out.print("Sáu ");
                            break;
                        case 7:
                            System.out.print("Bảy ");
                            break;
                        case 8:
                            System.out.print("Tám ");
                            break;
                        case 9:
                            System.out.print("Chín ");
                    }

                }

            }
        }else {
            System.out.println("Vui lòng nhập các số từ 0-1000");
        }
    }
}
