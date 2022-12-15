package condition;
import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a ;
        System.out.println("Enter the number :");
        a = s.nextInt();
        switch(a){
            case 1:System.out.println("sunday");
            break;
            case 2:System.out.println("monday");
            break;
            case 3:System.out.println("Tuesday");
            break;
            case 4:System.out.println("wednesday");
            break;
            case 5:System.out.println("Thursday");
            break;
            case 6:System.out.println("friday");
            break;
            case 7:System.out.println("saturday");
            break;
            default:System.out.println("Enter the number between 1 to 7");
        }
    }
}
