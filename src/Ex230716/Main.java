package Ex230716;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};
        solution(keymap, targets);
    }

    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = {0,0};


        Map<Character, Integer> cntMap = new HashMap<>();
        for(int i=0; i<keymap.length; ++i){
            for (int j = 0; j < keymap[i].length(); ++j) {
                char c = keymap[i].charAt(j);
                if(cntMap.containsKey(c)) {
                    if(j+1 < cntMap.getOrDefault(c, 0)){
                        cntMap.put(c, j+1);
                    }
                } else {
                    cntMap.put(c, j+1);
                }
            }
        }
        System.out.println("cntMap" + cntMap);

//        for(int i=0; i<targets.length; ++i) {
//            int cnt = 0;
//            for(int j=0; j<targets[i].length(); ++j) {
//                System.out.println("targets[i].charAt(j)" + targets[i].charAt(j));
//                cnt += cntMap.getOrDefault(targets[i].charAt(j), -1);
//            }
//            answer[i] = cnt;
//        }

        return answer;
    }
}
