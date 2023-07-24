package ex230427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1004 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        while(T-- > 0){
            st = new StringTokenizer(br.readLine(), " ");

            // 출발점
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());

            // 도착점
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine(), " ");

            // 행성계의 개수
            int n = Integer.parseInt(st.nextToken());
            int total = 0;
            while (n-- > 0){
                st = new StringTokenizer(br.readLine(), " ");

                // 행성계의 중점과 반지름
                int c1 = Integer.parseInt(st.nextToken());
                int c2 = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                if (Math.pow(x1-c1, 2) + Math.pow(y1-c2, 2) < Math.pow(r, 2)
                        && Math.pow(x2-c1, 2) + Math.pow(y2-c2, 2) < Math.pow(r, 2)) {
                    continue;
                } else if (Math.pow(x1-c1, 2) + Math.pow(y1-c2, 2) < Math.pow(r, 2)
                        || Math.pow(x2-c1, 2) + Math.pow(y2-c2, 2) < Math.pow(r, 2)) {
                    total ++;
                }
            }

            sb.append(total).append("\n");

            // 행성계 진입/이탈 개수

        }
        System.out.println(sb);

    }

}
