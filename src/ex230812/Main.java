package ex230812;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i< nums.length; ++i) {
            if (i+2 >= nums.length) break; // 이거 무슨 의미..?
            for(int j=i+1; j<nums.length; ++j) {
                for(int h=j+1; h< nums.length; ++h) {
                    if(isPrim(nums[i] + nums[j] + nums[h])){
                        answer ++;
                    }
                }
            }
        }

        return answer;
    }

    public static Boolean isPrim (int n) {
        boolean res = true;
        if(n==2) return res;
        for(int i=2; i<n; ++i) {
            if(n%i ==0 ) {
                return false;
            }
        }
        return true;
    }
}
