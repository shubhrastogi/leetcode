import java.util.Scanner;

public class Fibonacci { // Class declaration
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i=2;i<n;i++)
        {
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
