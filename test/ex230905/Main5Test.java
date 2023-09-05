package ex230905;

import org.junit.Test;

import static org.junit.Assert.*;

public class Main5Test {

    @Test
    public void solution() {
        Main5 main = new Main5();
        assertEquals(main.solution("ProgrammerS123", 11), "grammerS123");
    }
}