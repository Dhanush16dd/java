package exception;

public class customExp {
    public static void main(String[] args) {
        int a=30;
        try{
            if (a>25) {
                throw new parentExp("Age is less");
            }
        }catch(parentExp e){
            System.out.println(e.errormsg);
        }
    }
}
