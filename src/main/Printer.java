package main;

public class Printer {

    private int count = 1;
    private int rowCount = 1;
    private String fill = "x";
    private boolean numberFill = true;
    private int rows = 4;
    private int columns = 3;

    public void printSolution(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[j].length; j++) {

            }
        }
    }

    public void printGrid(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print("[" + i + "]");
            count++;
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("[" + j + "]");
                count++;
                rowCount++;
            }
            if (rowCount == 4) {
                System.out.println("");
                rowCount = 0;
            }
            rowCount++;
        }
    }

    private void innerFill() {
        if (numberFill && count < 10) {
            System.out.print("[0" + count + "]");
        } else if (numberFill) {
            System.out.print("[" + count + "]");
        } else {
            System.out.print("[" + fill + "]");
        }
    }


}
