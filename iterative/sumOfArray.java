package iterative;

public class sumOfArray {
   public static void main(String[] args) {
    int count = 0;
    int [] arr = {23,53,34,76,24,78};
    
    for(int i : arr){
        count = count+i;
    }
    System.out.println(count);
   }
}
