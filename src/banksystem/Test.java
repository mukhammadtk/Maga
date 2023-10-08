package bANK;

public class Test {

    public static void main(String[] args) {

        SavingsAccount savingsAccount0 = new SavingsAccount(0);
        SavingsAccount savingsAccount1 = new SavingsAccount(0);
        CreditAccount creditAccount = new CreditAccount(0);

        savingsAccount0.addMoney(10_000);
        savingsAccount0.addMoney(5000);
        CheckingAccount c1 = new CheckingAccount(0);
        c1.addMoney(10000);
        c1.pay(1000);
        c1.transfer(savingsAccount0, 5000);
        System.out.println(savingsAccount0.balance);

    }
}
