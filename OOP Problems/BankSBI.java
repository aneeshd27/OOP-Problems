import java.util.*;
class Customer
{
  private  String name,age,address;
}
class Account
{
    String acc,branchType;
}
class RBI {
    int withLimit, n;
    double A, P, r;
    float t;
    long avg, tot, mb;

    int setWithdrawalLimit() {
        Scanner sc = new Scanner(System.in);
        String actype = sc.nextLine();
        String brtype = sc.nextLine();
        if (actype.equals("SAVINGS") && brtype.equals("METRO")) {
            withLimit = 5000;
        } else {
            withLimit = 4000;
        }
        return withLimit;
    }

    static class SBI extends RBI { // Child class1
        double setInterestRate() {
            A = P * (1 + r / n) + n * t;
            return A;
        }

        long setMAB() {
            mb = (avg + tot) / 30;
            return mb;
        }
    }

    static class ICICI extends RBI { // Child class2
        double setInterestRate() {
            A = (P * r) / n + t;
            return A;
        }

        int setWithdrawalLimit() {
            withLimit = 7000;
            return withLimit;
        }
    }

    public static class bank30 { //Tster code
        public static void main(String args[]) {
            SBI sbi = new SBI();
            ICICI icici = new ICICI();
            sbi.P = 10.433;
            sbi.r = 7.42;
            sbi.n = 5;
            sbi.t = 7;
            double sbiInt = sbi.setInterestRate();
            System.out.println("SBI interest rate is:" + sbiInt);
            int iciciWL = icici.setWithdrawalLimit();
            System.out.println("ICICI withdraw limit is:" + iciciWL);
        }

    }
}



