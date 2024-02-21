package DSA03_ControlStatements;

public class Test02_If_else_if {
    public static void main (String []args)
    {
/*
It is chain of if-else statement. The program may enter in the block of code where
the condition is true.
SYNTAX :
if(condition1) {
statement1; //executed if condition 1 is true
}else if (condition2){
statement2; //executed if condition 2 is true
} else {
statement3; //executed when all the condition are false
}
 */
        String city="Mumbai";
        if (city == "New Delhi") {
            System.out.println("Current Capital of India :"+(city) );
        } else if(city=="Kolkata"){
            System.out.println("Previous Capital of India :"+(city));
        } else {
            System.out.println("Not a capital city :" +(city));
        }
    }
}
