package b_Zadania_domowe.a_Dzien_1;

public class BankAccount {
    private int number;
    private double cash;

    public BankAccount(int number) {
        this.number = number;
        this.cash = 0;
    }

    public int getNumber() {
        return this.number;
    }

    public double getCash() {
        return this.cash;
    }

    public void depositCash(int amount) {
        if (amount > 0) {
            this.cash += amount;
        }
    }

    public double withdrawCash(int amount) {
        if (amount > cash) {
            this.cash = 0;
            return cash;
        } else {
            this.cash -= amount;
            return amount;
        }
    }
    public String printInfo(){
        return number + " " + cash;
    }
}
