package DSA03_ControlStatements;

public class Test13_ContinueStatement {
    public static void main(String[] args) {
/*
The continue statement is used in loop control structure when we need to jump
to the next iteration of the loop immediately.

Syntax- jump-statement;
        continue;

 */
//        for(int i=1;i<=10;i++){
//            if(i==5){
//                continue;//it will skip the rest statement
//            }
//            System.out.println(i);
//        }
//    }
//}

        //Example 02
        //outer loop
        for(int i=1;i<=3;i++){
            //inner loop
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    //using continue statement inside inner loop
                    continue;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
