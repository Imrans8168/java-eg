import java.util.*;
public class sumdistihash {
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 1, 1, 4, 5, 6,7};
        int n = arr.length;
        int sum = 0;
 
        // Hash to store all element of array
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < n; i++)
        {
            if (!s.contains(arr[i]))
            {
                sum += arr[i];
                s.add(arr[i]);
            }
        }
        System.out.println(sum);
    }
    
}
