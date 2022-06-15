public class arrange {
    public static void main(String args[])
    {
      int a[] =  {0, 1, 2, 0, 1, 0};
      
      int i,j=0;
      int b[] = new int [a.length];

      for(i=0;i<a.length;i++)
      {
          if(a[i]==0)
          b[j++]=a[i];
          
      }
      for(i=0;i<a.length;i++)
      {
          if(a[i]==1)
          b[j++]=a[i];
        
      }
      for(i=0;i<a.length;i++)
      {
          if(a[i]==2)
          b[j++]=a[i];
          
      }

    //   for (i = 0; i <a.length; i++)
    //     a[i] = b[i];



      for(i=0;i<b.length;i++)
      {
        System.out.print(b[i]+ " ");

      }

    }
}
