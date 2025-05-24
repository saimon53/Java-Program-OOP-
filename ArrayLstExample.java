import java.util.ArrayList;

 public class ArrayLstExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(); // 1. Create a dynamic list

        names.add("Rahim");   // 2. Add elements
        names.add("Karim");
        names.add("Jabbar");
 names.add("saimon");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i)); // 3. Access each element
        }
    }
} 
    

