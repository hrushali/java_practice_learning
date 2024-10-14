package inheritance.Hrmanager.src;

import controlflow.calculateBrain;

public class salesRep extends Employee{
    public static final double getsalesMade = 0;
    double comission;
    private double salesMade;
    

   

  

    public salesRep(String firstname, String lastname, int registration, int age, int dayworked, int vacationDaystaken,
            double salary, int yearsWorked, double comission, double salesMade) {
        super(firstname, lastname, registration, age, dayworked, vacationDaystaken, salary, yearsWorked);
        this.comission = comission;
        this.salesMade = salesMade;
    }

    public double calculateComission(double salesMade){
        return comission = 0.1 * salesMade;
     }

    public double getSalesMade() {
        return salesMade;
    }

    public void setSalesMade(double salesMade) {
        this.salesMade = salesMade;
    }

   
}
    

