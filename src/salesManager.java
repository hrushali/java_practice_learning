package inheritance.Hrmanager.src;

public class salesManager extends salesRep {
double salesbyteam;

public salesManager(String firstname, String lastname, int registration, int age, int dayworked,
int vacationDaystaken, double salary, int yearsWorked, double comission, double salesMade,
double salesbyteam) {
super(firstname, lastname, registration, age, dayworked, vacationDaystaken, salary, yearsWorked, comission,
   salesMade);
this.salesbyteam = salesbyteam;
}
   


   public void calculateComission(){
System.out.println("the manager comission :"+0.03f*salesbyteam);
   }





  



}

    

