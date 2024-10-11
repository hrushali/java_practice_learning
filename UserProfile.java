package variables;

import java.util.Scanner;

public class UserProfile {
    public static void main(String[] args) {
        //users name, age, gender, job preference, nationality and blood type

        String username;
        int age;
        String gender;
        String jobpreferance;
        String nationality;
        String BloodType;
        Scanner s =new Scanner(System.in);
        System.out.println("enter your name: ");
        username = s.nextLine();
        System.out.println("enter your age: ");
        age = s.nextInt();
       
        System.out.println("enter your gender: ");
        gender = s.next();

        System.out.println("enter your job preference: ");
        jobpreferance = s.next();

        System.out.println("enter your nationality: ");
        nationality = s.next();

        System.out.println("enter your blood groun: ");
        BloodType = s.next();

       
        System.out.println("*****************Details**********************");
        System.out.println(username);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(jobpreferance);
        System.out.println(nationality);
        System.out.println(BloodType);
        cal_age(age);
        
    }
    public static void cal_age(int age){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the current year:");
        int year =sc.nextInt();
        int n=year-age;
        System.out.println("your year of birth is: "+n);

    }
    
}
