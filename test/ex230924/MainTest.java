package ex230924;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void solution() {
        Main main = new Main();
        assertEquals(main.solution("3people unFollowed me"), "3people Unfollowed Me");
    }
}