package controlflow;

import java.util.Scanner;

public class calculateBrain {
public static void main(String[] args) {
    

    Scanner s= new Scanner(System.in);
    System.out.println("enter the a:");
    int a = s.nextInt();
    System.out.println("enter the b:");
    int b = s.nextInt();
    addition( a, b);
    substraction( a, b);
    multiplication( a, b);
    division( a, b);
    SequareRoot(a);
    powerOf(a, b);

    
}

public static void addition(int a,int b){
    int c=a+b;
    System.out.println("addition of two no is: "+c);
}
public static void substraction(int a,int b){
    int c=a-b;
    System.out.println("substraction of two no is: "+c);
}
public static void multiplication(int a,int b){
    int c=a*b;
    System.out.println("multiplication of two no is: "+c);
}
public static void division(int a,int b){
    float c=a/b;
    System.out.println("division of two no is: "+c);
}
public static void SequareRoot(int a){
    double c= Math.sqrt(a);
    System.out.println("division of two no is: "+c);
}
public static void powerOf(int a,int b){
    double c=Math.pow(a, b);
    System.out.println("division of two no is: "+c);
}
}
