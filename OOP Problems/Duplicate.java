package assignment6;
import java.util.*;
import java.util.stream.*;

public class Duplicate {
	public static <Integer> ArrayList<Integer>
	removeDuplicates(ArrayList<Integer> list){
		ArrayList<Integer>newList =new ArrayList<Integer>();
		for(Integer element : list) {
			if(!newList.contains(element))
				newList.add(element);
		}
		return newList;
	}

	public static void main(String[] args) {
		ArrayList<Integer> L=new ArrayList<>(
				Arrays.asList(10,20,40,50,20,10));
		System.out.println(L);
		ArrayList<Integer> newList =removeDuplicates(L);
		System.out.println(newList);
				
		// TODO Auto-generated method stub

	}

}
