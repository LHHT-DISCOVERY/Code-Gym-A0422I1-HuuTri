package ss12_java_collection_famework.practice;

import java.util.*;

public class HashMapLinkedHashMapTreeMap {
    public static void main(String[] args) {
        Map<String , Integer> hashMap = new HashMap<>();
        hashMap.put("ATRÍ" , 21);
        hashMap.put("TOÀN" , 21);
        hashMap.put("ASANG" , 1);
        hashMap.put("ASIẾU" , 20);

        System.out.println("Display entries in Hash Map ");
        System.out.println(hashMap +"\n");

        System.out.println("-----------------------------------");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("display entries in ascending order of key : ");
        System.out.println(treeMap);
        System.out.println("-----------------------------------");

        Map<String , Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));

        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("John", 30);
        customers.put("Mike", 28);
        customers.put("Bill", 32);
        customers.put("Maria", 27);

        Set<Map.Entry<String, Integer>> keys = customers.entrySet();
        for (Map.Entry<String, Integer> key: keys){
            System.out.println("Key: " + key.getKey()+ ": " + key.getValue());
        }

    }
}
