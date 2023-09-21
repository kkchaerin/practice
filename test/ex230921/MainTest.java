package ex230921;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void solution() {
        Main main = new Main();
        assertEquals(main.solution("-1 -2 -3 -4"), "-4 -1");
    }
}