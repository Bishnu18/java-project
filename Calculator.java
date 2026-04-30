public class Calculator {
    public static void main(String[] args) {

        double num1 = 10;
        double num2 = 6;

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}
