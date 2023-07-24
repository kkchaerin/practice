package ex230514;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Ex1005 {

    // 특정 건물을 지을 때까지 걸리는 최소 시간을 안아내는 프로그램
    public void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        while(T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            // 건물 개수
            int N = Integer.parseInt(st.nextToken());
            // 건설 순서 규칙의 총 개수
            int K = Integer.parseInt(st.nextToken());

            // 건설에 걸리는 시간
            st = new StringTokenizer(br.readLine(), " ");
            int d[] = new int[N];
            for(int i=0; i<N; i++) {
                d[i] = Integer.parseInt(st.nextToken());
            }

            // 건설 순서
            st = new StringTokenizer(br.readLine(), " ");
            int xy[][] = new int[K][2];
            for(int i=0; i<K; i++) {
                xy[i][0] = Integer.parseInt(st.nextToken());
                xy[i][1] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine(), " ");
            int W = Integer.parseInt(st.nextToken());

            // W 건물을 짓는데 걸리는 최소 시간은?

            // 뭔....? 순회 어쩌고...ㅠㅠ
        }

    }


}
