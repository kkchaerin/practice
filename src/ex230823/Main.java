package ex230823;

import java.util.ArrayList;
import java.util.Arrays;
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

        // 다른 사람 풀이
//        char[] sol = s.toCharArray(); // char[] to Array
//        Arrays.sort(sol); // 정렬 (오름차순)
//        return new StringBuilder(new String(sol)).reverse().toString(); // reverse: 내림차순

        return answer;
    }
}
