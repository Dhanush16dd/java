package filehandling;
import java.io.File;

public class fileOprations {
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\admin\\Desktop\\Dhanush\\java\\filehandling\\files\\file1.txt");
        try {
            if (myObj.createNewFile()) {
                System.out.println("File is created");
            }
            else{
                System.out.println("File is not created");
            }
            if (myObj.canRead()) {
                System.out.println("File can be readable");
            } else {
                System.out.println("File can't be readable");
            }
            if (myObj.canWrite()) {
                System.out.println("File can be write");
            } else {
                System.out.println("File can't be write");
            }
            if (myObj.exists()) {
                System.out.println("File is exist");
            } else {
                System.out.println("File Not exists");
                System.out.println(myObj.getName());
                System.out.println(myObj.getAbsolutePath());
                System.out.println(myObj.length());
                System.out.println(myObj.list());
            }
        } catch (Exception e) {
            System.out.println("it's :"+e);
        }
    }
}
