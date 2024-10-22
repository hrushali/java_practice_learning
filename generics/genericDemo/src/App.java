import java.util.ArrayList;
import java.util.List;
class hrush<T>{//T=type is for class only
    T obj;
    hrush( T obj){
        this.obj=obj;

    }
    public void add(T obj){

    }
    T get(){
        return obj;
    }
   
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        hrush<String> li = new hrush<String>("hrushali");
       
       li.add("hrush");
       System.out.println("class is generic peovide different type of parameters  "+li.get());
      
       forMethod(10);
       forMethod("hrush");
    }
    public static <E> void forMethod(E o)//E=element is used for only method parameter
    {
    System.out.println("for method "+o);
    }
}
