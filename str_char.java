package controlflow;
import java.util.Scanner;

public class str_char {
    public static void main(String[] args) {
        
    
    String name ;
    Scanner s=new Scanner(System.in);
    System.out.println("enterb the string:");
name = s.nextLine();
for(int i=0;i<name.length();i++){
    System.out.println("char: "+name.charAt(i));
}

System.out.println("your string: "+name);

    }
    
}
