package xam;
import java.util.*;
public class AverageSalary {
	public static int[] findDetails(int array[]) {
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		int mn = array[0];
		int mx = array[0];
		
		int sum = 0;
		for (int i = 0; i<array.length;i++) {
			sum = sum+array[i];
			mn = Math.min(mn,  array[i]);
			mx = Math.max(mx, array[i]);
			}
		int avg = sum / array.length;
		int T=0;
		int K=0;
		for (int i = 0; i<array.length; i++) {
			if(array[i]<avg ) {
				array1[T] = array[i];
				T++;
			}
			else {
				array2[K] = array[i];
				K++;
			}
			
		}
		int[] finalArray = {avg, T, K};
		return finalArray;
 	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] array = {23500,25080,28760,22340,19890};
		int [] arrayF = findDetails(array);
		for (int i = 0; i<arrayF.length;i++) {
			System.out.println(arrayF[i]);
		}
	}
	

}
