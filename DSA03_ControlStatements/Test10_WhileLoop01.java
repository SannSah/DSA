package DSA03_ControlStatements;
import java.util.Scanner;

public class Test10_WhileLoop01 {
    public static void main(String[] args) {
        //Print fibonacci number
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n= sc.nextInt();

        int a= 0;
        int b= 1;
        int c=2;

        while(c<=n){
            int temp=b;
            b=b+a;
            a=temp;
            c++;
        }
        System.out.println(b);
    }
}
