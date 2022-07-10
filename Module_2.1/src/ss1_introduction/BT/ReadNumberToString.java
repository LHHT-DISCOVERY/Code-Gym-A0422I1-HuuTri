//package ss1_introduction.BT;
//
//import java.util.Scanner;
//
//public class ReadNumberToString {
//    public static void main(String[] args) {
//        int a ;
//        String[] b = {};
//        System.out.println(b.length);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào dãy số : ");
//        a = scanner.nextInt();
//        for(;a!=0 ; a = a/10){
//            int s = a%10 ;
//            String ss = String.valueOf(s);
//            b.add(ss);
//        }
//        for(int i = b.length-1 ; i >= 0 ; i--){
//            switch (b[i]){
//                case "0" :
//                    System.out.print("Không ");
//                    break;
//                case "1" :
//                    System.out.print("Một ");
//                    break;
//                case "2" :
//                    System.out.print("Hai ");
//                    break;
//                case "3" :
//                    System.out.print("Ba ");
//                    break;
//                case "4" :
//                    System.out.print("Bốn ");
//                    break;
//                case "5" :
//                    System.out.print("Năm ");
//                    break;
//                case "6" :
//                    System.out.print("Sáu ");
//                    break;
//                case "7" :
//                    System.out.print("Bảy ");
//                    break;
//                case "8" :
//                    System.out.print("Tám ");
//                    break;
//                case "9" :
//                    System.out.print("Chín ");
//
//            }
//        }
//    }
//}
