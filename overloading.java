import java.util.Scanner;

public class overloading {
    Scanner s = new Scanner(System.in);
    int x1,y1;
    overloading(){
        System.out.println("This constructers it will call automaticaly");
    }
    overloading(int a ,int b){
        this.x1 = a;
        this.y1 = b;
    }
}
