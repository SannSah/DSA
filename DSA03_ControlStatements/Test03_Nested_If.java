package DSA03_ControlStatements;
import java.util.Scanner;

public class Test03_Nested_If {
    public static void main (String [] args)
    {
 /*
 Nested if- it can contain a if or if-else statement inside another if or else if statements.
 Syntax:
 if (condition1){
 statement1;
 }else if (condition2){
 statement2;
 }else if(condition3){
 statement3;
 }
 }else{
 statement4;
 }
  */
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter English Marks :");
        float english=sc.nextFloat();
        System.out.println("Enter Hindi Marks :");
        float hindi=sc.nextFloat();
        System.out.println("Enter Maths Marks :");
        float math=sc.nextFloat();
        System.out.println("Enter Science Marks :");
        float science=sc.nextFloat();
        System.out.println("Enter S.st. Marks :");
        float sst=sc.nextFloat();

        float total= english+hindi+math+science+sst;
        float percentage=(total/500)*100;

        if (percentage>=90){
            System.out.println("First Ranking :"+(total) +"Marks");
            System.out.println("Total Percentage :" +(percentage) +"%");

        }else if (percentage>=70) {
            System.out.println("Second Ranking :" + (total) + "Marks");
            System.out.println("Total Percentage :" + (percentage) + "%");
        }else if (percentage>=50) {
            System.out.println("Third Ranking :" + (total) + "Marks");
            System.out.println("Total Percentage :" + (percentage) + "%");
        }else if (percentage>=33) {
            System.out.println("Passed:" + (total) + "Marks");
            System.out.println("Total Percentage :" + (percentage) + "%");
        }else{
            System.out.println("FAILED :" + (total) + "Marks");
            System.out.println("Total Percentage :" + (percentage) + "%");
        }
    }
}
