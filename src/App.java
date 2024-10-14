package inheritance.Hrmanager.src;
class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       Employee e=new Employee("hrush", "patil", 101, 20, 730, 10, 40000.0, 6);
       System.out.println(""+e.vacationTimeLeft(e.dayworked,e.vacationDaystaken));
       
       System.out.println(""+e.timeToRetirement(e.age,e.yearsWorked));
       
       System.out.println(""+e.calculateBonus(e.salary));

        salesRep s1= new salesRep("hrush", "patil", 10, 300, 500 ,33, 40000.0, 3, 1000.0,3000.0);
        salesRep s2= new salesRep("rush", "patil", 10, 300, 120 ,33, 40000.0, 30, 20000.0,3000.0);
        salesRep s3= new salesRep("hrash", "patil", 10, 300, 200 ,33, 40000.0, 3, 3000.0,4000.0);

salesManager sm= new salesManager("hrush", "patil", 110, 3000,330, 440, 20000.0, 3,4000.0,4000.0, s1.getSalesMade()+s2.getSalesMade()+s3.getSalesMade());

        sm.calculateComission();
    }
}
