package assignment6;

import java.util.Scanner;

public class lab2 {
	int[] arr;
	int targetsum;
	
	public void getdata() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of elements stored in array:");
		int size=sc.nextInt();
		arr =new int[size];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<size;i++) {
			System.out.println("Enter elements at index :" +i+ "=");
			arr[i]=sc.nextInt();
			System.out.println();
		}
		System.out.println("Enter the target sum:");
		targetsum=sc.nextInt();
	}
	
	public int[] numsum (int arr[] ,int targetsum ) {
		int arr1[] = new int[2];
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==targetsum) {
					arr[0]=arr[i];
					arr[1]=arr[j];
					return arr1;
				}
			}
		}
		return arr1;
	}

	public static void main(String[] args) {
	
		lab2 obj=new lab2();
		obj.getdata();
		for(int i:obj.numsum(obj.arr,obj.targetsum)) {
			System.out.println(i+"");
		}

	}

}
