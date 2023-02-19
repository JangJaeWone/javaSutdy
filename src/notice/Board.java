package notice;

public class Board {
    private Human human;
    private String title;
    private String content;

    public void write(Human human,String title,String content){
        this.human = human;
        this.title = title;
        this.content = content;
    }
    public void update(String title,String content){
        this.title = title;
        this.content = content;
    }

    public void print(){
        human.print();
        System.out.println(title);
        System.out.println(content);
    }
}
