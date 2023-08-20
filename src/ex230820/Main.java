package ex230820;

import java.util.*;

public class Main {
    public long solution(long n) {
        long answer = 0;
        List<Character> list = new ArrayList();

        String temp = String.valueOf(n);
        for(int i=0; i<temp.length(); ++i){
            list.add(temp.charAt(i));
        }

        Collections.sort(list);
        Collections.reverse(list);

        for(int i=0; i<list.size(); ++i){
            answer += Character.getNumericValue(list.get(i)) * Math.pow(10, (temp.length()-i-1));
        }

        return answer;
    }
}
