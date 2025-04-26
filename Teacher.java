public class Teacher {
    private float number1;
    private float number2;

    // Constructor//used to initialize the two numbers 
    public Teacher(float num1, float num2) {
        number1 = num1;
        number2 = num2;
    }

    // Private method to add numbers//private method that performs the addition of the two numbers
    private float addNumbers() {
        return number1 + number2;
    }

    /*  Public method to display the result//public method that calls the addNumbers method
     and then prints the result */
    public void displayResult() {
        float result = addNumbers();
        System.out.println("The sum of two numbers is: " + result);
    }

    // Main method// entry point of any Java program
    public static void main(String[] args) {
        Teacher sum = new Teacher(4.0f, 3.9f);//using my roll no
        sum.displayResult();
    }
}