package ex230820;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void solution() {
        Main main = new Main();
        assertEquals(main.solution(118372), 873211);
    }
}