package main;

public class Printer {

    public void printGrid(int[][] x) {

        int count = 1;

        for (int i = 0; i < x.length; i++) {

            System.out.print("[" + count + "]");
            count++;

            for (int j = 0; j < x[i].length; j++) {

                System.out.print("[" + count + "]");
                count++;

            }
        }
    }

}
