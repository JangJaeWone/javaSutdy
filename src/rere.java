public class rere {
    private String 바퀴;
    private String 엔진;
    private String 색;

    public void as(){
        System.out.println(바퀴);
        System.out.println(엔진);
        System.out.println(색);
    }
    public void ad(){
        System.out.println("시동");
    }
    public void af(String 바퀴,String 엔진,String 색){
        this.바퀴 = 바퀴;
        this.엔진 = 엔진;
        this.색 = 색;
    }
    public static void main(String[] args) {
     rere a1 = new rere();
     a1.af("qwe","asdf","zxcv");
     a1.as();
     a1.ad();

    }
}
