package ex230905;

public class Main2 {
    public int solution(int[] num_list) {
        int answer = 0;
        boolean isPlus = false;
        if (num_list.length >= 11) {
            isPlus = true;
        } else if (num_list.length <= 10) {
            answer = 1;
        }
        for(int i=0; i<num_list.length; ++i){
            if (isPlus){
                answer += num_list[i];
            } else {
                answer *= num_list[i];
            }
        }
        return answer;
    }
}
