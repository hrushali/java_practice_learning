package abstarct;


    abstract class Bike{
        abstract void run();
    
    }
    class Honda extends Bike{
        @Override
        void run() {
          System.out.println("running safely");  
        }
    
        public static void main(String[] args) {
          Bike b=new Honda();
          b.run();
    
        
    }
    }

