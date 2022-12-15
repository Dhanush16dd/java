import java.util.Scanner;

import javax.xml.transform.SourceLocator;

public class asssignment {
    public static void main(String[] args) {
        // 1] Write a Program to find Smallest number out of 2 Numbers.
        Scanner s = new Scanner(System.in);
        int a ,b;
        System.out.println("Enter the Number a");
        a = s.nextInt();
        System.out.println("Enter the Number b");
        b = s.nextInt();

        if (a<b) {
            System.out.println(a+"is a smallest number");

        }
        else{
            System.out.println(b+"is a smallest number");
        }

        // 2] Write a Program to Check enter number is Positive,Negative or Zero.
        int num;
        System.out.println("Enter the Number to check positive or negative :");
        num = s.nextInt();
        if (num == 0 ) {
            System.out.println("The given number is ZERO");
        }
        else if(num<0){
            System.out.println("The given number is Negative");
        }
        else {
            System.out.println("The given number is Positive");
        }

        // 3] Check whether enter number is Even or Odd.
        System.out.println("Enter a number to check number is even or odd :");
        int number = s.nextInt();
        if (number %2 == 0) {
            System.out.println("The given number is Even");
        }
        else{
            System.out.println("The given number is odd");
        }

        // 4] Write a Program to find largest number out of 3 Numbers.


        int n1, n2, n3, largest, temp;   
        System.out.println("Enter the first number:");  
        n1 = s.nextInt();  
        System.out.println("Enter the second number:");  
        n2 = s.nextInt();  
        System.out.println("Enter the third number:");  
        n3 = s.nextInt();  
        temp=n1>n2?n1:n2;  
        largest=n3>temp?n3:temp;  
        System.out.println("The largest number is: "+largest);

        // 5] Write a Program to find number which is divisible by 4 & 5.

        int nm1;
        System.out.println("Enter the number");
        nm1 = s.nextInt();
        if(nm1%4==0 && nm1%5==0){
            System.out.println(nm1+"is a number divisible by 4 & 5");
        }
        else{
            System.out.println("The given number is not divisible by 4 and 5");
        }

        

    }
}
