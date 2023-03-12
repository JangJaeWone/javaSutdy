package 객체지향연습.memo;

import java.util.Arrays;
import java.util.Scanner;

public class Client {
    static Memo[] memos = new Memo[100];
    static int index = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.메모 전체보기");
            System.out.println("2.메모 상세보기");
            System.out.println("3.메모 수정하기");
            System.out.println("4.메모 작성하기");
            System.out.println("5.메모 삭제하기");
            System.out.println("6.종료하기");
            int number = sc.nextInt();
            if (number == 1) {
                System.out.println("메모 전체보기");
                for (int i = 0; i < index; i++) {
                    Memo memo = memos[i];
                    System.out.println();
                    System.out.println(i + 1 + "------------------------------");
                    memo.info();
                    System.out.println("------------------------------");
                    System.out.println();

                }
            } else if (number == 2) {
                System.out.println("메모 상세보기");
                System.out.println("상세보기를 원하는 메모의 번호를 입력하시오");
                int i = sc.nextInt();
                Memo memo = memos[i - 1];
                System.out.println();
                System.out.println("------------------------------");
                memo.detail();
                System.out.println("------------------------------");
                System.out.println();

            } else if (number == 3) {
                System.out.println("메모 수정하기");
                System.out.println("수정할 메모의 번호를 입력하시오");
                int i = sc.nextInt();
                Memo memo = memos[i - 1];
                System.out.println("제목를 입력하시오");
                String title = sc.next();
                System.out.println("내용을 입력하시오");
                String content = sc.next();
                memo.update(title, content);
                System.out.println("수정되었습니다.");

            } else if (number == 4) {
                System.out.println("메모 작성하기");
                System.out.println("제목를 입력하시오");
                String title = sc.next();
                System.out.println("내용을 입력하시오");
                String content = sc.next();
                System.out.println("날짜를 입력하시오");
                String date = sc.next();

                Memo memo = new Memo(title, content, date);
                memos[index++] = memo;

            } else if (number == 5) {

                System.out.println("삭제할 메모 입력하세요: ");
                int deleteIndex = sc.nextInt();

                // 입력받은 인덱스가 유효한지 확인
                if (deleteIndex > 0 && deleteIndex <= index) {
                    // 삭제할 메모 이후의 메모들을 앞으로 한 칸씩 이동
                    for (int i = deleteIndex - 1; i < index - 1; i++) {
                        memos[i] = memos[i + 1];
                    }
                    // 마지막 요소를 null로 설정
                    memos[index - 1] = null;
                    // 메모 개수 감소
                    index--;
                    // 배열 크기 줄이기
                    memos = Arrays.copyOf(memos, index);
                    System.out.println("메모가 삭제되었습니다.");
                } else {
                    System.out.println("잘못된 인덱스입니다.");
                }
            } else if (number == 6) {
                System.out.println("종료하기");
                break;

            }

        } /*else if (number == 7) {
                System.out.println("메모 삭제하기");
                String memoIndex = sc.next();

                boolean found = false;
                for (int i = 0; i < index; i++) {
                    Memo memo = memos[i];
                    if (memo.getIndex() == memoIndex) {
                        System.out.println(memoIndex + "번 메모를 삭제합니다");
                        found = true;
                        for (int j = i; j < index - 1; j++) {
                            memos[j] = memos[j + 1];
                        }
                        index--;
                        break;
                    }
                }

                if (found) {
                    System.out.println("====삭제 후 정보====");
                    for (int i = 0; i < index; i++) {
                        Memo memo = memos[i];
                        System.out.println((i + 1) + "------------------------------");
                        memo.info();
                        System.out.println("------------------------------");
                        System.out.println();
                    }
                } */


    }
}


