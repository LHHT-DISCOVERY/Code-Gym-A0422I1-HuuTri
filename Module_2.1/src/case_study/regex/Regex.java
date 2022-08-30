package case_study.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public final static String REGEX_NAME = "^[a-zA-Z ]+$";
    public final static String REGEX_DATE ="^([012][0-9]|3[0-1])/(1[01]|12|0[1-9])/[0-9]{4}$";
    private static Scanner scanner = new Scanner(System.in);
     public String regexName(){
         Pattern pattern = Pattern.compile(REGEX_NAME);
         while(true){
             System.out.print("Enter Name Employee : ");
             String name = scanner.nextLine();
             if(pattern.matcher(name).matches()){
                return name;
             }else {
                 System.out.println("Vui long nhập lại , tên ko chứa dấu và ko chứa số");
             }
         }
     }
     public String regexDate(){
             Pattern pattern1 = Pattern.compile(REGEX_DATE);
             while (true){
                 System.out.print("Enter Date Employee(dd/mm/yyyy) : ");
                 String date = scanner.nextLine();
                 if(pattern1.matcher(date).matches()){
                     return date;
                 }else {
                     System.out.println("Vui lòng nhập đúng forrmat vd: 30/8/2022");
                 }
             }
         }
}
