package ex231009;

public class Main {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0, 0};
        int x = brown + yellow;

        for(int w=1; w<=x; ++w) {
            for(int h=1; h<=x; ++h) {
                if (w>=h && brown == w+w+h-2+h-2 && yellow == (w-2)*(h-2)) {
                    if (h*w == x) {
                        answer[0] = w;
                        answer[1] = h;
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
