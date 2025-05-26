import java.util.HashMap;

public class HashMapExampleCheekandRemove {
    /**
     * This is a simple example of using a HashMap in Java.
     * It creates a HashMap to store names and their corresponding ages,
     * and then retrieves and prints the age of a specific person.
     */
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("Rahim", 85);
        scores.put("Karim", 90);

        // Check existence
        if (scores.containsKey("Karim")) {
            System.out.println("Karim exists.");
        }

        // Remove Karim
        scores.remove("Karim");

        System.out.println("After removing Karim: " + scores);
    }
}
