package filehandling;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;
import java.util.Scanner;

public class fileWriter {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            FileWriter myWriter = new FileWriter("C:\\Users\\admin\\Desktop\\Dhanush\\java\\filehandling\\files\\file1.txt", true);
            System.out.println("Enter a Paragraph :");
            String a = scan.nextLine();
            myWriter.write(a);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
