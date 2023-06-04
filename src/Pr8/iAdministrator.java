package Pr8;

public interface iAdministrator extends iReader {

    void findBook();

    void overdueNotification(Reader reader);
}
