/**
 *
 * @author yasso
 */
// bank account
public class bank extends CentralBank{

    private String AccountNumber;
    private String AccountName;
    private double CurrentBalance;

    //constructor
    public bank(String acc_num, String acc_user, double bal) {
        this.CurrentBalance = bal;
        this.AccountNumber = acc_num;
        this.AccountName = acc_user;
    }

    public void checkBalance() {
        System.out.println("Account " + AccountNumber + " balance: " + CurrentBalance);
    }

    // getter
    public String getAccountNumber() {
        return AccountNumber;
    }

    public String getAccountHolderName() {
        return AccountName;
    }

    public double getBalance() {
        return CurrentBalance;
    }

    // transfer money
    public void transfer(double m, bank tar_acc) {
        if (m <= 0) {
            System.out.println("Invalid amount ");
        } else if (m > CurrentBalance) {
            System.out.println("Insufficient balance");
        } else {
            CurrentBalance -= m;
            tar_acc.deposit(m);
            System.out.println("Transferred  Done");
        }
    }

    public void deposit(double m) {
        if (m <= 0) {
            System.out.println("invalid amount for deposit");
        } else {
            CurrentBalance += m;
            System.out.println("Deposited  successful");
        }
    }

    public void withdraw(double m) {
        if (m <= 0) {
            System.out.println("Invalid amount");
        } else if (m > CurrentBalance) {
            System.out.println("Insufficient balance");
        } else {
            CurrentBalance -= m;
            System.out.println("Withdrew  Done");
        }
    }

}
