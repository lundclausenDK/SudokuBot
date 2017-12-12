package tests;

import main.Grid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GridTest {

    @Test
    public void fullGridTest() {
        Grid grid = new Grid();
        int gridCount = 0;

        for (int i = 0; i < grid.getBoardGrid().length; i++) {
            gridCount++;
            for (int j = 0; j < grid.getBoardGrid()[i].length; j++) {
                gridCount++;
            }
        }

        Assertions.assertEquals(16, gridCount);
    }

}