package main;

public class Printer {

    private int rowCount = 1;

    public void printSolution(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("[" + x[i][j] + "]");
                if (rowCount == 4) {
                    System.out.println("");
                    rowCount = 0;
                }
                rowCount++;
            }
        }
    }

    /*
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
    */



}
