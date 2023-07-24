package ex230426;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex1003 {

    static Integer[][] dp = new Integer[40][40];

    static int zero;
    static int one;
    static int zeroPlusOne;

    public static void main(String[] args) throws IOException {
        // 재귀 호출 방식
        // recursive_way();

        // 반복문 방식
        for_way();
    }

    static void for_way() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            fib2(N);

            sb.append(one).append(" ").append(zero).append("\n");
        }

        System.out.println(sb);
    }

    static void fib2(int N) {
        zero = 1;
        one = 0;
        zeroPlusOne = 1;

        for (int i=0; i<N; i++) {
            zero = one;
            one = zeroPlusOne;
            zeroPlusOne = zero + one;
        }
    }


    static void recursive_way() {
        Scanner sc = new Scanner(System.in);

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        int T = sc.nextInt();
        while (T-- > 0){
            int n = sc.nextInt();

            fib(n);

            System.out.println(dp[n][0] + " " + dp[n][1]);
        }
    }

    static Integer[] fib(int N) {
        if(dp[N][0] == null || dp[N][1] == null){
            dp[N][0] = fib(N-1)[0] + fib(N-2)[0];
            dp[N][1] = fib(N-1)[1] + fib(N-2)[1];
        }

        return dp[N];
    }
}

/**
 * 동적 계획법(Dynamic Programming : DP)
 * : 주어진 문제를 작은 문제로 쪼개서 풀어나감에 있어 반복되는 호출을 줄이는 방법
 * - 이미 풀렸던 값을 재활용한다. (= Memoization)
 * - 피보나치와 같은 재귀함수 호출의 반복을 줄여서 코드를 작성할 수 있다.
 */
