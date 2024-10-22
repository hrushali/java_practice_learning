import java.io.ObjectOutputStream;
    import java.io.Serializable;
    import java.io.FileOutputStream;
    
     class persist implements Serializable{
        int id ;
        public persist(int id){
            this.id=id;
            
        }
    }
    public class student {
        public static void main(String[] args) {
            persist p =new persist(11);
            try{ 
            FileOutputStream f =new FileOutputStream("C:\\Users\\hrushali\\OneDrive\\Desktop\\input.txt");
            ObjectOutputStream out = new  ObjectOutputStream(f);
    
            out.writeObject(p);
            out.flush();
            out.close();
            System.out.println("succses");
            }catch(Exception e){
    System.out.println(e);
            }
        }
        
        
    }
    
    

