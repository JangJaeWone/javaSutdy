package et;

public class Method2 {
   int b,c;
   public void ad(int b,int c){
       this.b = b;
       this.c = c;
   }
   public void as(){
       System.out.println(this.b+this.c);
   }
    public static void main(String[] args) {
       Method2 a1 = new Method2();
       a1.ad(10,10);
       a1.as();


    }
}
