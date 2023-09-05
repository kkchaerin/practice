package ex230905;

public class Main {
    public int solution(String my_string, String target) {
        int answer = 0;

        while(true) {
            String temp = my_string.replace(target, " ");
            if(temp.length() < my_string.length()) {
                answer++;
            } else {
                break;
            }
            my_string = temp;
        }

        return answer;
    }
}
