public class array_copy {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] a1 = new int[5];

        for (int i=0;i<a.length;i++){
           a1[i]=a[i];

           
        }
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i]+"");
          
           

        }
        
        System.out.println("\n");
        for(int i=0;i<a1.length;i++){
            System.out.print(a[i]+"");

        }
        

    }
    
}
