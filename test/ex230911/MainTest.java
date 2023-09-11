package ex230911;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void solution() {
        Main main = new Main();
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        int[] result = {1,3};
        assertArrayEquals(main.solution(2, words), result);
    }
}