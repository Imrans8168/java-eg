import javax.lang.model.util.ElementScanner14;

public class arrelement {
    public static void main(String args[])
    {
      int a[] = {1, 5, 7, -1};
      int i,j,sum=13,count=0;

      for(i=0;i<a.length;i++)
      {
          for(j=i+1;j<a.length;j++)
          {
              if(a[i]+a[j]==sum)
              count++;
          }
      }
      System.out.println(a.length);
      
    //   if(count>0)
    //   System.out.println(count);
    //   else
    //   System.out.println("No pair found");
    }

    
}
