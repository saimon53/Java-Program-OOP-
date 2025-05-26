import java.util.HashMap;

public class HashMapKeySetExample {
    /**
     * This program demonstrates how to use the keySet() method of a HashMap
     * to iterate over the keys and retrieve corresponding values.
     */
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("USA", "Washington");
        capitals.put("UK", "London");
        capitals.put("India", "New Delhi");

        for (String country : capitals.keySet()) {
            String city = capitals.get(country);
            System.out.println(country + " → " + city);
        }
    }
}
