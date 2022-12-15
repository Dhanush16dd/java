package condition;
import java.util.Scanner;

class grade{
    public static void main(String[] args) {
        int num ;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the mark :");
        num = s.nextInt();

      if (num>75 && num<=90) {
            System.out.println("B grade");
        }
        
        else if (num>45 && num<=75) {
            System.out.println("C grade");
        }
        
        else if (num>=0 && num<=45) {
            System.out.println("fail");
        }
        else{
            System.out.println("Enter a valid input");
        }
    }

}