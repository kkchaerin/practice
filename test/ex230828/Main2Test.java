package ex230828;

import org.junit.Test;

import static org.junit.Assert.*;

public class Main2Test {

    @Test
    public void solution() {
        Main2 main = new Main2();
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] answer = {"#####","# # #", "### #", "#  ##", "#####"};
        assertArrayEquals(main.solution(arr1.length, arr1, arr2), answer);
    }
}