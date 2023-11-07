package ex231107;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void solution() {
        Main main = new Main();
        int[] people = {70, 50, 80, 50};

        assertEquals(main.solution(people, 100), 3);
    }
}