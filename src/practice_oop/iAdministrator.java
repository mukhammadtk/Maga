package practice_oop;

public interface iAdministrator extends iReader {

    void findBook();

    void overdueNotification(Reader reader);
}
