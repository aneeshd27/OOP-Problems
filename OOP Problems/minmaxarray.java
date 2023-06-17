package xam;

import java.util.Scanner;

public class minmaxarray {
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   int array[]=new int[5];
		   int i;
		   for(i=0;i<5;i++)
		   {
			   array[i]=sc.nextInt();
		   }
	       
	       int max = 0;

	       for(i=0; i<array.length; i++ ) {
	           if(array[i]>max) {
	               max = array[i];
	           }
	       }
	       int min = array[0];

	       for( i=0; i<array.length; i++ ) {
	           if(array[i]<min) {
	               min = array[i];
	           }
	       }
	       System.out.println("Maximum value: "+max);
	       System.out.println("Minimum value: "+min);
	   }
	

}
