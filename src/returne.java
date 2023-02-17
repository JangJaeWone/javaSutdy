public class returne {
    public static String aaa(int bbb,int ccc){
        String output = "";
        for (int i =bbb; i<ccc; i++){
            System.out.println(i);
        }
        return output;
    }
    public static void main(String[] args) {
    String result = aaa(1,5);
        System.out.println(result);
    }
}
