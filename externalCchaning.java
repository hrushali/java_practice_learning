public class externalCchaning extends ConstructorChaining {
    externalCchaning(){
        super("hrush");
        System.out.println("in external constructor chaining default ");
    }
    public static void main(String[] args) {
        externalCchaning e = new externalCchaning();
    }
    
}
