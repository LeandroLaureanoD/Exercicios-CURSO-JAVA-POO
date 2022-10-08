import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("how many lines? ");
        int lines = sc.nextInt();
        System.out.print("how many columns? ");
        int columns = sc.nextInt();
        int valor;
        int[][] mat = new int[lines][columns];

        System.out.println("Enter matrix values:");
        for (int i = 0; i < lines; i ++){
            for (int j = 0; j < columns; j ++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("what is the value to be found? ");
        valor = sc.nextInt();
        System.out.println();
        for (int i = 0; i < lines; i ++){
            for (int j = 0; j < columns; j ++) {
                if (valor == mat[i][j]) {
                    System.out.println("Position: " + i + "," + j);
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                    System.out.println("-----------------");
                }
            }
        }
        sc.close();
    }
}
