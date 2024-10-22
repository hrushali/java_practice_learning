package abstarct;

abstract class testAbstract {
    public void run();
    
}

class  main extends testAbstract{
    public static void main(String[] args) {
        testAbstract at = new testAbstract() {
            void run(){
                System.out.println("hello");
               }
        };
     
      at.run();
       }
    }

