package exception;
class abc {
    public static void main(String[] args) {
        try {
            int a=4,b=0,c;
        c= a/b;
        System.out.println(c);
        } catch (NullPointerException e) {
            int a=4,b=0,c;
            c= a/b;
            System.out.println(c);
        }
    }
}

