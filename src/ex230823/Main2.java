package ex230823;

import java.util.*;

public class Main2 {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; ++i) map.put(nums[i], map.getOrDefault(nums[i], 0));

        int n = nums.length/2;

        if(map.keySet().size() < n) {
            return map.keySet().size();
        } else {
            return n;
        }
    }
}
