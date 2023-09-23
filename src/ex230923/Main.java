package ex230923;

public class Main {
    public int solution(int n) {
        int answer = 0;
        String binN = Integer.toBinaryString(n);
        int cnt = getCnt(binN);
        for(int i=n+1;;++i) {
            String bin = Integer.toBinaryString(i);
            if (cnt == getCnt(bin)) {
                return i;
            }
        }
    }

    public int getCnt(String n) {
        int cnt = 0;
        for(int i=0; i<n.length(); ++i) {
            if('1' == n.charAt(i)) {
                cnt++;
            }
        }
        return cnt;
    }
}
