package ex230921;

public class Main {
    public String solution(String s) {
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        String[] arr = s.split(" ");
        for(int i=0; i<arr.length; ++i){
            int temp = Integer.parseInt(String.valueOf(arr[i]));
            min = Math.min(min, temp);
            max = Math.max(max, temp);
        }
        return min + " " + max;
    }
}
