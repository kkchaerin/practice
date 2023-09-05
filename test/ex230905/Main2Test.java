package ex230905;

import org.junit.Test;

import static org.junit.Assert.*;

public class Main2Test {

    @Test
    public void solution() {
        Main2 main = new Main2();
        int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        assertEquals(main.solution(num_list), 51);
    }
}