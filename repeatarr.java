import java.util.*;

public class repeatarr {
    public static void main(String args[])
    {
        int a[]={9 ,4 ,9 ,6, 7 ,4};
        int i,j;

        for(i=0;i<a.length;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j]);
                {
                    break;
                }
                System.out.println(a[i]);
            }
           
        }
      
            
    }
    
}

