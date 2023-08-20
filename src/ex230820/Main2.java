package ex230820;

import java.util.*;

public class Main2 {
    public int[] solution(long n) {
        int[] answer = {};

        String temp = String.valueOf(n);
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<temp.length(); ++i){
            list.add(Character.getNumericValue(temp.charAt(i)));
        }

        Collections.reverse(list);

        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
