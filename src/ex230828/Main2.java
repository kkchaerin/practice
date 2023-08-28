package ex230828;

import java.text.DecimalFormat;

public class Main2 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String temp;

        for(int i = 0 ; i < n ; i++){
            temp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
            temp = temp.substring(temp.length() - n);
            temp = temp.replaceAll("1", "#");
            temp = temp.replaceAll("0", " ");
            answer[i] = temp;
        }

        return answer;
    }

    public String[] failedSolution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        // 테스트는 통과했으나, 채점은 실패 (정확성 75%)

        StringBuffer deciFormat = new StringBuffer();
        for (int i=0; i<n; i++) {
            deciFormat.append("0");
        }

        DecimalFormat df = new DecimalFormat(deciFormat.toString());

        for(int i=0; i<n; ++i) {
            String n1 = Integer.toBinaryString(arr1[i]);
            String n2 = Integer.toBinaryString(arr2[i]);
            String temp = "";

            n1 = df.format(Integer.parseInt(n1));
            n2 = df.format(Integer.parseInt(n2));

            for(int j=0; j<n; ++j) {
                char c1 = n1.charAt(j);
                char c2 = n2.charAt(j);

                if (c1 == '1' || c2 == '1') {
                    temp += "#";
                } else {
                    temp += " ";
                }
            }
            answer[i] = temp;
        }
        return answer;
    }
}
