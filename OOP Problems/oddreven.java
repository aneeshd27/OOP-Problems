package assignment6;

import java.util.Scanner;

public class oddreven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println(a +"\tit is even");
		}
		else {
			System.out.println(a+"\tit is odd");
		}
		// TODO Auto-generated method stub

	}

}
