package DSA.Operators;
import java.util.*;

public class Test01_ArithmeticOperators {
    public static void main(String []args)
    {
/*
Operators are used in java to perform operation like addition, multiplication, subtraction,
subtraction and division in java.
Types of operators in java:
Arithmetic, shift, relational. bitwise, logical, ternary and unary etc
 */
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number :");
        int a= sc.nextInt();
        System.out.println("Enter the second number :");
        int b=sc.nextInt();

        System.out.println("The Sum of both the number is :"+(a+b));
        System.out.println("The Difference of both the number is :"+(a-b));
        System.out.println("The Product of both the number is :"+(a*b));
        System.out.println("The Division of both the number is :"+(a/b));
        System.out.println("The Remainder of both the number is :"+(a%b));
    }
}
