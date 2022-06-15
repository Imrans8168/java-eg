import java.util.*;
import java.util.Map.Entry;

public class repeatedmost {
    public static void main (String[] args) {
         
        int arr[] = {1, 5, 2, 1, 3, 2,2,2,2, 1};
        int n = arr.length;

         
        
        Map<Integer, Integer> hp = new HashMap<Integer, Integer>();
         
        for(int i = 0; i < n; i++)        {
            int key = arr[i];
            if(hp.containsKey(key))
            {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            }
            else
            {
                hp.put(key, 1);
            }
        }
         
        // find max frequency.
        int max_count = 0, res = -1;
         
        for(Entry<Integer, Integer> val : hp.entrySet())
        {
            if (max_count < val.getValue())
            {
                res = val.getKey();
                max_count = val.getValue();
            }
        }
         
        System.out.println(res);
    }
    
}
