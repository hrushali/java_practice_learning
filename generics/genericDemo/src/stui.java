import java.util.ArrayList;
import java.util.List;
abstract class Person {
    abstract void details();
    
}
 class Student extends Person{
    String name;
    
    public Student(String name) {
        this.name = name;
    }

    void details(){

        System.out.println("in the student details method "+this.name);

    }
 }
 class Employee extends Person{
    String name;
    
    public Employee(String name) {
        this.name = name;
    }

    void details(){

        System.out.println("in the employee details method "+this.name);

    }
}
class stui {
    public static void main(String[] args) {
        System.out.println("details");

  List<Student> stud_list=new ArrayList<Student>();
        stud_list.add(new Student("AJ"));
        stud_list.add(new Student("RJ"));
        stud_list.add(new Student("HJ"));
        PrintBaba(stud_list);

        List<Employee> Emp_list=new ArrayList<Employee>();
        Emp_list.add(new Employee("Suresh employee"));
        Emp_list.add(new Employee("Ramesh employee"));
        Emp_list.add(new Employee("Mahesh employee"));
        PrintBaba(Emp_list);
     
    }
    public static void PrintBaba(List<? extends Person>templist){
        System.out.println("details");
        for(Person item:templist){
            item.details();
            
        }
    }
}
