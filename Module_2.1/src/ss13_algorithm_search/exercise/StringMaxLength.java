package ss13_algorithm_search.exercise;
import java.util.LinkedList;
import java.util.Scanner;

public class StringMaxLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();

        System.out.print("Enter String : ");
        String string = input.nextLine();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
