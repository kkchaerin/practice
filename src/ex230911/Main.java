package ex230911;
import java.util.*;
public class Main {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        int turn = 1;
        Map<String, Integer> map = new HashMap<>();
        map.put(words[0], 1);
        for (int i=1; i<words.length; ++i) {

            if(i%n == 0){
                turn++;
            }
            map.put(words[i], map.getOrDefault(words[i], 0)+1);

            if (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
                //1. 끝말잇기 실패
                answer[0] = i%n+1;
                answer[1] = turn;
                return answer;
            } else if(map.get(words[i]) > 1) {
                //2. 중복된 단어 사용
                answer[0] = i%n+1;
                answer[1] = turn;
                return answer;
            }

        }

        return answer;
    }
}
