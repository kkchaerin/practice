package ex230905;

import org.junit.Test;

import static org.junit.Assert.*;

public class Main3Test {

    @Test
    public void solution() {
        Main3 main = new Main3();
        int[] num_list = {2, 1, 6};
        int[] result = {6};
        assertArrayEquals(main.solution(num_list, 3), result);
    }
}