package ex230729;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args){
        int answer = 0;
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        solution(k,m,score);
    }

    public static void solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> list = IntStream.of(score).boxed().collect(Collectors.toList());

        list = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        for(int i=1; i<list.size()+1; ++i){
            if (i%m == 0) {
                answer += list.get(i-1) * m;
            }
        }

        System.out.println(answer);
    }

}
