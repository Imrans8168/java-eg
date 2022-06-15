import java.util.*;
public class dsamedium {

    public static void main(String args[]){

        int a[] ={1,2,3,4,5,6};
        int k=7;
        int b[] =new int[a.length];
        int j=0;
        for(int i=k;i<a.length;i++){
            b[j++]=a[i];
          
        }
        for(int i=0;i<k;i++){
            b[j++]=a[i];
          
        }

        for(j =0;j<b.length;j++){
            System.out.print(b[j]);
        }
       
    
}
}

// 4,5,6,1,2,3