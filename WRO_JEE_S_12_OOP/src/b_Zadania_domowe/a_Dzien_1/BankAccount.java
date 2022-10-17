package b_Zadania_domowe.a_Dzien_1;

import java.net.SocketOption;

public class BankAccount {
    private int number;
    private double cash=0;

    public BankAccount(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public double getCash() {
        return cash;
    }
    public void depositCash(double amount){
        if(amount>0) {
            cash+=amount;
        }else{
            System.out.println("wartoś dodanyych pieniędzy musi być dodatnia");
        }
    }
    public double withdrawCash(double amount){
        if(amount>0){
            cash-=amount;
            if (cash<0){
                amount+=cash;
                cash=0;
            }
            return amount;
        }
        else {
            System.out.println("wartość wypłacanych pieniędzy musi być dodatnia");
            return 0;
        }
    }
    public String printInfo(){
        return "nr konta: "+number+" stan konta: "+cash;
    }
}
