package ex230820;

import org.junit.Test;

import static org.junit.Assert.*;

public class Main2Test {

    @Test
    public void solution() {
        Main2 main = new Main2();
        int[] test = {5,4,3,2,1};
        assertArrayEquals(main.solution(12345), test);
    }

}