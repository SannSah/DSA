package DSA.Operators;

public class Test04_LogicalOperators {
    public static void main (String[]args)
    {
/*
Logical AND (&&) - It only returns true when both the statements
are TRUE. Else it will return false
Example:
Ans ----- St_1-------St_2
T           T        T
F           T        F
F           F        T
F           F        F

Logical OR (||) - It will return false only if both the statements are false.
Else it will return True.
Example -
Ans ----- St_1-------St_2
T           T        T
T           T        F
T           F        T
F           F        F
 */
        int a = 12;
        int b = 10;
        int c=98;
        System.out.println(a<b&&a<c); //False Logical AND
        System.out.println(a>b||b<c);//True Logical OR
        System.out.println(!(a<c)); //It changes TRUE to FALSE and FALSE to TRUE
    }
}

