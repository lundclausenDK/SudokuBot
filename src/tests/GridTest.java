package tests;

import main.Grid;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GridTest {

    @Test
    public void fullGridTest() {
        Grid grid = new Grid();
        int gridCount = 0;
        int[][] expectedArray = new int[9][9];

        for (int i = 0; i < grid.getBoardGrid().length; i++) {
            for (int j = 0; j < grid.getBoardGrid()[i].length; j++) {
                gridCount++;
            }
        }

        assertEquals(81, gridCount);
    }

}