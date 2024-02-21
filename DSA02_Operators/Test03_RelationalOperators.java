package DSA.Operators;

public class Test03_RelationalOperators {
    public static void main (String []args)
    {
/*
Relational operators are used to compare and to check the equality of operands.
==,!=,<<,>>,>=.=< etc
 */
        int a=12;   int b=12;
        int c=15;   int d=15;
        int e=20;   int f=40;
        System.out.println(a==b); //true
        System.out.println(b!=c); //true
        System.out.println(e>f); //false
        System.out.println(c<a); //false
    }
}
