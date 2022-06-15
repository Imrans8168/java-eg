import java.util.*;

public class hashmap {

    static HashMap<String ,Integer> conmob = new HashMap<String,Integer>();
    public static void main(String args[])
    {
       

        conmob.put("imran", 1);
        conmob.put("ayub", 3);
        conmob.put("shaikh", 0);
        conmob.put("nilo", 4545245);
        conmob.put("mummy", 555);

        // System.out.println(conmob);

        // System.out.println(conmob.get("ayub"));
        conmob.remove("shaikh");
        System.out.println(conmob);//after remmoving;
        


    }
    
}
