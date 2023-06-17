import java.util.*;

public class AddTwoList {
	public static void main(String args[])
	{
		ArrayList<String> str1 = new ArrayList<String>();
		str1.add("Hello");
		str1.add("How");
		str1.add("Are");
		str1.add("You");
		
		ArrayList<String> str2 = new ArrayList<String>();
		str2.add("Hi");
		str2.add("How");
		str2.add("Are");
		str2.add("You");
		
		ArrayList<String> str3 = new ArrayList<String>();
		str3.addAll(str1);
		str3.addAll(1,str2);
		System.out.println(str3);
		System.out.println("The index of are: " + str3.indexOf("Are"));
		
		str1.remove(3);
		System.out.println(str1);
		
		str2.set(3,"U");
		System.out.println(str2);
	
	}


	}


