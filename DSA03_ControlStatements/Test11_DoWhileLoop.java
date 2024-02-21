package DSA03_ControlStatements;

public class Test11_DoWhileLoop {
    public static void main(String[] args) {
/*
do while loop is used to iterate a part of the program repeatedly, until the
specified conditon is true. if the number of iteration is not fixed and you must
have to execute the loop at least once, it is recommended to use a do- while loop.
Syntax - do {
           //code to be executed /loop body
           //update statement
           } while (condition);
 */
        int a=1;
        do {
            System.out.println(a);
            a++;
        } while (a<=10);

    }
}
