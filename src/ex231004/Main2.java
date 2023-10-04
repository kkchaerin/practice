package ex231004;

public class Main2 {
    public int solution(int n) {

        // for문으로 피보나치 수열 만들기
        int[] arr = {0, 1};
        for(int i=2; i<=n; i++) {
            int temp  = arr[0] + arr[1];
            arr[0] = arr[1];
            arr[1] = temp % 1234567; // 수가커지면 int 가 깨진다. 따라서 그때그때 나눠준다.
        }
        return arr[1];
    }
}
