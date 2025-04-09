import java.util.Scanner;

abstract class Pattern {
    abstract void printPattern();
}
class DisplayPatterns extends Pattern {
    int num;
    Scanner sc = new Scanner(System.in);
    
    DisplayPatterns() {
        System.out.print("Enter the number of rows: ");
        num = sc.nextInt();
    }
    void printPattern() {
        System.out.println("Pattern 1:");
        for (int i = 0; i <=num; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Pattern 2:");
        for (int i = 0; i <=num; i++) {
            for (int j = 0;j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

public class ass {
    public static void main(String[] args) {
        DisplayPatterns dp = new DisplayPatterns();
        dp.printPattern();
    }
}
