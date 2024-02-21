package DSA02_Operators;
import java.util.*;

public class Test06_TernaryOperators {
    public static void main(String []args)
    {
 /*
 It consists of three parts. The ternary (?:) consists of three operands.
 it can be used instead of if-else statement. It makes the mode much more easy,readable and shorter
 Syntax: variable=(condition)?expression1(executed in case of true):expression2(executed in case of false)
  */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        int Greater=(a>b)?a:b;

        System.out.println("The greatest of two number is : " +Greater);
    }
}
