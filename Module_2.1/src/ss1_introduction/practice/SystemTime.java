package ss1_introduction.practice;

import java.util.Date;

public class Algorithms {
    public static int tinhchuso(int  a) {
        int kq = a ;
        int biendem = 0 ;
        while (kq !=0){
            kq = a/10;
             a = kq ;
             biendem++;
        }
         return biendem;
    }
    public static void main(String[] args) {
        
    }
}
