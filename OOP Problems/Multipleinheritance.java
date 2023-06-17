interface account1 {
    void set();
    void display();
}


interface person1 {
    void store();
    void disp();
}

// Class Customer
public class customer implements person1, account1 {
    private String name;
    private int accountNumber;
    private double balance;

    // Constructor to initialize name, account number, and balance
    public customer(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to set the account information
    public void set() {
        // Code to set the account information
    }


    public void display() {
        //
    }

    // Method to display the account information
    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        // Code to calculate and display the interest
        double p, r, t, si; // principal amount, rate, time and simple interest respectively.
        p = balance; r = 12; t = 1;
        si = (p*r*t)/100;
        System.out.println("Simple interest is: "+si);
    }

    // Method to store the person's information
    public void store() {
        // Code to store the person's information
    }


    public static void main(String[] args) {
        customer c = new customer("Mohit Bang", 1256789345, 100000.0);
        c.set();
        c.display();
        c.store();
        c.disp();
    }

}
