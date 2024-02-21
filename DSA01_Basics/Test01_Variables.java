package DSA.Basics;

public class Test01_Variables {
    public static void main (String[]args)
    {
/* Variable is a container which hold the values while the java program is executed.
 it of three types: local,instance and static
 LOCAL : it is declared inside the body of method. it can be used only within that method.
 INSTANCE : it is declared inside the class but outside the body of method. it is specific to instance and can not be shared among instancess.
 STATIC: It is declared as static.It can not be local. A single copy of this can be created and shared amont other instance.
Memory allocation for static variable happens only once when the class is loaded in memory.
*/
        int a=10;
        int b=5;
        int c=a+b;
        String ab= "Sandeep";
        System.out.println("Sum of both the number is : "+c);
        System.out.print(ab);
    }
}
