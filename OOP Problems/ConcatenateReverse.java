package assignment6;
import java.util.*;

public class ConcatenateReverse {
	public static List concatenateList(List listOne,List listTwo) {
		List new_list= new ArrayList<>();
		for(int i=0;i<listOne.size();i++)
			new_list.add(listOne.get(i));
		for(int i=listTwo.size()-1;i>=0;i--) {
			new_list.add(listTwo.get(i));
		}
		return new_list;
		
	}
	

	public static void main(String[] args) {
		List listOne=new ArrayList<>(Arrays.asList("hello",102,200.8,25));
		List listTwo= new ArrayList<>(Arrays.asList(150,"Welcomme","A"));
		List listthree= concatenateList(listOne,listTwo);
		
		for(int i=0;i<listthree.size();i++)
			System.out.print(listthree.get(i)+"");
		// TODO Auto-generated method stub

	}

}
