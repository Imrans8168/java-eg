import java.util.*;

public class negativandpos {   
   

    public static void main(String args[])
    {
        int a[]={1, -1, 3, 2, -7, -5, 11, 6 };
        
        int i;
        int b[]=new int[a.length];
        int j=0;
        for(i=0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                b[j++]=a[i];
               
            }
        }
        for(i=0;i<a.length;i++)
        {
            if(a[i]<0)
            {
                b[j++]=a[i];
                
            }
        }
        
         for(j=0;j<b.length;j++)
        {
            System.out.print(b[j]+" ");
        }
    
}
}

