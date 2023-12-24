import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    public static Scanner in = new Scanner(System.in);
    public List<Account> accountList;

    Bank()
    {
        this.accountList = new ArrayList<>();
    }

    public void addAccount(Account account)
    {
        accountList.add(account);
    }

    public void displayAllAccount()
    {
        for (Account acc : accountList)
        {
            System.out.println(acc);
        }
    }

    public void depositMoney()
    {
        System.out.print("Enter ACC/NO do you want to deposit :: "); String accNo = in.nextLine();
        Account accToDeposit = null;
        for (Account acc : accountList)
        {
            if (acc.getAccountNumber().equals(accNo))
            {
                accToDeposit = acc;
                break;
            }
        }
        if (accToDeposit != null)
        {
            System.out.print("Deposit money to the Acc name -> " + accToDeposit.getName() + " :: ");
            double userAmount = in.nextDouble(); in.nextLine();

            double userBalance = accToDeposit.getBalance();

            userBalance += userAmount;
            accToDeposit.setBalance(userBalance);
            System.out.println("You have been deposit successfully...");
        }else {
            System.out.println("Sorry, please try again!" );
        }
    }

    public void withdrawMoney()
    {
        System.out.print("Enter Acc/NO to withdraw :: ");
        String accNo = in.nextLine();
        Account accToWithdraw = null;
        for (Account acc : accountList)
        {
            if (acc.getAccountNumber().equals(accNo))
            {
                accToWithdraw = acc;
                break;
            }
        }
        if (accToWithdraw != null)
        {
            System.out.print("Enter the amount of money do you wanna withdraw from the acc name -> " + accToWithdraw.getName() + " :: ");
            double amount = in.nextDouble(); in.nextLine();

            if (amount <= accToWithdraw.getBalance())
            {
                double balance = accToWithdraw.getBalance();
                balance -= amount;
                accToWithdraw.setBalance(balance);
                System.out.println("You hava been withdraw successfully...");
            }else {
                System.out.println("Sorry, insufficient funds.");
            }
        }
    }

}
