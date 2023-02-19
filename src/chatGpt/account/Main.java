package chatGpt.account;

import java.util.Scanner;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Main {
    static Account account;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp;

        do {
            System.out.println("");
            System.out.println("반갑습니다 은행입니다.");
            System.out.println("원하시는 메뉴를 입력해주세요.");
            System.out.println("0. 종료");
            System.out.println("1. 계좌 등록");
            System.out.println("2. 계좌 조회");
            System.out.println("3. 계좌 입금");
            System.out.println("4. 계좌 출금");
            System.out.println("");

            tmp = sc.nextInt();

            switch (tmp) {
                case 1: {
                    System.out.println("계좌 이름을 말씀해주세요");
                    String name = sc.next();
                    System.out.println("계좌 주인분 이름을 말씀해주세요");
                    String owner = sc.next();
                    account = new Account(name, owner, 0);
                    break;
                } case 2: {
                    if( nonNull(account)) account.displayInfo();
                    else System.out.println("계좌가 없습니다.");
                    break;
                } case 3 : {
                    if( isNull(account)) {
                        System.out.println("계좌가 없습니다.");

                    } else {
                        System.out.println("입금하실 금액을 입력해주세요");
                        int money = sc.nextInt();
                        account.deposit(money);
                    }
                    break;
                } case 4 : {
                    if( isNull(account)) {
                        System.out.println("계좌가 없습니다.");

                    } else {
                        System.out.println("출금하실 금액을 입력해주세요");
                        int money = sc.nextInt();
                        account.withdraw(money);
                    }
                    break;
                }
            }


        }while (tmp != 0);

    }
}
