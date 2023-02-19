package chatGpt.player;

import java.util.HashMap;
import java.util.Map;

public class Library {
    public static final Library LIBRARY_INSTANCE = new Library();
    private Map<String, Book> books = new HashMap<>();

    private Library() {
    }

    public void addBook(Book book) {// 전달된 Book 객체를 도서 목록에 추가합니다.
        books.put(book.getTitle(), book);
    }

    public void lornBook(String title) {//전달된 제목에 해당하는 도서를 대출합니다
        Book book = books.get(title);
        if (book == null) {
            System.out.println("존재하지 않는 도서입니다.");
        } else {
            book.loan();
        }
    }

    public void returnBook(String title) {//전달된 제목에 해당하는 도서를 반납합니다.
        Book book = books.get(title);
        if (book == null) {
            System.out.println("존재하지 않는 도서입니다.");
        } else {
            book.returnBook();
        }
    }

    public void printBook(String title) {// 전달된 제목에 해당하는 도서의 정보를 출력합니다.
        Book book = books.get(title);
        if (book == null) {
            System.out.println("존재하지 않는 도서입니다.");
        } else {
            book.print();
        }
    }
}
