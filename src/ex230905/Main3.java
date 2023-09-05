package ex230905;

public class Main3 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length-n+1];
        for(int i=0; i<answer.length; ++i) {
            answer[i] = num_list[n+i-1];
        }
        return answer;
    }
}
