import java.util.*;
public class Fraction {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numerator and denominator of first fraction:");
        double a=sc.nextDouble();
        double b= sc.nextDouble();
        System.out.println("Enter numerator and denominator of second fraction:");
        double a1=sc.nextDouble();
        double b1= sc.nextDouble();
        double ex1=a/b;
        double ex2=a1/b1;
        System.out.println("Addition :"+(ex1+ex2));
        System.out.println("Subtraction :"+String.format("%.2f",ex1-ex2));
        System.out.println("Multiplication :"+(ex1*ex2));
        System.out.println("Division :"+(ex1/ex2));
    }
}
