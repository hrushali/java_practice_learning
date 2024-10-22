public class nullpointer {

    public static void main(String[] args) {
        try {
            String name =null;
            System.out.println(name.length());
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("rest of code");

        try {
            String s = "hrush";
          int i= Integer.parseInt(s);
        }catch(Exception  e){
            System.out.println(e);
        }finally{
            System.out.println("handel exception remains from catch");
        }
    }
    
}
