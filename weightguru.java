package logic;
import java.util.Scanner;


public class weightguru {
    


// Part 2: Weight Guru Challenge
// Create a Java program that tells whether your body to weight ratio is good or could be better.
// The java app should take in your weight and height from the console and calculate your body to weight ratio.
// You can use this article as a standardized guide for how to apply the logic.
    
public static void main(String[] args) throws Exception {
    Scanner s= new Scanner(System.in);
    System.out.println("enter the weight in kg");
    float weight = s.nextFloat();
    System.out.println("enter the height in ft");
    float height = 0.3048f*(s.nextFloat());

    float bmi = cal_bmi(weight,height);
    String  ana= analaysBMI(bmi);
    System.out.println("your BMI report is : "+bmi);
    
    System.out.println("your BMI health instruction is : "+ana);
    
}
public static float cal_bmi(float weight,float height){

    return weight/height*height;

}
public static String analaysBMI(float bm){

//     Underweight: BMI < 18.5
// Normal weight: 18.5 ≤ BMI < 24.9
// Overweight: 25 ≤ BMI < 29.9
// Obesity: BMI ≥ 30

   if(bm<18.5){
    return "underweigtn";
   }
   else if(bm>=18.5 && bm<24.9)
            {
                return "Normal Weight";

            }
            else if(bm>=25.0 && bm<29.9)
            {
                return "Over Weight";

            }
            else 
            {
                return "Obese red alert" ;
            }
}


}

    

