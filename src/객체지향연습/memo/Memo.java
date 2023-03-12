package 객체지향연습.memo;

import java.util.Scanner;

public class Memo {
    private String title;
    private String content;
    private String createdAt;

    public Memo(String title, String content, String createdAt) {
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void detail() {
        System.out.println(this.title);
        System.out.println(this.content);
        System.out.println(this.createdAt);
    }

    public void info() {
        System.out.println(this.title);
        System.out.println(this.createdAt);
    }

    public void 메모작성() {
        Scanner sc = new Scanner(System.in);
        String i = sc.next();
    }

    public void 메모수정() {
        Scanner sc = new Scanner(System.in);
        String ii = sc.next();
    }
}

