package ex230816;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void solution() {
        Main main = new Main();
        assertEquals(main.solution(13, 17), 43);
    }
}