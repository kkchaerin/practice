package ex231001;

public class Main {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        while (true) {
            answer[0] ++;
            int oldLen = s.length();
            s = s.replace("0", "");
            int newLen = s.length();
            answer[1] += (oldLen-newLen);

            if(newLen == 1) break;
            s = Integer.toBinaryString(newLen);
        }


        return answer;
    }
}
