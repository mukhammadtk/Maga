package banksystem;

public class CreditAccount extends Account {
    private int limit = 50_000;

    public CreditAccount(int balance) {
        super(balance);
    }

    @Override
    public void pay(int amount) {
        if ((amount + Math.abs(balance)) > limit) {
            System.out.println("Вы превысили лимит по операциям");
            return ;
        } else {
            System.out.println("Совершен платеж на " + amount + " тенге");
            balance -= amount;
            System.out.println("Баланс кредитного счета составляет " + balance + " тенге");
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Сумма в размере " + amount + " тенге " + "переведена на " + account);
        balance -= amount;
        System.out.println("Баланс кредитного счета составляет " + balance);
    }

    @Override
    public void addMoney(int amount) {
        if (balance + amount > 0) {
            System.out.println("Сумма пополнения не должна превышать " + Math.abs(balance) + " тенге");
        } else {
            System.out.println("Ваш баланс пополнен на " + amount + " тенге");
            balance += amount;
            System.out.println("Баланс кредитного счета составляет " + balance + " тенге");
        }

    }

    public String toString() {
        return "Кредитный счет";
    }
}
