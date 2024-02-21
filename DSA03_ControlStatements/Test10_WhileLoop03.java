package DSA03_ControlStatements;

public class Test10_WhileLoop03 {
    public static void main(String[] args) {
        //reverse a number
        int a=258963;

        int b=0;
        while(a>0){
            int rem = a%10;
            a/=10;

            b = b * 10 + rem;
        }
        System.out.println(b);
    }
}
