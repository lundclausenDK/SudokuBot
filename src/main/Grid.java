package main;

public class Grid {

    private int[][] boardGrid = new int[4][4];

    // Mini Sudoku 4x4
    public int[][] fillGrid(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = 1 + 1;
            }
        }
        return x;
    }

    // Getters and setters
    public int[][] getBoardGrid() {
        return boardGrid;
    }
    public void setBoardGrid(int[][] boardGrid) {
        this.boardGrid = boardGrid;
    }
}
