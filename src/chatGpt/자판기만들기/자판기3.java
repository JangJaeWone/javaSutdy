package chatGpt.자판기만들기;

import java.util.Scanner;

public class 자판기3 {
    public static final int MAX = 3; // 메뉴의 최대 갯수 == 3

    // 전역변수 선언
    static String[] box = new String[MAX]; //문자열 배열 box선언 크기는 max로 정의
    static int[] price = new int[MAX];//정수형 배열 price선언 크기는 max로 정의
    static int[] stock = new int[MAX];//정수형 배열 stock선언 크기는 max로 정의
    static int count = 3; // 메뉴의 갯수
    static Scanner sc = new Scanner(System.in); //입력받을수 있는 장치

    // 처음 자판기를 초기화 하는 함수
    public static void 매뉴() {
        box[0] = "콜라"; //매뉴
        price[0] = 500; //가격
        stock[0] = 3; //재고
        box[1] = "사이다"; //매뉴
        price[1] = 1000; //가격
        stock[1] = 3; //재고
        box[2] = "맥주"; //매뉴
        price[2] = 3000; //가격
        stock[2] = 3; //재고
    }
    public static void user() {
        Boolean first = true; //초기값을 트루로 적용
        int money = 0; //처음 머니의 값은 0

        while(true) {//매뉴판
            System.out.println("==================================================");
            System.out.println("음료 자판기 입니다.");
            for(int i = 0 ; i < count; i++) {
                System.out.print((i+1) + ":" + box[i] + "(" + price[i] + "W)-" + stock[i] + "개   ");
            }//음료자판기 매뉴 출력 반복을 활용하여 매뉴가 전부 표시된다.
            //음료 가격 재고 출력
            System.out.println();
            System.out.println("==================================================");

            if(first){//첫 실행 화면
                System.out.print("돈을 넣어주세요: ");
                money = sc.nextInt(); //돈을 입력받음
                first = false; //한번만 실행
            }

            System.out.print("메뉴 입력: ");
            int ii = sc.nextInt(); //매뉴 번호를 입력받음

            if(money >= price[ii-1]) { // 돈이 충분한지 확인

                if(stock[ii-1] > 0) {// 재고가 충분한지 확인
                    money = money - price[ii-1]; //제품가격만큼 입력받은 돈 뺴기
                    stock[ii-1]--;//재고 감소

                    System.out.println(box[ii-1] + "음료를 구매했습니다");//제품 출력
                }
                else {//재고가 충분하지 않다면 없다고 출력
                    System.out.println("음료가 없습니다.");
                    continue; // 반복작업을 중단했다가 다시 반복
                }
            }
            else {//돈이 충분하지 않다면 금액이 부족하다고 출력
                System.out.println("금액이 부족합니다!");
            }

            System.out.println("잔액 : " + money); //잔액 출력

            // 모든 돈을 사용하면 이용 종료 후 초기화면 진입
            if(money == 0) {//남은돈이 0이라면
                System.out.println("감사합니다.");
                first = true; //한번만 실행
                continue; // 반복작업을 중단했다가 다시 반복
            }

            // 돈이 남아있다면 선택지를 줌.
            System.out.println("1: 계속 구매하기 2: 금액 추가하기 3: 잔돈 반환하기 ");
            System.out.print("번호를 입력하세요: ");
            int iii = sc.nextInt();//번호를 입력받음

            if(iii == 1) {//계속 구매하기
                continue; // 반복작업을 중단했다가 다시 반복
            }
            else if (iii == 2) {//금액 추가하기
                System.out.print("돈을 넣어주세요 : ");
                int extra = sc.nextInt();//돈 입력
                money += extra;//원래 있는 돈에 새로 입력한 돈 추가
                System.out.println("금액이 추가되었습니다! 잔액: " + money);
            }

            else if(iii == 3) {//잔돈 반환하기
                System.out.println("거스름돈 " + money + "원이 반환됩니다.");//기존에 있는 돈 출력
                System.out.println("감사합니다.");
                break;// 반복문 종료
            }
        }
    }
    public static void main(String[] args) {
        매뉴(); //메뉴 실행
        user(); // 유저 실행
    }
}

