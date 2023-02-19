package notice;

import java.util.ArrayList;
import java.util.List;

public class Notice {

    List<Board> boards = new ArrayList<>();

    public void addBoard(Board board){
        boards.add(board);
    }

    public List<Board> getBoards(){
        return boards;
    }
}
