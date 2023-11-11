package banksystem;

public abstract class Account {

        public int balance;



        public Account(int balance) {
            this.balance = balance;
        }
        public void getBalance(Account account) {
            System.out.println(account + ": "+ "Баланс " + balance);
        }

        public abstract void pay(int amount);

        public abstract void transfer(Account account, int amount);

        public abstract void addMoney(int amount);


    }


