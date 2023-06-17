package assignment6;
	import java.util.*;
	import java.lang.*;
	public class Iteator 
	{
	    public static void main(String args[])
	    {
	        ArrayList<Integer> i=new ArrayList<Integer>();
	        i.add(20);
	        i.add(30);
	        i.add(40);
	        for (Integer integer : i)
	        {
	            System.out.print(integer + " ");
	        }
	        System.out.println();

	        for(int j=0;j<i.size();j++)
	        {
	            System.out.print(i.get(j)+" ");
	        }
	        System.out.println();

	        Iterator<Integer> x=i.listIterator();
	        while(x.hasNext())
	        {
	            System.out.print(x.next()+" ");
	        }
	    }
	}
	
	