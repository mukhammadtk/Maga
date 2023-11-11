package biblary_system;

public class Library {

        private Book availableBook;

        public void lendBook(Book book) {
            if (availableBook == null) {
                availableBook = book;
                System.out.println("Библиотека одолжила книгу: " + book.getBookId());
            } else {
                System.out.println("Библиотека уже одалживала книгу");
            }
        }

        public void receiveBook() {
            if (availableBook != null) {
                System.out.println("Библиотека получила возвращенную книгу: " + availableBook.getBookId());

            } else {
                System.out.println("У библиотеки нет книг для возврата");
            }
        }
    }


