package iterative;

public class avgArr {
    public static void main(String[] args) {
        int count = 0 , avg ,len;
        int [] arr = {23,53,34,76,24,78};
        len = arr.length;
        for(int i : arr){
            count = count+i;
        }
        avg = count/len;
        System.out.println(avg);
    }
}
