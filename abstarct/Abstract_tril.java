package abstarct;

abstract class animal {

    abstract void  sound();
    
}
class car {
    void run(){
        System.out.println("in car");
    }
    
}

class Abstract_tril {
    public static void main(String[] args) {
        animal a =new animal(){
            void sound(){
                System.out.println("meow");
            }
        };//ananomous {
        a.sound();
        car c1=new car(){ //normal class has an anonyomus class 
            void run(){
                System.out.println("I am called in anonymous");
            }
            
         };
         c1.run();
        }
     
        }
    

