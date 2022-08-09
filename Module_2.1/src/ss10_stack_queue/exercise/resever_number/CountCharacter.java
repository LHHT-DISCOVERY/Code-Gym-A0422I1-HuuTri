package ss10_stack_queue.exercise.resever_number;

import java.util.*;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = scanner.nextLine();
        System.out.println("Input : " + s);

        // Map<Key , value>
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            if (!map.containsKey(s.charAt(i))) {
                // put(key = Char from s , value = ++count )
                map.put(s.charAt(i), ++count);
            } else {
                // value = Lấy giá trị tại vị trí i + ++count
                // vì get sẽ lấy Object key và trả về value và sau đó ++count
                map.put(s.charAt(i), map.get(s.charAt(i)) + ++count);
            }
        }
        System.out.println("Output : ");
        Set<Map.Entry<Character, Integer>> mapSet = map.entrySet();
        for (Map.Entry<Character, Integer> entry : mapSet) {
            System.out.println("Character " + entry.getKey() + " : " + entry.getValue());
        }
    }
}
