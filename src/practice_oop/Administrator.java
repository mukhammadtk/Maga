package practice_oop;

public class Administrator extends User implements iAdministrator {


    public Administrator(String name) {
        super(name);
    }

    @Override
    public void findBook() {
        System.out.println("Администратор нашел книгу");
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор по имени " + getName() + " уведомил пользователя " + reader.getName() + " о просрочке" );
    }


    @Override
    public void takeBook() {

    }

    @Override
    public void returnBook() {

    }


}
