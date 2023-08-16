package ex230816;

public class Main2 {
    public int solution(int n) {
        int answer = 0;

        StringBuffer sb = new StringBuffer(Integer.toString(n, 3));
        String reversedStr = sb.reverse().toString();

        for(int i=0; i<reversedStr.length(); i++){
            answer += Math.pow(3, reversedStr.length()-i-1) * Character.getNumericValue(reversedStr.charAt(i));
        }

        return answer;
    }
}
