package abstarct;

abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank
{
    int getRateOfInterest(){
        return 7;
    }
}
class PNB extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}
public class Testbank {
    
    public static void main(String[] args) {
        Bank b=new SBI();
        System.out.println(b.getRateOfInterest());
    }
}