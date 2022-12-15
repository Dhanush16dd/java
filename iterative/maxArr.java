package iterative;

public class maxArr {
    public static void main(String[] args) {
        int max = 0 ;
        int [] arr = {23,53,34,76,24,78};
        for(int i:arr){
           if (max<=i) {
            max=i;
           }
        }
        System.out.println(max);
    }
}
