package practice_oop;

public class Supplier extends User implements iSupplier, iReader {
    public Supplier(String name) {
        super(name);
    }

    @Override
    public void bringBook() {
        System.out.println("Поставщик привез книги в библиотеку");
    }

    @Override
    public void takeBook() {
        System.out.println("Поставщик взял книгу");
    }

    @Override
    public void returnBook() {
        System.out.println("Поставщик сделал возврат книги");
    }
}
