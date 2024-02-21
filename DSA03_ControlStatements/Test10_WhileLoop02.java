package DSA03_ControlStatements;
import java.util.Scanner;

import java.util.Scanner;

public class Test10_WhileLoop02 {
    public static void main(String[] args) {
        //number of occurence of a number
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int n=sc.nextInt();
        int n=456565;
        int count =0;
        while (n>0){
            int rem=n%10;
            if (rem==5){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
