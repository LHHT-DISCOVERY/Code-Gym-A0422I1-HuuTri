package ss10_stack_queue.exercise.resever_number;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Number : ");
        int number = scanner.nextInt();

        System.out.print("Input : " + number);
        while (number > 0) {
            int x = number % 2;
            integerStack.push(x);
            number = number / 2;
        }
        System.out.print(" => output : ");
        while (!integerStack.isEmpty()) {
            System.out.print(integerStack.pop());
        }
    }
}
