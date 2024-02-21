package DSA.Basics;

public class Test07_WideningTypeCasting {
    public static void main (String []args)
    {
 /*
type casting is a method that converts a data types into another data type,
----------->>>>----------Narrowing type casting--------------->>>>>>
byte -> short -> char -> int -> long -> float -> double
<<<---------------<<-----Widening type casting-----------------<<----

Widening type Casting : it converts a lower data type into a higher one. It is implicit
conversion and casting down. Automatically done by compiler.
both data types must be compatible with each other ad the target type must
larger than the source data type.
*/
        int a=10;
        long b=a;
        float c=b;
        System.out.println("Before conversion, int value "+a);
        System.out.println("After conversion, long value "+b);
        System.out.println("After conversion, float value "+c);
    }
}
