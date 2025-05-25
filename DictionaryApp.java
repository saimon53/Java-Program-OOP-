import java.util.ArrayList;
import java.util.Scanner;

class DictionaryEntry {
    String word;
    String meaning;

    DictionaryEntry(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        return word + ": " + meaning;
    }
}

public class DictionaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DictionaryEntry> dictionary = new ArrayList<>();

        System.out.println("=== Dictionary Entry Program ===");
        String choice;

        do {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            System.out.print("Enter its meaning: ");
            String meaning = scanner.nextLine();

            dictionary.add(new DictionaryEntry(word, meaning));

            System.out.print("Do you want to add another word? (yes/no): ");
            choice = scanner.nextLine().trim().toLowerCase();
        } while (choice.equals("yes"));

        System.out.println("\n--- Dictionary Contents ---");
        for (DictionaryEntry entry : dictionary) {
            System.out.println(entry);
        }

        scanner.close();
    }
}

