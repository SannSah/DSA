package DSA04_PatternProblems;

public class Test02_ReverseRightHalfPyramid {
    public static void main(String[] args) {
        for (int a=1; a<=6;a++)
        {
            for (int b=6;b>=a;b--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
