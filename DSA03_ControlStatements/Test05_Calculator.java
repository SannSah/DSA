package DSA03_ControlStatements;
import java.util.*;

public class Test05_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();
        System.out.println("Choose the operation (+,-,*,/) :");
        char operator = sc.next().charAt(0);

        switch (operator)
        {
                case '+':
                System.out.println("The Sum of a & b is " +(a+b));
                break;
                case '-':
                    System.out.println("The Difference between a & b is " +(a-b));
                break;
                case '*':
                    System.out.println("The Product of a & b is " +(a*b));
                break;
                case '/':
                    System.out.println("The Division of a & b is " +(a/b));
                break;

            default:
                System.out.println("Please valid integer values");
        }
    }
}





