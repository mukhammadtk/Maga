package bANK;

public class SavingsAccount extends Account {


    public SavingsAccount(int balance) {
        super(balance);

    }

    @Override
    public void pay(int amount) {
        System.out.println("Данная операция не может быть совершена");
        return;
    }

    @Override
    public void transfer(Account account, int amount) {
        if (amount > balance) {
            System.out.println("Сумма перевода превышает остаток, введите сумму меньшую " + balance + " тенге");
        } else {
            System.out.println("Сумма в размере " + amount + " тенге " + "переведена на " + account);
            balance -= amount;
            System.out.println("Баланс сберегательного счета составляет " + balance);
        }
    }

    @Override
    public void addMoney(int amount) {
        System.out.println("Ваш баланс пополнен на " + amount + " тенге");
        balance += amount;
        System.out.println("Баланс сберегательного счета составляет " + balance + " тенге");

    }

    public String toString() {
        return "Сберегательный счет";
    }
}
