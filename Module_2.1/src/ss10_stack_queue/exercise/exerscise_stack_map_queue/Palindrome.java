package ss10_stack_queue.exercise.exerscise_stack_map_queue;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String to be check : ");
        String stringCheck = scanner.nextLine().trim();

        // Offer reverse String
        Deque<String> stringQueue = new ArrayDeque<>();
        for (int i = 0; i < stringCheck.length(); i++) {
            stringQueue.offerFirst(stringCheck.charAt(i) + "");
        }
        // or use Queue  => for(i = stringQueue.length() ; i >=0 ; i--)

        // create string reverse then poll() + string reverse
        String reverseString = "";
        while (true) {
            if (stringQueue.isEmpty()) {
                break;
            }
            reverseString += (stringQueue.poll()).toUpperCase();
        }

        // Check Palindrome
        System.out.print("Input : " + stringCheck);
        if (reverseString.equals(stringCheck.toUpperCase())) {
            System.out.println(" => Output : Palindrome ");
        } else {
            System.out.println(" => Output : Not Palindrome");
        }
    }
}
