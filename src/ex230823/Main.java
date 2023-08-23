package ex230823;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public String solution(String s) {
        String answer = "";
        List<Character> list = new ArrayList<>();
        for(int i=0; i<s.length(); ++i){
            list.add(s.charAt(i));
        }

        Collections.sort(list);
        Collections.reverse(list);

        for(Character c : list) {
            answer += c;
        }

        return answer;
    }
}
