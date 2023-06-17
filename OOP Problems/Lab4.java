package Demo;

import java.util.*;
class Lab4
{
	public static void divide()
	{
		int div=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number");
		int a=sc.nextInt();
		System.out.println("Enter a second number");
		int b=sc.nextInt();
		try
		{
			div=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e+" Exception Handled");
			System.out.println("The denominator cannot be 0");
		}
		finally
		{
			System.out.println("The division of the 2 numbers is "+div);
		}
	}
	public static void array()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values in the array");
		int n=sc.nextInt();
		int []a=new int[n];
		System.out.println("Enter the values in the array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the index number whose value is required");
		int index=sc.nextInt();
		try
		{
			System.out.println("The value is "+a[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("The index value entered is not present in the array");	
		}
	}
	public static void pointer(String str)
	{
		try
		{
			int l=str.length();
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			System.out.println("The object you are referring to has null value");
		}
	}
	public static void sing()
	{
		String s="VIT";
		try
		{
			char l=s.charAt(4);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String []args)
	{
		String s=null;
		Lab4.divide();
		Lab4.array();
		Lab4.pointer(s);
		Lab4.sing();
	}
}