import java.util.*;
public class fsecondlargest {
    
     public static void main(String[] args) {
                
            int a[]={3,5,7,55,8,88};
            
         
                int i, first, second;         
               
                if (a.length < 2) {
                    System.out.print(" Invalid Input ");
                    
                }
                else
                {
                    first = second = Integer.MIN_VALUE;
                    for (i = 0; i <a.length; i++) { 

                        if (a[i] > first) {
                            second = first;
                            first = a[i];
                        }    
                    
                        else if (a[i] > second && a[i] != first)
                            second = a[i];
                }
                     System.out.println("The second largest element"
                             + " is " + second);
                             System.out.println("first"+first);
         
            }
        }
        
    }

