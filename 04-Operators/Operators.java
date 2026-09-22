import java.util.Scanner;
public class Operators {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();
        System.out.printf("Sum: %d%n", a + b);
        System.out.printf("Subtraction: %d%n", a - b);
        System.out.printf("Product: %d%n", a * b);
        System.out.printf("Quotient: %d%n", a / b);
        System.out.printf("Remainder: %d%n", a % b);
    }
}
