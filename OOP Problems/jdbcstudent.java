package jdbc;
import java.sql.*;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll number:");
		int rno=sc.nextInt();
		System.out.println("Enter name :");
		String name=sc.next();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","amay");  
			Statement st= con.createStatement();
			String s=" insert into student values('"+rno+"','"+name+"')";
			st.executeUpdate(s);
			System.out.println("Record registered successfully.");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Enter rollno to be deleted :");
		int rno1=sc.nextInt();
		
		delete(rno1);
		
		System.out.println("Enter rollno to be updated :");
		int rno2=sc.nextInt();
		System.out.println("Enter name to be updated :");
		String name1=sc.next();
		update(rno2,name1);
		

	}
	static void delete(int rno) {
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","amay");  
			Statement st= con.createStatement();
			String s=" delete from student where rno='"+rno+"'";
			st.executeUpdate(s);
			System.out.println("Record deleted successfully.");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

}
	
		static void update(int rno,String name1) {
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","amay");  
			Statement st= con.createStatement();
			String s=" update student set sname='"+name1+"'where rno='"+rno+"'";
			st.executeUpdate(s);
			System.out.println("Record updated successfully.");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

}
}
