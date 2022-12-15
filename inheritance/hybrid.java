package inheritance;

class A {
    public void sad() {
        System.out.println("I am crying");
    }
}

class B extends A{
    public void happy() {
        System.out.println("this is happy function");
    }
}

class C extends B{
    public void cFunction() {
        System.out.println("this is c function");
    }
}

class D extends C{
    public void dFunction() {
        System.out.println("This is d function");
    }
}

class E extends C{
    public void eFunction() {
        System.out.println("This is E function");
    }
}

public class hybrid {
    public static void main(String[] args) {
        D d1 = new D();
        E e1 = new E();
        d1.happy();
        e1.sad();
    }
}
