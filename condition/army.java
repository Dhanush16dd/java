package condition;
import java.util.Scanner;

public class army {
    public static void main(String[] args) {
        int height,mark;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the height :");
            height = s.nextInt();
            System.out.println("Enter the Mark :");
            mark =s.nextInt();
        }
        if (height>=180 && mark>=80) {
            System.out.println("YOur are selected for Army");
        }
        else{
            System.out.println("Your are not selected in army");
        }
    }
}
