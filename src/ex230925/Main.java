package ex230925;
import java.util.Arrays;
public class Main {
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A); //오름차순
        Arrays.sort(B); //오름차순

        for(int i=0; i<A.length; ++i){
            answer += (A[i]*B[B.length-1-i]);
        }

        return answer;
    }
}
