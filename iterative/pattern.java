package iterative;

public class pattern {
    public static void main(String[] args) {
        String str = "ABCD";
        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(count);
            }
            System.out.println("");
            
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(count);
            count++;
            }
            System.out.println("");
            
        }


        for (int i = 0; i <= 4; i++) {
            System.out.println(str.substring(0, i));
        }
    }
}
