import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();

        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 28);

        System.out.println("Alice's age: " + ageMap.get("Alice"));
        System.out.println("Bob's age: " + ageMap.get("Bob"));
        System.out.println("Charlie exists: " + ageMap.containsKey("Charlie"));
    }
}
