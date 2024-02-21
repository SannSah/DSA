package DSA04_PatternProblems;

public class Test05_AlphabetsPyramid {
    /*
   1) Outer loop = 4.
    2) Inner Loop to be run = line 1=1 char, line2=2 char. line3=3 char so on.
     3) Print
     */
    public static void main(String[] args) {
        int n=4;
        char ch='A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
