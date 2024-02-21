package DSA03_ControlStatements;
import java.util.*;

public class Test01_If_Else {
    public static void main (String []args)
    {
/*
If-Else statement is executed if the condition of the if block is evaluated as false.
Syntax-
        if(condition){
        statement 1; // for true condition
        }else{
        statement 2; // for false condition
        }
 */
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the first number :");
        int a=sc.nextInt();
        System.out.println("Enter the first number :");
        int b=sc.nextInt();

        if(a>b) {
            System.out.println("A is greater than B");
        } else {
            System.out.println("B is greater than A");
        }
    }
}
