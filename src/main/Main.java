package main;

public class Main {

    public static void main(String[] args) {
        Printer p = new Printer();
        Grid g = new Grid();
        Solutions s = new Solutions();

        //int[][] filledGrid = g.fillGrid(g.getBoardGrid());

        p.printGrid(g.fillGrid(s.beginner(g.getBoardGrid())));

    }


}
