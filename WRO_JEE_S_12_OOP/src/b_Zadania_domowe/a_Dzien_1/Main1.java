package b_Zadania_domowe.a_Dzien_1;

import a_Zadania.a_Dzien_1.d_Konstruktor.Person;

public class Main1 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(123);
        bankAccount.depositCash(300);
        System.out.println(bankAccount.withdrawCash(400));
        System.out.println(bankAccount.getCash());
        System.out.println(bankAccount.getNumber());
        System.out.println(bankAccount.printInfo());

    }
}