import java.util.Scanner;
import java.util.ArrayList;
public class students {
    String firstName;
    String lastName;
    int registration;
    int grade =0;
    int year;
public students(){
     String firstName;
    String lastName;
    int registration;
    int grade =0;
    int year;}
   
    
    public void printFullName(){
        Scanner s= new Scanner(System.in);
        System.out.println("enter the firstname:");
        firstName=s.next();
        System.out.println("enter the lastename");
        firstName=s.next();
     }
     public void isApproved(){
       
        //TODO implement: should return true if grade >= 60
        Scanner s=new Scanner(System.in);
        System.out.println("enter the grade:");
        grade=s.nextInt();
        if(grade>=60){
            System.out.println("true");
        }

    }
    public int changeYearIfApproved(){
        //TODO implement: the student should advance to the next year if he/she grade is >= 60
        // Make year = year + 1, and print "Congragulations" if the student has been approved
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter year:");
       year = s.nextInt();
     

        if(grade>=60){
            year++;
            System.out.println(year);
            System.out.println("Congragulations");
            
        }
        return 0;
       
    }
    public static void main(String[] args) {
        students s =new students();
        s.printFullName();
        s.isApproved();
        s.changeYearIfApproved();
    }
}

 class Courses {
    String courseName;
    String professorName;
    int year;
    ArrayList<students> students = new ArrayList<>();

    public Courses(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
    }

    public void enroll(students student) {
        
            if (!students.contains(student)) {
                students.add(student);
            }
        
    }

    public void unEnroll(students student){
        students.remove(student);
    }
    public int countStudents(){
        return students.size();
    }

    public int bestGrade(){
        int best = 60;
        for (students student : students) {
            if (student.grade > best) {
                best = student.grade;
            }
        }
        return best;
    }

    public void enroll(students[] students){
        
     }
    public static void main(String[] args) {
        Courses c = new Courses("Computer Science", "Vinod Bhatiya",2005);
        students ss = new students();
        c.enroll(ss);
        System.out.println("Count of Students:" +c.countStudents());
        System.out.println("Student Best Grade:" +c.bestGrade());
        c.unEnroll(ss);
        System.out.println("Count of Students:" +c.countStudents());
        
    }
}
