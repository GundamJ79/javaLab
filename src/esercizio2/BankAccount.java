package esercizio2;

public class BankAccount {
    private String nameHolder;
    private double balance;
    private static Integer numberAccountCreated = 0;

    public BankAccount() {
        numberAccountCreated++;
    }

    public BankAccount(String nameHolder) {
        numberAccountCreated++;
        this.nameHolder = nameHolder;
    }

    public String getNameHolder() {
        return this.nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public static Integer getNumberAccountCreated(){return numberAccountCreated;}
}
