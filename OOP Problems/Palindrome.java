import java.util.*;
public class PalindromeString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        char a[]=s.toCharArray();
        int i;
        char a1[]=new char[s.length()];
        for(i=0;i<s.length();i++)
        {
            a1[i]=a[s.length()-i-1];
        }
        if(Arrays.equals(a,a1))
        {
            System.out.println("Palindrome strings");
        }
        else
        {
            System.out.println("Non-palindrome strings");
        }
    }
}
