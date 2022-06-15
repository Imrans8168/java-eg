
import java.util.*;
public class demoarray 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter size of array");
        n=sc.nextInt();
        int a[]= new int[n];


        System.out.println("Enter elemetns of array");
        
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
        System.out.println("elemetns of array");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
            
        }     
             
        
    }
    
     
}
