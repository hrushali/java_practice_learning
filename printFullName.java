import java.util.Scanner;
 

public class printFullName{
  

    String firstName;
    String lastName;
    int registration;
    int grade =0;
    int year;
    public  printFullName(){
        Scanner s= new Scanner(System.in);
        System.out.println("enter the firstname:");
        firstName=s.next();
        System.out.println("enter the lastename");
        firstName=s.next();
     }}
     class isApproved{
     public  isApproved(){
        int grade =0;
        //TODO implement: should return true if grade >= 60
        Scanner s=new Scanner(System.in);
        System.out.println("enter the grade:");
        grade=s.nextInt();
        if(grade>=60){
            System.out.println("true");
        }

    }
}
class changeYearIfApproved{
    public changeYearIfApproved(){
        //TODO implement: the student should advance to the next year if he/she grade is >= 60
        // Make year = year + 1, and print "Congragulations" if the student has been approved
        int grade =0;
        int year;
        Scanner s=new Scanner(System.in);
        System.out.println("enter year:");
       year = s.nextInt();
       System.out.println("enter grade:");
       grade = s.nextInt();

        if(grade>=60){
            year++;
            System.out.println(year);
            System.out.println("Congragulations");
            
        }
       
    }

}

