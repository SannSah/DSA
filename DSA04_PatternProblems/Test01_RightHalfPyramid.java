package DSA04_PatternProblems;

public class Test01_RightHalfPyramid {
    public static void main(String[] args) {
/*
1) First is to check how many number of lines or rows is to be printed for outer loop.
2) Second is to check how many inner loops are there or number of columns
3) What is to be printed ("*") or 123 etc.
 */
        for (int i=1; i<=5;i++)
        {
            for (int j=1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
