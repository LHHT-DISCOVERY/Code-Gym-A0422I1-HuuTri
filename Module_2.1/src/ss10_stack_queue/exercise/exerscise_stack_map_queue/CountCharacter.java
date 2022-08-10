package ss10_stack_queue.exercise.exerscise_stack_map_queue;

import java.util.*;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter String : ");
        String s = scanner.nextLine().trim();
        System.out.println("Input : " + s);

        // Map<Key , value>
        Map<Character, Integer> map = new HashMap<>();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                if (!map.containsKey(s.charAt(i))) {
                    // put(key = Char from s , value = ++count )
                    map.put(s.charAt(i), ++count);
                } else {
                    // value = Lấy giá trị tại vị trí i + ++count
                    // vì get sẽ lấy Object key và trả về value và sau đó ++count
                    map.put(s.charAt(i), map.get(s.charAt(i)) + ++count);
                }
            }
        }

        // Output
        System.out.println("Output : ");
        Set<Map.Entry<Character, Integer>> mapSet = map.entrySet();
        for (Map.Entry<Character, Integer> entry : mapSet) {
            System.out.println("Character " + entry.getKey() + " : " + entry.getValue());
        }
    }
}
