public class printnamereverse {
    
   public static void main(String args[]){

    String str = "imran shaikh";
    int len =str.length();

    for(int i = len-1; i>=0; i--) {

        System.out.print(str.charAt(i));
        
     }
        
   }


}
