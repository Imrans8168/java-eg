import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class dsatwoeasy {

    public static void revere(String str){
        if((str == null) || (str.length()<=1))
        System.out.println(str);

        else{
            System.out.print(str.charAt(str.length()-1));
            revere(str.substring(0,str.length()-1));
        }
    }
   

    public static void main(String args[])
    {
       
        String str ="Imran shaikh";
       dsatwoeasy aa = new dsatwoeasy();
       aa.revere(str);
        
    }
    
}
