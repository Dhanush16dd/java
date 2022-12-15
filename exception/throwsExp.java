package exception;

import java.util.Scanner;

class throwsExp{
    public static void main(String[] args) throws Exception{
        try {
            divied();
        }catch(Exception e){
            System.out.println(e);
            System.exit(0);
        }
        finally{
            System.out.println("hellow java");

        }
    }
    static void divied(){
    //    Scanner s = new Scanner(System.in);
    //    System.out.println("Enter a number :");
       int a=5 ,c;
       int b = 0;
        c = a/b;
        System.out.println(c);
    }
}