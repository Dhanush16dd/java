package exception;
public class parentExp extends Exception {
    String errormsg;
    parentExp (String m) {
         this.errormsg=m;
    }

    public String iString(){
        return ("The Exception is :"+errormsg);
    }
}
