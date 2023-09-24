package ex230924;

public class Main {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<s.length(); ++i) {
            char c = s.charAt(i);
            if (c == ' ') {
                answer.append(c);
                continue;
            } else if (i == 0) {
                c = Character.toUpperCase(c);
            } else if (s.charAt(i-1) == ' ') {
                c = Character.toUpperCase(c);
            } else {
                c = Character.toLowerCase(c);
            }
            answer.append(c);
        }

        return answer.toString();
    }
}
