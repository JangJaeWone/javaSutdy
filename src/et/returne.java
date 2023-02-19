package et;

public class returne {
  int b,c;
  public void a(int b,int c){
    this.b = b;
    this.c = c;
  }
  public void as(){
    System.out.println(this.b+this.c);
  }
  public void ad(){
    System.out.println(this.b-this.c);
  }
  public void af(){
    System.out.println(this.b*this.c);
  }
  public void ag(){
    System.out.println(this.b/this.c);
  }
    public static void main(String[] args) {
    returne a1 = new returne();
    a1.a(2,2);
    a1.as();
    a1.ad();
    a1.af();
    a1.ag();
    }
}
