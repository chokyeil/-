public class Java_Q2 {
    public static void main(String[] args){
        int x=10;
        int y=20;
        int z = (++x) + (y--);  //++x는 먼저 +1을 하고 값을 사용, y--는 값을 사용 한후 -1 하기 때문에
                                // x = 11 y = 20 의 상태에서 더하게 되어 z에는 31의 값이 대입된다.
        System.out.println(z);
    }
}
