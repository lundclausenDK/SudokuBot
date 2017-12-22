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
        int count = 0;
        int[][] array = s.beginner(g.getBoardGrid());
        int[] nums = {1, 2, 3, 4};
        int[] temp = new int[4];

        // Check all horizontal rows
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                temp[count] = array[i][j];
                count++;
            }

            Arrays.sort(temp);

            if (Arrays.equals(temp, nums)) {
                tester = true;
            } else {
                break;
            }

        }

        Assertions.assertTrue(tester);
    }

}