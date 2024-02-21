package DSA.Basics;
import java.util.*; // it is a package(util) which is being used for using scanner class

public class Test04_Input {
    public static void main (String []args)
    {
        Scanner sc= new Scanner (System.in);
        int a=sc.nextInt(); //It will fetch input value from the user using scanner class
        System.out.print(a); //this will help in printing the inputted value again
    }
}
/*
The scanner class is used to get user input and it is found in the java.util.package
nextBoolean is used to read boolean data type
nextByte for byte
nextDouble for double data type
nextFloat for float values
nextInt for integers
nextLine/next(next: for one word it will terminate at space) for strings
nextLong for long data types
nextShort for short data types
 */