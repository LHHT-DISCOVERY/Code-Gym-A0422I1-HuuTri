package ss2_for_loop_in_java.BT;

public class DisplaySmaller100 {
    public static void main(String[] args) {
        int number = 2;
        while (true) {
            boolean isFlag = true;
            if (number == 2) {
                System.out.println(number);
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isFlag = false;
                        break;
                    }
                }
                if (isFlag == true) {
                    System.out.println(number);
                } else {
                    isFlag = true;
                }
            }
            number++;
            if (number > 100) {
                break;
            }
        }
    }
}
