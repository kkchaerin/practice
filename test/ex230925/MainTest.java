package ex230925;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void solution() {
        Main main = new Main();
        int[] A = {1,4,2};
        int[] B = {5,4,4};
        assertEquals(main.solution(A, B), 29);
    }
}