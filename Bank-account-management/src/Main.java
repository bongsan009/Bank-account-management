import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Bank bank = new Bank();

        boolean programOn = true;

        do {
            int userOpt = menu();

            switch (userOpt)
            {
                case 1:
                {
                    System.out.println("Enter Name  :: "); String name = in.nextLine();
                    System.out.println("Enter AccNo :: "); String no = in.nextLine();

                    double initialBalance = 0.0;
                    Account newAcc = new Account(name, no, initialBalance);
                    bank.addAccount(newAcc);
                    break;
                }

                case 2:
                {
                    bank.displayAllAccount();
                    break;
                }

                case 3:
                {
                    bank.depositMoney();
                    break;
                }

                case 4:
                {
                    bank.withdrawMoney();
                    break;
                }

                case 5:
                {
                    System.exit(0);
                }
            }
        }while (programOn);



    }
    public static int menu()
    {
        System.out.println("1). Add Account.");
        System.out.println("2). Check Balance.");
        System.out.println("3). Deposit.");
        System.out.println("4). Withdraw.");
        System.out.println("5). Exit.");

        System.out.print("Enter the option above :: "); int userOpt = in.nextInt(); in.nextLine();

        return userOpt;
    }
}