import java.util.*;

public class dsah1 {
    
    public static void sort(int a[], int arrsize)
    {
        int lo =0;
        int hi = arrsize-1;
        int mid =0,temp=0;
        while(mid<=hi){
            switch(a[mid]){
                case 0 :{
                    temp= a[lo];
                    a[lo]=a[mid];
                    a[mid]=temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1 :{
                    mid++;
                    break;
                }
                case 2 : {
                    temp=a[mid];
                    a[mid]= a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
    }

    public static void printarr(int arr[], int arrsize){
        int i;
        for(i=0;i<arrsize;i++){
            System.out.print(arr[i] +" ");
            
        }
        System.out.println("");
    }
     public static void main(String[] args) {
        
        int arr[]= {1, 1, 2, 2 ,0,0};
        int arrsize =arr.length;
        sort(arr,arrsize);
        System.out.println("after sorting");
        printarr(arr,arrsize);

    }
}
