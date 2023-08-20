package ex230820;

public class Main3 {
    public int solution(int n) {
        int answer = 0;

        int len = String.valueOf(n).length();
        for(int i=0;i<len;++i){
            answer += n / Math.pow(10, len-1-i);
            n = (int) (n % Math.pow(10, len-1-i));
        }

        return answer;
    }
}
