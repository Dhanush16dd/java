package inheritance;


interface mother {
    public void m1() ;
}

interface father {
    public void f1() ;
}

public class multiple implements father , mother {

    public void m1() {
        System.out.println("This is mother function");
    }

    public void f1() {
        System.out.println("this is father function");
    }
    public static void main(String[] args) {
        multiple c = new multiple();
        c.m1();
        c.f1();
    }
}
