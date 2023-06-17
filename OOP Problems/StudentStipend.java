import java.util.*;
public class StudentStipend {
    public double calculatetotalstipend()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student id");
        String id=sc.nextLine();
        System.out.println("Enter avg marks");
        double avg=sc.nextDouble();
        double stipend=100.0;
        if(avg>=85 && avg<90)
        {
            stipend+=10;
        }
       else if(avg>=90 && avg<=95)
        {
            stipend+=15;
        }
        else if(avg>95 && avg<100)
        {
            stipend+=20;
        }

        System.out.println("Final stipend of the student "+id+"= "+stipend);
        return stipend;
    }
    public static void main(String args[])
    {
        StudentStipend obj=new StudentStipend();
        obj.calculatetotalstipend();
    }
}
