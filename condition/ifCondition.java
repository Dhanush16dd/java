package condition;
import java.util.Scanner;

public class ifCondition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("Enter the number :");
        a = s.nextInt();
        if (a>=100 && a<=200) {
            System.out.println("The given number is between the range ");
        }
        else{
            System.out.println("The given number is not between the range");
        }
    }
}
