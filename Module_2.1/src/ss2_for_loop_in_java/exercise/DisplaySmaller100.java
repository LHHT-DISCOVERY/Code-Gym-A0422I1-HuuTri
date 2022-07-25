package ss2_for_loop_in_java.exercise;

public class DisplaySmaller100 {
    public static void main(String[] args) {
        int number = 2;
        while (true) {
            boolean isFlag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag) {
                System.out.println(number);
            } else {
                isFlag = true;
            }
            number++;
            if (number > 100) {
                break;
            }
        }
    }
}
