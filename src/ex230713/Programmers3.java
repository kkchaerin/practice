package ex230713;

import java.util.Arrays;

public class Programmers3 {

    public static void main(String[] args) {

        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};

        System.out.println(Arrays.toString(solution(park, routes)));

    }

    public static int[] solution(String[] park, String[] routes) {
        int[] answer = {0,0};

        // 시작점 구하기
        int w=0, h=0;
        for(int i=0; i<park.length; ++i){
            if (park[i].indexOf("S") > 0) {
                h=i;
                w=park[i].indexOf("S");
                break;
            }
        }
        System.out.println("start h = " + h + " w = " + w);

        // 이동하기
        for (int i=0; i<routes.length; ++i) {
            int oldW = w, oldH = h;
            for(int j=0; j<routes[i].charAt(2)-'0'; ++j) {
                System.out.println("h = " + h + " w = " + w);
                switch(routes[i].charAt(0)){
                    case 'N':
                        h--;
                        break;
                    case 'S':
                        h++;
                        break;
                    case 'W':
                        w--;
                        break;
                    case 'E':
                        w++;
                        break;
                }
                if(w<0 || h<0 || h>park.length-1 || w>park[0].length()-1) {
                    System.out.println("1");
                    // 이동 불가
                    w = oldW;
                    h = oldH;
                    break;
                }
                else if('X' == park[h].charAt(w)){
                    System.out.println("2");
                    w = oldW;
                    h = oldH;
                    break;
                }
            }
        }
        answer[0] = h;
        answer[1] = w;

        return answer;
    }
}
