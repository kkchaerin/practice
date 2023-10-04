package ex231004;

public class Main {
    public int solution(int n) {
        int answer = 1; //n일 경우는 디폴트
        for(int i=1; i<n; ++i) {
            int sum = 0;
            for (int j=i; j<n; ++j) {
                sum += j;
                if (sum == n) {
                    answer ++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }

        return answer;
    }
}
