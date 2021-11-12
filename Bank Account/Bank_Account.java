package hw4;

public class Bank_Account {

    public int customerId;
    public String name;
    public String surname;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setDebit(int amount){

        balance=balance+amount;

    }
    public void setCredit(int amount){

        balance=balance-amount;

    }
}
