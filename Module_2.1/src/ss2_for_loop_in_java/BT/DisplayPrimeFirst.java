package ss2_for_loop_in_java.BT;

public class DisplayPrimeFirst {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        while (count < 20) {
            boolean isFlag = true;
            if (number == 2) {
                System.out.println(number);
                count++;
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isFlag = false;
                        break;
                    }
                }
                if (isFlag == true) {
                    System.out.println(number);
                    count++;
                } else {
                    isFlag = true;
                }
            }
            number ++ ;
        }
    }
}
