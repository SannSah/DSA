package DSA03_ControlStatements;

public class Test06_ForLoop
{
    public static void main(String[] args)
    {
/*
For loop is used to iterate a part of the program several times. If the number of iteration is fixed.
Then it is best to use the for loop.
Syntax:-
        for (initialization;condition;increment/decrement)
        {
        Statement to be executed;
        }
1) Initialization - It is the initial condition which is executed once when the loop starts.
Here, We can initialize the variable, or we can use an already initialized variable.
It is optional condition.

2) Condition - It is executed each time to test the condition of the loop. It continues
execution until the condition is false. It must return boolean value either T or F.
it is also optional condition.

3) Increment/Decrement - It increment or decrements the variable value. It is optional condition.
 */
        //code to print the table of 1
        for (int i=1; i<=5;i++)
        {
            System.out.println(i);
        }
    }

}

