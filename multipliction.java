package controlflow;
import java.util.Scanner;

public class multipliction {
    public static void main(String[] args) {
        int multiplicant =1;
        int multipliar;
        int product;

int limit;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the multiplicant: ");
         multiplicant = s.nextInt();
         System.out.println("enter the limit: ");
         limit =s.nextInt();

        while(multiplicant<=limit){
            multipliar=1;
            // System.out.println(""+multiplicant);

            while (multipliar<=10) {
                product=multiplicant*multipliar;
                multipliar++;
                System.out.println(multiplicant+"x"+multipliar+"="+product);
            }

            multiplicant++;
          
        }
        
    }
    
}
