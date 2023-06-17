package assignment6;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int number=sc.nextInt();
		int originalNumber,remainder,result=0;
		originalNumber=number;
		while(originalNumber!=0)
		{
			remainder=originalNumber%10;
			result+=Math.pow(remainder, 3);
			originalNumber/=10;
		}
		
		if(result==number)
			System.out.println(number+ "\tis armstrong.");
		else
			System.out.println(number+"is not armstrong");
		
		// TODO Auto-generated method stub

	}

}
