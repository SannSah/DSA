package DSA.Basics;

public class Test08_NarrowingTypeCasting {
    public static void main(String []args)
    {
/*
Narrowing Type Casting : it converts a higher data type into a lower data type.
it is also known as explicit conversion or casting up. It is done manually by programmer.
 */
        double a=155.55;
        long b=(long)a;
        int c=(int)b;
        System.out.println("Before conversion, double value "+a);
        System.out.println("Before conversion, long value "+b);
        System.out.println("Before conversion, integer value "+c);
    }
}
