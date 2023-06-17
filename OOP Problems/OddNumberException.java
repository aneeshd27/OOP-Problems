import java.util.*;
class OddNumberException extends Exception
{
    public String getMessage()
    {
        return "Number is odd";
    }
}
public class OddNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        OddNumberException obj=new OddNumberException();
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n%2!=0)
        {
            try
            {
                throw  new OddNumberException();
            }
            catch (Exception e)
            {
                System.out.println(obj.getMessage());
            }
        }
        else
        {
        System.out.println("Number is even");
        }
    }
}
