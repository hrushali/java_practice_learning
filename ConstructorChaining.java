public class ConstructorChaining {
    ConstructorChaining(){
        System.out.println("in default constructor");
    }
    ConstructorChaining(String name){
        this();
        System.out.println("in parameterized constructor");
    }
    public static void main(String[] args) {
        ConstructorChaining c =new ConstructorChaining("hrush");
    }
}
