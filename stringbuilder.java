import java.util.*;
public class stringbuilder {

    public static void main(String args[])
    {
       

        StringBuilder sb= new StringBuilder("shaikh");
        

        System.out.println(sb);
        sb.append('i');
        System.out.println(sb);
        // sb.replace(1, 5, "bcaww");
        sb.deleteCharAt(3);
        System.out.println(sb);

    }
    
}
