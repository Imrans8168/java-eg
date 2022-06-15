import java.util.*;
public class anagram {

    
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1= new String();
		String s2= new String();
		System.out.println("Enter first string");
		s1=sc.nextLine();
		
		System.out.println("Enter second string");
		s2=sc.nextLine();
		
		s1=s1.replace(" ","");
		s2=s2.replace(" ","");
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		
		
		Arrays.sort(a);
		Arrays.sort(b);

		 boolean res = Arrays.equals(a,b);
		 
		 if(res==true)
		 System.out.println("anagram");
		 else
		 System.out.println("not anagram");
		
	}
}
