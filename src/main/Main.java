package main;

public class Main {

    public static void main(String[] args) {
        Printer p = new Printer();
        Grid g = new Grid();

        int[][] filledGrid = g.fillGrid(g.getBoardGrid());

        p.printGrid(g.getBoardGrid());

    }


}
