package hakkerrank;

import java.util.ArrayList;
import java.util.List;

public class listRep {
    public static void main(String[] args) throws Exception {
        
    
int[] arr ={3,1,2,3,4};
int k=3;
List<Integer> resultList = new ArrayList<>();

for(int i = 0; i<arr.length;i++){
  
    for(int j=i+1;j<arr.length;j++){
        if(arr[j]==arr[i]){
        
            
        System.out.println(arr[i]);
       
        }
    }
}
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < k; j++) {
                resultList.add(arr[i]);
            }
        }

        // Output the final list
        System.out.println("List after repeating elements " + k + " times: " + resultList);

      
}
}
    




