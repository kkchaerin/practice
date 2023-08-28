package ex230828;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void solution() {
        Main main = new Main();
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] answer = {3,4,2,1,5};
        assertArrayEquals(main.solution(5, stages), answer);
    }
}