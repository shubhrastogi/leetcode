

public class Fibonacci { // Class declaration
    public static void main(String[] args) { // Main method
        
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i=2;i<5;i++)
        {
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
