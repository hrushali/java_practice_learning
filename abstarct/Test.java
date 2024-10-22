package abstarct;

abstract class Shape{
    abstract void draw();
}
class Reactangle extends Shape{
   void draw(){
       System.out.println("deawing rectangle");
   }
}
class Circle extends Shape{
   void draw(){
       System.out.println("drawing circle");
   }
}
public class Test {
   
   public static void main(String[] args) {
       Shape s=new Circle();
       s.draw();
   }
}
