import java.util.*;
public class Month
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Accept d:");
       int d=sc.nextInt();
       System.out.println("Accept m:");
       int m=sc.nextInt();
       if(d>=3 && d<=6 && m==20)
       {
           System.out.println("True");
       }
       else
       {
           System.out.println("False");
       }

    }
}
