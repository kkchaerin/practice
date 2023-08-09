package ex230809;

public class Main {
    public static void main(String[] args){
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
    }

    public static Boolean solution(int x) {
        int temp = 0, tempX = x;
        while(tempX > 0) {
            temp += tempX%10;
            tempX = tempX/10;
        }

        if(x % temp == 0) return true;
        else return false;
    }
}
