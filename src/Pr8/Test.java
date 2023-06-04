package Pr8;

public class Test {

    public static void main(String[] args) {

        Reader r1 = new Reader("Dias");
        r1.takeBook();


        Administrator administrator = new Administrator("Ayan");
        administrator.overdueNotification(r1);
        r1.returnBook();
        Supplier s1 = new Supplier("Maga");

        Librarian l1 = new Librarian("Nurik" , "Игра Престолов");
        l1.orderBook(s1);
    }
}


