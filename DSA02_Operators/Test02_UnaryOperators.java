package DSA.Operators;

public class Test02_UnaryOperators {
    public static void main(String[]args)
    {
 /*
 Unary operators requires only one operand. it is used incrementing (++) and decrementing (--).
 negating and also for inverting the value of boolean.
 pre-increment(++a) : first increase the value and then use.
 post-increment(a++) : use the value and then increase the value.
 pre-decrement(--a) : decrease the value and then use
 post-decrement(a--) : use the value then decrease the value.
  */
    int a=10;
    int b=15;
        System.out.println("Pre-incremented value :"+(++a)); //it will increase the value to 11 and then print
        System.out.println("Pre-incremented value :"+(a++)); //it will print the value as 11 from above but will be stored as 12
        System.out.println("Pre-decremented value :"+(--a)); // It will decrement to 11 and then print
        System.out.println("Post-decremented value :"+(a--)); //it will print as 11 but will b stored as 10

        System.out.println("Post-incremented value :"+(b++)); // print 15 and update to 16
        System.out.println("Pre-incremented value :"+(++b)); //print 17 and update to 17
        System.out.println("Post-decremented value :"+(b--)); // print 17 but update to 16
        System.out.println("Pre-decremented value :"+(--b));// print 15 but update to 15
    }
}
