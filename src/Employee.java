package inheritance.Hrmanager.src;

class Employee {
    double bonus;
     int vacation_time_left;
    int retirement;
    String firstname;
    String lastname;
    int registration;
    int age;
    int dayworked;
    int vacationDaystaken;
    double salary;
    int yearsWorked;
    private String username;
    private String password;
   
    public Employee(String firstname, String lastname,
    int registration, int age, int dayworked, int vacationDaystaken, double salary, int yearsWorked) {
this.bonus = bonus;
this.vacation_time_left = vacation_time_left;
this.retirement = retirement;
this.firstname = firstname;
this.lastname = lastname;
this.registration = registration;
this.age = age;
this.dayworked = dayworked;
this.vacationDaystaken = vacationDaystaken;
this.salary = salary;
this.yearsWorked = yearsWorked;
}
    

    

    
    public int timeToRetirement(int age,int yearsWorked){
       
        return  retirement = Math.min(60 - age, 40 - yearsWorked);
     }
  
    

    public int vacationTimeLeft(int daysWorked,int vacationDaysTaken){
      
         return vacation_time_left = (daysWorked/360)*(30 - vacationDaysTaken);
     }
  
     public double calculateBonus(double salary){

       
          return bonus = 2.2*salary;
     }
    
}
