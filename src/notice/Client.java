package notice;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Human human = new Human("name", 33 , "여자");

        Board board = new Board();
        board.write(human, "title", "content");

        board.print();
    }
}
