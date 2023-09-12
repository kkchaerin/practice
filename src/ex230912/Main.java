package ex230912;
import java.util.*;
public class Main {
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length(); ++i) {

            if (!stack.empty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        if(stack.size() == 0) answer = 1;
        return answer;
    }
}
