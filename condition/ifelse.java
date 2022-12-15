package condition;

import java.util.Scanner;

class ifelse {

    public static void main(String[]args) {
        int num ;
Scanner S = new Scanner(System.in);
System.out.println("Enter the mark");
 num = S.nextInt();
  if (num>75 && num<= 100)
  {
    System.out.println(" grade A");

  }
else if (num>50 && num<=75){
System.out.println("grade B");

}
else if (num>35 && num<=50){
System.out.println(" grade C");

}
else {
    System.out.println("fail");
}

 }


    }

