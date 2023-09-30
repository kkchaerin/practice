package ex231001;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void solution() {
        Main main = new Main();
        int[] result = {3, 8};
        assertArrayEquals(main.solution("110010101001"), result);
    }
}