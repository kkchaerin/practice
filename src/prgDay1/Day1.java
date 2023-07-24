package prgDay1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.util.Objects.nonNull;

public class Day1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//
//        System.out.println(a);

        System.out.println("ooo".length());

        Map<Character, Integer> test = new HashMap<>();


    }
}

/*import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        Map<String, Integer> playersMap = new HashMap<>();
        for(int i=0; i<players.length; ++i) playersMap.push(players[i], i);

        for(int i=0; i<callings.length; ++i) {
            String temp = players[playersMap.get(callings[i]-1)];
            players[playersMap.get(callings[i]-1)] = players[playersMap.get(callings[i])];
            players[playersMap.get(callings[i])] = temp;

            playersMap.put(callings[i], playersMap.get(callings[i]));
            playersMap.put(temp, playersMap.get(temp)+2);
        }
        return players;
    }
}
* */