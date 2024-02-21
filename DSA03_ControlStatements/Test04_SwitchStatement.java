package DSA03_ControlStatements;
import java.util.*;

public class Test04_SwitchStatement {
    public static void main (String[]args)
    {
/*
Switch Statement- It executes one statement from multiple conditions.
Syntax:
switch(expression){
case value1:
//code to be executed
break;
case value2:
//code to be executed
break;
case value3:
//code to be executed
break;
.......
default:
 */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the day of week : ");
        int day=sc.nextInt();

        switch (day){
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4 : System.out.println("Thursday");
            break;
            case 5 : System.out.println("Friday");
            break;
            case 6 : System.out.println("Saturday");
            break;
            case 7 : System.out.println("Sunday");
            break;

            default:System.out.println("There are only seven days in a week");
        }
    }
}
