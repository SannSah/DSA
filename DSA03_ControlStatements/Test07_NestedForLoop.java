package DSA03_ControlStatements;

public class Test07_NestedForLoop {
    public static void main(String[] args) {
/*
we can use a for loop in another for loop using nested loop. The inner loop executes completely
whenever outer loop executes.
Syntax -
        for (initialize i, condition for i; increment/decrement)
        {
            for (initialize j, condition for j; increment/decrement)
            {
            System.out.println(statement);
            } //end of i
        } //end of j
 */
        for (int i=1;i<=6;i++)
        {
            for (int j=1;j<=2;j++)
            {
                System.out.println(i+ " --> " +j);
            }
        }
    }
}
