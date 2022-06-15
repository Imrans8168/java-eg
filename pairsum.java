import java.util.*;
public class pairsum {
    
    public static void main(String args[])
      
    {
        int sum,i,j,n;
        int count=0;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size or array:");
        n=sc.nextInt();
        int a[]= new int[n];
        
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
          System.out.println("Enter sum");
          sum=sc.nextInt();
        
      
        
        for(i=0;i<a.length;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]+a[j]==sum)
                count++;
            }
        }
        if(count>0)
        System.out.println(count);
        else
        System.out.println("pair not found");
       
        
        
    }
}
