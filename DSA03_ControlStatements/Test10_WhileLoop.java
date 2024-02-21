package DSA03_ControlStatements;
import java.util.Scanner;

public class Test10_WhileLoop {
    public static void main(String[] args) {
/*
The java while loop is used to iterate a part of the program repeatedly until
the specified boolean condition is True.
The while loop is considered as a repeating if statement. If the number of
iteration is not fixed, it is recommended to use the while loop.
Syntax - while (condition) {
            //code to executed
         increment/decrement statement;
         }

FLOW-     TRUE <-- CONDITION --> FALSE --> TERMINATE
            \         /
             STATEMENT
 */
        //code to print first 10 natural number
//        Scanner sc= new Scanner(System.in);
//        int a=sc.nextInt();
        int a=1;
        while (a<=10) {
            System.out.println(a);
            a++;
        }
    }
}
