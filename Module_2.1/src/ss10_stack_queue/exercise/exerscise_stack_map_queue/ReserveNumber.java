package ss10_stack_queue.exercise.exerscise_stack_map_queue;

import java.util.Scanner;
import java.util.Stack;

public class ReserveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter number
        Stack<Integer> stackNumber = new Stack<>();
        System.out.print("Enter size : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            stackNumber.push(scanner.nextInt());
        }
        scanner.nextLine();

        // Enter String
        Stack<String> stringStack = new Stack<>();
        System.out.println("Enter String : ");
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            stringStack.push(s.charAt(i) + "");
        }

        // output Number
        System.out.print("Input Integer : " + stackNumber);
        System.out.print(" => output reserve : ");
        while (!stackNumber.isEmpty()) {
            System.out.print(stackNumber.pop() + " ");
        }
        System.out.println();

        // output string
        System.out.print("Input String : " + stringStack);
        System.out.print(" => output reserve : ");
        while (!stringStack.isEmpty()) {
            System.out.print(stringStack.pop());
        }
    }
}
