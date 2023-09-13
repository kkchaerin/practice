package ex230913;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void solution1() {
        Main main = new Main();
        assertFalse(main.solution1("(()("));
    }

    @Test
    public void solution2() {
        Main main = new Main();
        assertFalse(main.solution2("(()("));
    }
}