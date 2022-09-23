public class Java_Q1 {
    public static void main(String[] args){
        int var1=5;
        int var2=2;
        double var3=var1/var2;      // 일반적으로 프로그래밍 언어에서 나누기는 몫만 가져오게 된다. 그래서 변수 var3의 결과 값은 5/2 = "2"
        int var4=(int)(var3*var2);  // var3 = 2, var2 = 2 var4의 값은 4가 출력 된다.
        System.out.println(var4);
    }
}
