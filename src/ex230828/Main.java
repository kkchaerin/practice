package ex230828;

import java.util.*;

public class Main {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        int[] suc = new int[N];
        int[] fail = new int[N];

        for(int i=0; i<N; ++i) {
            for(int j=0; j<stages.length; ++j) {
                if (i+1 <= stages[j]) {
                    suc[i] ++; // 해당 스테이지 도달한 플레이어 수
                }
                if (i+1 == stages[j]){
                    fail[i] ++; // 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수
                }
            }
        }

        // 실패율과 stage 를 같이 저장할 객체
        List<double[]> list = new ArrayList<>();
        for(int i=0; i<N; ++i){
            if(suc[i] == 0) {
                list.add(new double[]{i, 0});
            } else {
                list.add(new double[]{i, (double)fail[i] / suc[i]}); // 실패율
            }
        }

        // 정렬
        list.sort((a,b)->Double.compare(b[1],a[1]));

        for (int i=0; i<list.size(); i++) {
            answer[i] = (int)list.get(i)[0]+1;
        }

        return answer;
    }
}
