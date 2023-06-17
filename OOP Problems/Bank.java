 abstract  class Bankof
 {
    abstract void getBalance();
 }
 class BankofA extends Bankof
 {
     public void getBalance()
     {
        System.out.println("The Balance of bank 1 is 100$");
     }
 }
class BankofB extends Bankof
 {
     public void getBalance()
     {
         System.out.println("The balance of Bank 2 is 150$");
     }
 }
 class BankofC extends Bankof
 {
     public void getBalance()
     {
         System.out.println("The balance of bank 3 is 200$");
     }
 }
 public class Bank1
 {
     public static void main(String args[])
     {
         BankofA a=new BankofA();
         BankofB b=new BankofB();
         BankofC c=new BankofC();
         a.getBalance();
         b.getBalance();
         c.getBalance();
     }
 }
