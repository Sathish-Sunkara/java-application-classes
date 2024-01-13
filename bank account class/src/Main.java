public class Main {
    public static void main(String[] args)
    {
        bank bank = new bank(10000);
        System.out.println(bank.getBalance());
        bank.deposit(1000);
        System.out.println(bank.getBalance());
        bank.withdraw(500);
        System.out.println(bank.getBalance());
        bank.account(5,24);
        System.out.println(bank.getBalance());
        System.out.println(bank.getId());
        System.out.println(bank.getDate());
        System.out.println(bank.NoOfAccounts());
        // second account
        bank bank2 = new bank(100);
        bank2.deposit(50);
        bank2.withdraw(25);
        System.out.println(bank2.getBalance());
        System.out.println(bank2.NoOfAccounts()); // it gives 2 accounts







    }
}

class bank {
    private String id = "21A31A05J1";
    private String date = "20/04/2004";
    private static int accounts = 0 ;

    public String getId() {return this.id;}

    public String getDate() {
        return this.date;
    }

    private double balance;

    public bank() {
        this.balance = 0;
        accounts += 1 ;
    }

    public bank(double a) {
        accounts += 1 ;
        this.balance = a;
    }

    //getters()
    public double getBalance() {
        return this.balance;
    }


    public void deposit(double a) //adds money to balance
    {
        this.balance += a;
    }

    public void funds()    // it is called when problem with withdraw
    {
        System.out.println("not sufficient balance to withdraw !!!!");

    }

    public void withdraw(double a) //reduce money from balance
    {
        if (a > this.balance) {
            this.funds();
        } else {
            this.balance -= a;
        }
    }
    public void account(double rate, double time)  //return total money when time and rate is given
    {
        this.balance += ((this.balance * rate * time) / 100);

    }
    // gives how many accounts opened in this bank
    // static variable "accounts"  is created this counts no. of objects
    public int NoOfAccounts()
    {
        return accounts ;
    }
}


