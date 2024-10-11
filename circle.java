package variables;
import java.util.*;
//import controlflow.mind_reader;
// Open your IntelliJ Idea IDE and follow the instructions below
// Create a project on IntelliJ. This time feel free to give it an appropriate name. hint We're going to be finding the area and perimeter of a circle.
// Write a java application that prompts a user to enter the diameter of a circle and calculates the area and perimeter of the circle.
// Perform a widening casting operation (integer to double) when storing the result of the operations.
// Print out the results of the two operations in the console.
//pia r square    2pie r

public class circle {
    public static float pie = 3.14f;
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the diameter of a circle :");
float diameter=s.nextInt();

float area_of_circle =area(diameter);
float perimeter_of_circle=perimeter(diameter);
System.out.println("area of circle is :"+area_of_circle);
System.out.println("perimeter of a circle is : "+perimeter_of_circle);

        
    }
    public static float area(float diameter){
        float redius=diameter/2;
        return pie*redius*redius;
    }
    public static float perimeter(float diameter) {
        float redius=diameter/2;
        return 2*pie*redius;
    }
    
}
