package Ex230717;

public class Main {
    public static void main(String[] args){
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        String t = "500220839878";
        String p = "7";
        int answer = 0;
        for(int i=0; i<t.length()-p.length()+1; ++i){

            String temp = t.substring(i, i+p.length());
            System.out.println("temp " + temp + " : " + String.valueOf(i+p.length()));
            if(Long.parseLong(temp) <= Long.parseLong(p)){

                answer++;
            }
        }
        System.out.println(answer);
//        solution(s, skip, index);
    }

    public static String solution(String s, String skip, int index) {
        String answer = "";
        for(int i=0; i<s.length(); ++i) {
            char c = s.charAt(i);

            for(int j=0; j<index; ++j){
                c = (char) (c+1);
                System.out.println(j + " : " + c);

                if(c > 'z'){
                    c -= 26;
                }
                if(skip.contains(String.valueOf(c))) {
                    System.out.println("skip " +c);
                    j--;
                }
            }
            System.out.println("==========");
            answer += c;
        }
        return answer;
    }
}
