public class negpos {
    public static void main(String args[])
    {
        int a[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        int b[] = new int[a.length];
        int i,j=0;
        for(i=0;i<a.length;i++)
        {
            if(a[i]>0)
            b[j++]=a[i];
        }
        for(i=0;i<a.length;i++)
        {
            if(a[i]<0)
            b[j++]=a[i];
        }

        // for (i = 0; i <a.length; i++)
        //     a[i] = b[i];

            for (i = 0; i <b.length; i++)
            System.out.print(b[i]+ " ");
    }
    }
    

