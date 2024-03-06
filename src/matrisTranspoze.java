import java.util.Scanner;
import java.util.Arrays;

public class matrisTranspoze {
    public static void main(String[] args) {

        int[][] duzMatris = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrisTranspoze = new int[duzMatris[0].length][duzMatris.length];

        for (int i = 0; i < duzMatris.length; i++) {
            for (int j = 0; j < duzMatris[0].length; j++) {
                matrisTranspoze[j][i] = duzMatris[i][j];
            }
        }

        System.out.println("Dizinin Normal Hali");

        for (int[] satir : duzMatris) {
            for (int sutun : satir) {
                System.out.print(sutun + " ");
            }
            System.out.println();
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Dizinin Transpoze Hali");

        for (int[] satir : matrisTranspoze) {
            for (int sutun : satir) {
                System.out.print(sutun + " ");
            }
            System.out.println();
        }
    }
}
