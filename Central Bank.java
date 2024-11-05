/**
 *
 * @author yasso
 */
import java.util.ArrayList;
import java.util.List;
// central bank
public class CentralBank{

    private List<bank> accounts;

// constructor
    public CentralBank() {
        accounts = new ArrayList<>();
    }

//getter
    public bank getAccount(String acc_num) {
        for (bank acc : accounts) {
            if (acc.getAccountNumber().equals(acc_num)) {
                return acc;
            }
        }
        System.out.println("Account not found.");
        return null;
    }

// display
    public void displayAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
        } else {
            System.out.println("Account details:");
            for (bank acc : accounts) {
                System.out.println("Account number: " + acc.getAccountNumber());
                System.out.println("Account holder name: " + acc.getAccountHolderName());
                System.out.println("Account balance: " + acc.getBalance());
            }
        }
    }

// add account
    public void add(bank acc) {
        accounts.add(acc);
        System.out.println("Add Done");
    }

// remove account
    public void remove(String acc_num) {
        bank acc_remove = null;
        for (bank account : accounts) {
            if (account.getAccountNumber().equals(acc_num)) {
                acc_remove = account;
                break;
            }
        }
        if (acc_remove != null) {
            accounts.remove(acc_remove);
            System.out.println("Removed Done");
        } else {
            System.out.println("Account not found");
        }
    }

}

