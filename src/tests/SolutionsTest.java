package tests;

import main.Grid;
import main.Solutions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class SolutionsTest {

    @Test
    void validateSolutionTest() {
        Solutions s = new Solutions();
        Grid g = new Grid();

        boolean tester = false;
        int[][] array = s.beginner(g.getBoardGrid());
        int[] nums = {1, 2, 3, 4};
        int[] temp = new int[4];

        // Check first row horizontal
        for (int i = 0; i < 4; i++) {
            temp[i] = array[0][i];
        }

        Arrays.sort(temp);

        if (Arrays.equals(temp, nums)) {
            tester = true;
        }

        Assertions.assertTrue(tester);
    }

}