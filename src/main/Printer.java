package main;

public class Printer {

    public void printGrid(int[][] x) {
        for (int i = 0; i < x.length; i++) {

            System.out.print("[]");

            for (int j = 0; j < x[i].length; j++) {
                System.out.print("[]");
            }
        }
    }

}
