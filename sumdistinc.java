import java.util.*;

public class sumdistinc {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 1, 1, 4, 5, 6,10};

        int n = arr.length;

        Arrays.sort(arr);
        
        int sum = arr[0];
        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i + 1]) {
                sum = sum + arr[i+1];
            }
        }
 
       System.out.println(sum);
    
 
    }
    
}
