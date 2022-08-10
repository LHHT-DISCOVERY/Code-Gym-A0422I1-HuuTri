package ss10_stack_queue.exercise.exerscise_stack_map_queue;

import sun.security.mscapi.CPublicKey;

import java.util.Scanner;
import java.util.Stack;

public class BracketStack {
    // methodCheck Bracket
    public static boolean CheckUsedBracket(String input) {
        Stack<String> bStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char sym = input.charAt(i);
            if (sym == '(') {
                bStack.push(input.charAt(i) + "");
            }
            if (sym == ')') {
                if (bStack.isEmpty()) {
                    return false;
                }
                bStack.pop();
            }
        }
        return bStack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter input
        System.out.print("Enter : ");
        String input = scanner.nextLine().trim();

        // Output
        System.out.println("=> Output : " + CheckUsedBracket(input));
    }
}
