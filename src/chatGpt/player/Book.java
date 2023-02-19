package chatGpt.player;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private boolean loan=false;

    public Book(String title,String author,String publisher){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    public void print(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(publisher);
        System.out.println(loan);
    }
    public void loan(){// loan() 메서드는 대출을 처리하는 메서드
        if(loan) {
            System.out.println("이미 대출된 도서");
            return;
        }

        System.out.println("대출 되었습니다.");
        loan=true;
    }

    public void returnBook(){//반납을 처리하는 메서드
        if(!loan) {
            System.out.println("해당 도서는 대출 받지 않았습니다.");
            return;
        }

        System.out.println("반납 되었습니다.");
        loan=false;
    }

    public String getTitle() {
        return title;
    }//메서드는 도서 제목을 반환
}
