package assignment6;

public class reversenum {

	public static void main(String[] args) {
		int num=1234,reversed=0;
		System.out.println("Original number"+num);
		while(num!=0) {
			int digit=num%10;
			reversed=reversed*10+digit;
			num/=10;
		}
		System.out.println("reversed number:"+reversed);
		// TODO Auto-generated method stub

	}

}
