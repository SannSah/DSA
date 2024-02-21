package DSA.Basics;

public class Test03_DataTypes {
    public static void main (String [] args)
    {
/*Data types specify different size and values that can be stored in the variable.
 There are two type of data type in java
 PRIMITIVE and NON-PRIMITIVE Data types*/

        int a=15;
// int takes 4 bytes and it can store numbers from -2*31 to 2*31-1
        System.out.println(a);

        boolean b=true;
// boolean can store only T and F value and it takes space of 1 bit
        System.out.println(b);
        byte c=1;
//  byte can take space of 1 bytes

        System.out.println(c);
        short d=23;
// Short can take space of 2 bytes
        System.out.println(d);
        String e="Sandeep";
        System.out.println(e);
        char f= 'a';
        System.out.println(f);
    }
}
/*similarly there are more data types in java like float for decimal values,
long for large numbers, double for very large numbers, etc
byte-1 byte, short-2 bytes, char-2 bytes, boolean-1 bytes,
int-4 bytes, long-8bytes, float-4 bytes, double-8 bytes*/