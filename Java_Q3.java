import java.util.Random;

public class Java_Q3 {
    public static void main(String[] args){

        System.out.println("시작!");

        while(true){ // 무한 반복
            int r1 = (int)(Math.random()*6); // 1~6까지 랜덤으로 숫자를 생성
            int r2 = (int)(Math.random()*6);
            int r3 = 0; // r1, r2의 더한 값을 넣기 위한 변수 선언

            r3 = r1 + r2;

            System.out.println("("+r1+","+r2+")");

            if(r3 == 5){ // 더한 값이 5이면 무한 반복 종료
                System.out.println("끝!");
                break;
            }
        }
    }
}
