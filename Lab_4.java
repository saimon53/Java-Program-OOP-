import java.util.Scanner;

class Result {
    double num1;
    double num2;
    double num3;
    double totalNum;

    Result(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    void totalResult() {
        totalNum = num1 + num2 + num3;
        System.out.println("Total: " + totalNum);

        if (totalNum > 80) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}

public class Lab_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        Result result = new Result(num1, num2, num3);
        result.totalResult();
    }
}
