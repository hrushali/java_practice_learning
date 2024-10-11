package function;

import java.util.*;

public class function {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the name : ");
        String name = s.nextLine();
        System.out.println("enter the lastname : ");
        String last = s.nextLine();
         PrintnameLength(name);
         printcharactor(name);
         printfullname( name,last);

    }
   private static void  PrintnameLength(String name){
    System.out.println(""+name.length());
   }

   private static void printcharactor(String name){
    for(int i=0;i<name.length();i++){
        System.out.println(""+name.charAt(i));
    }

}
    private static void printfullname(String name,String last){
       
            System.out.println("full name: "+name+last);
       
   }
    
}
