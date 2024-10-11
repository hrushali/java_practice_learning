package controlflow;
import java.util.*;



public class communication {
//     Using IntelliJ, write a Java app that takes numerical input from a user
// The app should calculate commission based on this chart used by the retail store.
// Sales Range	Commission
// above 10000$	30%
// 5001 - 9999$	20%
// 1001 - 4999$	10%
// below 1000$	N/A
// Example: if a user enters 7677 as their sales figure, it should calculate commission at 20%.
public static void main(String[] args) {
    int sale_amount;
    int commission_per=0;
    float com;
    Scanner s = new Scanner(System.in);
    System.out.println("enter the sales amount :");
    sale_amount =s.nextInt();

    if(sale_amount>=1001 && sale_amount<=4999){
        System.out.println("on your sales_amount get 10% commision  ");
        System.out.println("*****************************");
        commission_per=10;
        com=calc_com(commission_per,sale_amount);
        System.out.println("your commission is : "+com);

    }
    else if(sale_amount>=5000 && sale_amount<=9999 ){
        System.out.println("on your sales_amount get 20% commision  ");
        System.out.println("*****************************");
        commission_per=20;
         com=calc_com(commission_per,sale_amount);
        System.out.println("your commission is : "+com);

    }
    else if(sale_amount>=10000){
        System.out.println("on your sales_amount get 30% commision  ");
        System.out.println("*****************************");
        commission_per=30;
        com=calc_com(commission_per,sale_amount);
        System.out.println("your commission is : "+com);
    }
    else{
        System.out.println("nope next better luck");
    }
}
public static float calc_com(int com,int sale_amount){
 
    return (sale_amount*com)/100;

}
}
