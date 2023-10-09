package ex231009;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void solution() {
        Main main = new Main();
        int[] ret = {8,6};
        assertArrayEquals(main.solution(24, 24), ret);
    }
}