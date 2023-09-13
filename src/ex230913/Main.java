package ex230913;
import java.util.Stack;
public class Main {
    boolean solution1(String s) {
         if ( s.charAt(0)==')' || s.length() %2 != 0) return false;

         Stack<Character> stack = new Stack<>();
         stack.push(s.charAt(0));
         for (int i=1; i<s.length(); ++i) {
             if(stack.empty()){
                 stack.push(s.charAt(i));
             } else if(stack.peek() == '(' && s.charAt(i) == ')') {
                 stack.pop();
             } else {
                 stack.push(s.charAt(i));
             }
         }

         return stack.empty();
    }

    /*
        solution1 함수는 시간 초과 결과를 받는다.
        solution1 실행 시간의 약 0.5배
        */
    boolean solution2(String s) {
        int cntUnpair = 0;
        for (char ch : s.toCharArray()) {
            cntUnpair += ch == '(' ? 1 : -1; //magic!
            if (cntUnpair < 0) return false;
        }
        return cntUnpair == 0;
    }
}
