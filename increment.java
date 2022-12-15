import java.util.Scanner;

public class increment {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
        }
        int a =10;
        int b = 25;
        int c;
        int d ;

       
        c = a++ + ++a;
        d= b-- + --b;
        
        System.out.println(c);
        System.out.println(d);
    }
}
