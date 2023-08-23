package ex230823;

import org.junit.Test;

import static org.junit.Assert.*;

public class Main2Test {

    @Test
    public void solution() {
        Main2 main = new Main2();
        int[] nums = {3,3,3,2,2,4};
        assertEquals(main.solution(nums), 3);
    }
}