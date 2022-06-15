import java.util.*;

public class occurennce {
    
    public static void main(String args[])
    {
        int a[]= { 1, 3, 2, 1, 4, 3};

        int count=0;
        Scanner sc = new Scanner(System.in);
        int key=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            count++;
        }
        if(count>1)
        System.out.println(key+"-->"+count);
        else
        System.out.println("no");


    }
    
}
