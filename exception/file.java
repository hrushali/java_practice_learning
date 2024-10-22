import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class file {
    public static void main(String[] args) throws IOException {
       String firstname;
       String lastname;
       Scanner sc =new Scanner(System.in);
       System.out.println("enter the first and last name:");
       firstname = sc.nextLine();
       lastname = sc.nextLine();
       FileWriter f = new FileWriter("C:\\Users\\hrushali\\OneDrive\\Desktop\\input.txt");
       f.write(firstname);
       f.write(lastname);
       f.close();
       
    }
    
}
