package DSA03_ControlStatements;

public class Test12_BreakStatement {
    public static void main(String[] args) {
/*
the break statement in java is used inside a loop to immediately terminate the control.
it is used to break a loop or switch case,
in case of inner loop it break only inner loop.
Syntex - jump-statement;
          break;

 */
        //Example 01
//        for (int i = 1; i < 5; i++) {
//            if(i==5){
//                break;
//            }
//            System.out.println(i);
//        }
        //Example 02
        for (int i = 1; i <3 ; i++) {
            for (int j = 1; j < 3; j++) {
                if(i==2 && j==2){
                    break;
                }
                System.out.println(i+ " "+j);
            }

        }
    }
}
