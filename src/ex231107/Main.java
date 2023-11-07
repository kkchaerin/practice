package ex231107;

import java.util.*;

public class Main {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people); // 내림차순 정렬

        int index = 0;
        for (int i = people.length - 1; i >= index; i--) {
            // 가장 가벼운 사람 + 가장 무거운 사람
            if (people[i] + people[index] <= limit) {
                index++;
                answer++;
            }
            else {
                answer++;
            }
        }

        return answer;
    }

    public int solution3(int[] people, int limit) {
        int answer = 0;

        // 이미 보트에 탑승한 사람의 인덱스
        Set<Integer> set = new HashSet<Integer>();

        for (int i=0; i<people.length; ++i) {
            Boolean isCounted = false;
            if (set.contains(i)) {
                continue;
            }

            for (int j=1; j<people.length; ++j) {
                if (i==j) {
                    continue;
                }
                else if (set.contains(j)) {
                    continue;
                }
                else if (people[i]+people[j] <= limit) {
                    answer++;
                    isCounted = true;
                    set.add(i);
                    set.add(j);
                    break;
                }
            }
            if (!isCounted) {
                set.add(i);
                answer++;
            }
        }
        return answer;
    }

    public int solution2(int[] people, int limit) {
        int answer = 0;

        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<people.length; ++i) {
            list.add(people[i]);
        }
        Collections.sort(list); // 정렬

        for(int i=0; i<list.size(); ++i) {
            if (i+1 == list.size()) {
                answer++;
                break;
            } if (list.get(i) + list.get(i+1) <= limit) {
                answer++;
                i++;
                continue;
            }
            answer++;
        }

        return answer;
    }
}
