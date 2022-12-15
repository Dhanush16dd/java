import java.util.Scanner;

class addtion {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int a;
            float b;
            char c;
            String d;

            System.out.print("Enter a number :");
            a = s.nextInt();
            System.out.print("Enter a float :");
            b=s.nextFloat();
            System.out.print("Enter a letter :");
            c=s.next().charAt(0);
            System.out.print("Enter a string :");
            d=s.next();

            System.out.println("The Integer value is "+a);
            System.out.println("The desimal value is "+b);
            System.out.println("The literal value is "+c);
            System.out.println("The sentence value is "+d);
        }
    }

}
