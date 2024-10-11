package controlflow;
import java.util.*;
public class fibbo {
    public static void main(String[] args) {
        long n1 = 0;
        long n2 = 1;
        short count = 10;  
        fibbonaccis(n1, n2, count);
    }

    public static void fibbonaccis(long n1, long n2, short count) {
        System.out.println(n1); 
        System.out.println(n2);  
        
        int j = 2;
        while (j < count) {
            long n3 = n1 + n2; 
            System.out.println(n3);  
            n1 = n2; 
            n2 = n3; 
            j++; 
        }
    }
}


