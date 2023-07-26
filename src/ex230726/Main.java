package ex230726;

public class Main {
    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        solution(babbling);
    }
    public static int solution(String[] babbling) {
        int answer = 0;

        for(String s : babbling) {
//            if(s.contains("yeye")) {
//                continue;
//            }
            s = s.replace("aya", "");
            s = s.replace("ye", "");
            s = s.replace("woo", "");
            s = s.replace("ma", "");

            if(s.length() == 0) answer ++;
        }

        return answer;
    }
}
