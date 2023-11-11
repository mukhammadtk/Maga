package practice_oop;

public class Reader extends User implements iReader {
    public Reader(String name) {
        super(name);
    }


    @Override
    public void takeBook() {
        System.out.println("Читатель " + getName() + " взял книгу ");
    }

    @Override
    public void returnBook() {
        System.out.println("Читатель по имени " + getName() + " сделал возврат книги" );
    }


}
