package bANK;

public class CheckingAccount extends Account{
    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void pay(int amount) {
        if (Math.abs(amount) > balance) {
            System.out.println("Сумма платежа превышает баланс на рассчетном счету");
        }else {
            System.out.println("Совершен платеж на сумму " + amount + " тенге");
            balance -= amount;
        }
    }


    @Override
    public void transfer(Account account, int amount) {
if(amount > balance) {
    System.out.println("Сумма перевода превышает баланс на карте . Ваш рассчетный баланс: " + balance);
}else{
    System.out.println("Сумма в размере " + amount + " переведен на " +account);
    balance -= amount;
    System.out.println("Ваш остаток на рассчетном счету " + balance);
}
}


    @Override
    public void addMoney(int amount) {
        System.out.println("Баланс рассчетного счета пополнен на " + amount + "тенге");
        balance += amount;
        System.out.println( "Ваш баланс рассчетного счета составляет " + balance);
    }
}
