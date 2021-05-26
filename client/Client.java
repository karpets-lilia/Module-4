package client;

import java.util.ArrayList;
import java.util.Comparator;

public class Client {
    private String firstName;
    private String lastName;
    private String passportID;
    private ArrayList<BankAccount> accounts;

    Client(String firstName, String lastName, String passportID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportID = passportID;
        accounts = new ArrayList<>();
    }

    public String getBalance() {
        double balance = 0;
        for (BankAccount bankAccount : accounts) {
            balance += bankAccount.getBalance();
        }
        return String.format("%.2f dollars", balance);
    }

    public String getBalancePositiveAccounts() {
        double balance = 0;
        for (BankAccount bankAccount : accounts) {
            if (bankAccount.getBalance() > 0) {
                balance += bankAccount.getBalance();
            }

        }
        return String.format("%.2f dollars", balance);
    }

    public String getBalanceNegativeAccounts() {
        double balance = 0;
        for (BankAccount bankAccount : accounts) {
            if (bankAccount.getBalance() < 0) {
                balance += bankAccount.getBalance();
            }

        }
        return String.format("%.2f dollars", balance);
    }

    public void sortByBalance() {
        accounts.sort(Comparator.comparing(BankAccount::getBalance));
    }

    public BankAccount getAccount (long id) {
        for (BankAccount client : accounts) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null;
    }

    void openBankAccount (BankAccount account) {
        accounts.add(account);
    }

    public void blockBankAccount (long id) {
        for (BankAccount bankAccount : accounts) {
            if(bankAccount.getId() == id) {
                bankAccount.block();
            }
        }
    }

    public void unlockBankAccount (long id) {
        for (BankAccount bankAccount : accounts) {
            if(bankAccount.getId() == id) {
                bankAccount.unlock();
            }
        }
    }

    public String getInformation () {
        String information = "";
        for (BankAccount bankAccount : accounts) {
            information += String.format("#%d, balance: %.2f dollars, status: %s\n",
                    bankAccount.getId(), bankAccount.getBalance(), bankAccount.getStatus());
        }
        return String.format("Client %s has accounts:\n%s", toString(), information);
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }
    public String getPassportID() {
        return passportID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return String.format("%s %s, Passport: %s", firstName, lastName, passportID);
    }
}
