package ex230823;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void solution() {
        Main main = new Main();
        assertEquals(main.solution("Zbcdefg"), "gfedcbZ");
    }
}