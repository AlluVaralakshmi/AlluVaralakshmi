import java.util.Scanner;
class Calculator {
    public static double operation(double a, double b, String s) {
        switch (s) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if(b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN;
                }
                return a / b;
            default:
                System.out.println("Invalid operation! Please use +, -, *, /");
                return Double.NaN; 
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a value: ");
        double a = sc.nextDouble();
        System.out.print("Please enter b value: ");
        double b = sc.nextDouble();
        System.out.print("Please enter the operation to perform (+, -, *, /): ");
        String s = sc.next();
        double result = operation(a, b, s);
   
        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }
    }
}
