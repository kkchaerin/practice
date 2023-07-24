package ex230424;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1002 {
    public static void main(String args[]) throws IOException {
        // 조규현 좌표와 백승환 좌표 + 조규현의 거리 + 백승환의 거리를 이용해
        // 적(류재명)이 있을 수 있는 좌표의 수를 출력하라

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int y1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(tangent_point(x1, x2, r1, y1, y2, r2)).append("\n");
        }

        System.out.println(sb);

    }

    public static int tangent_point(int x1, int x2, int r1, int y1, int y2, int r2) {
        int distance = (int)Math.pow((Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)), 0.5);

        // case 1. 중점이 같으면서 반지름도 같은 경우 -> 무한대(-1)
        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }

        // case 2. 두 원의 반지름 합보다 중점간 거리가 더 길 때 -> 0
        else if (distance > r1 + r2) {
            return 0;
        }

        // case 3. 원 안에 원이 있으나 내접하지 않을 때 -> 0
        else if (distance < r2- r1) {
            return 0;
        }

        // case 4. 내접할 때 -> 1
        else if (distance == r2 - r1) {
            return 1;
        }

        // case 5. 외접할 때 -> 1
        else if (distance == r1 + r2) {
            return 1;
        }

        // else -> 2
        else {
            return 2;
        }
    }
}
