public class Account {
    private String name;
    private String accountNumber;
    private double balance;

    Account(){}

    Account(String name, String accountNumber, double balance)
    {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //Encapsulation
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getName()
    {
        return this.name;
    }

    public String getAccountNumber()
    {
        return this.accountNumber;
    }

    public double getBalance()
    {
        return this.balance;
    }



    public void withdraw(double amount)
    {
        if (amount <= balance)
        {
            balance = balance - amount;
            System.out.println("You have been withdraw successfully...");
        }else {
            System.out.println("Insufficient funds.");
        }

    }

    @Override
    public String toString() {
        return "Name :: " + name + ", AccNO :: " + accountNumber + ", Balance :: " + balance;
    }
}
