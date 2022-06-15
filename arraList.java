import java.util.ArrayList;

public class arraList {

public static void main(String args[])
{
    ArrayList<Integer> al = new ArrayList<>();

    al.add(2);
    al.add(4);
    al.add(6);
    al.add(8);
    al.add(55);
    al.add(9);
    
   
    System.out.println(al);

    for(Integer elem: al)
    {
        System.out.println(elem);
    }
    al.set(1, 27);
    System.out.println(al.get(4));
    System.out.println(al);
    al.remove(5);
    System.out.println(al);
}



}

