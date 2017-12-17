package main;

public class Main {

    public static void main(String[] args) {
        Printer p = new Printer();
        Grid g = new Grid();
        Solutions s = new Solutions();

        int[][] filledGrid = s.beginner(g.getBoardGrid());
        p.printSolution(filledGrid);


    }


}
