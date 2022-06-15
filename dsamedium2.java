import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class dsamedium2 {    
   public static void main(String[] args) {

    int a[] = {1, 3, 2 ,4 ,9 ,2 ,5, 4 ,2, 7, 4};

    int n =a.length;
    Map<Integer,Integer> hp = new HashMap<Integer, Integer>();

    for(int i=0; i<n ;i++){
        int key =a[i];
        
        if(hp.containsKey(key)){
            int freq = hp.get(key);
            freq++;
            hp.put(key, freq);
        }
        else{
            hp.put(key, 1);
        }
    }

    int maxcount =0,res=-1;
    for(Entry<Integer,Integer> val : hp.entrySet())
    {
        if(maxcount<=val.getValue()){
            
            
            res=val.getKey();

          
            maxcount =val.getValue();
        }
    }
       System.out.println(res);
   }
}



// Code 1: Find the maximum repeated element from the array, if multiple element have the same high-frequency return a big number.

// Input: {1 3 2 4 9 2 5 4 2 7 4}

// Output: 4
