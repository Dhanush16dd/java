package iterative;

import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {
        int a=0 ,b=1,c,num ;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i =0; i<num ;i++){
            c= a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
