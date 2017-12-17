package tests;

import main.Grid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GridTest {

    @Test
    void fullGridTest() {
        Grid grid = new Grid();
        int gridCount = 0;

        for (int i = 0; i < grid.getBoardGrid().length; i++) {
            for (int j = 0; j < grid.getBoardGrid()[i].length; j++) {
                gridCount++;
            }
        }

        Assertions.assertEquals(16, gridCount);
    }

}