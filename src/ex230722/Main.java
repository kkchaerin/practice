package ex230722;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        int[] answer = solution("2022.05.19", terms, privacies);
        System.out.println(Arrays.toString(answer));

    }
    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {0,0,0,0,0};
        Map<String, Long> termsMap = new HashMap<>();
        for(int i=0; i<terms.length; ++i){
            String[] temp = terms[i].split(" ");
            termsMap.put(temp[0], Long.parseLong(temp[1]));
        }
        int len = 0;
        for(int i=0; i<privacies.length; ++i){
            String[] list = privacies[i].split(" ");

            String[] yyyyMmDd = list[0].split("\\.");
            Long term = termsMap.get(list[1]);

            Long temp = Long.parseLong(yyyyMmDd[2]) + 28L*term;
            yyyyMmDd[2] = String.format("%02d", temp%12);
            yyyyMmDd[1] = String.format("%02d", Long.parseLong(yyyyMmDd[1]) + temp/12%12);
            yyyyMmDd[0] = String.format("%02d", Long.parseLong(yyyyMmDd[0]) + temp/12/12);

            System.out.println("1 :" + today.replace(".", ""));
            System.out.println("2 :" + String.join("", yyyyMmDd).replace(".", ""));
            if(Long.parseLong(today.replace(".", "")) > Long.parseLong(String.join("", yyyyMmDd).replace(".", ""))){
                answer[len++] = i+1;
            }
        }
        return answer;
    }
}
