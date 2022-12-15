package iterative;

import java.util.Scanner;

public class areaSwitch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double c,r,sq,ra,l,b;
        double pi = 3.14;
        char val;
        System.out.println("Enter a for Circle");
        System.out.println("Enter b for Rectangle");
        System.out.println("Enter c for Square");
        System.out.println("Press any key for Exit()");
        val = s.next().charAt(0);

        switch (val) {
            case 'a':
                System.out.println("Enter the radius :");
                ra = s.nextFloat();
                c = pi*ra*ra; 
                System.out.println("Area of Circle :"+c);
                break;

            case 'b':
                System.out.println("Enter the length :");
                l = s.nextFloat();
                System.out.println("Enter the brath :");
                b = s.nextFloat();
                r = l*b; 
                System.out.println("Area of Rectangle :"+r);
                break;
            case 'c':
                System.out.println("Enter the length :");
                l = s.nextFloat();
                sq = l*l;
                System.out.println("Area of Square :");
                break;
        
            default:
                System.out.println("Enter  any key");
                break;
        }

    }
}
