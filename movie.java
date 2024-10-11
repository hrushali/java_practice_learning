package controlflow;
import java.util.*;
public class movie {
//     A movie cinema does price discounting depending on a customer's age.
// The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount conditions.
// Age range	Ticket Price
// Normal ticket	7 Euros
// Below 5	60% Discount
// Over 60	55% Discount
// Write the app so that the conditions above are met and the correct ticket price is returned.
    public static void main(String[] args) {
        int age;
        int discount;
        float ticket_price;
       
        Scanner s=new Scanner(System.in);
        System.out.println("enter your age:");
        age = s.nextInt();
        
        
        if(age<=5){
            discount=60;
            System.out.println("you will get discount 60%");
            System.out.println("**********************");
            ticket_price=cal_pri(age,discount);
            System.out.println("your ticket price is: "+ticket_price);
        }
        else if(age>=60){
            discount=55;
            System.out.println("you will get discount 55%");
            System.out.println("**********************");
            ticket_price=cal_pri(age,discount);
            System.out.println("your ticket price is: "+ticket_price+" euros");
        }
        else{
            System.out.println("your ticket price is: 7euros");
        }
    }

    public static float cal_pri(int age,int discount){
        return (7*discount)/100;
    }
}
