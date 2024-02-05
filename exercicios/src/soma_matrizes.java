import java.util.Locale;
import java.util.Scanner;

public class soma_matrizes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas linhas vai ter cada matriz? ");
        int linhas = sc.nextInt();
        System.out.print("Quantas colunas vai ter cada matriz? ");
        int colunas = sc.nextInt();

        int sum = 0;

        int[][] mat = new int[linhas][colunas];
        int[][] mat2 = new int[linhas][colunas];
        int[][] mat3 = new int[linhas][colunas];

        int i;
        int e;
        System.out.println("Digite os valores da matriz A: ");
        for(i = 0; i < linhas; i++) {
            for(e = 0; e < colunas; e++) {

                System.out.printf("Elemento [%d][%d]: ", i, e);
                mat[i][e] = sc.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz B: ");
        for(i = 0; i < linhas; i++) {
            for(e = 0; e < colunas; e++) {

                System.out.printf("Elemento [%d][%d]: ", i, e);
                mat2[i][e] = sc.nextInt();
            }
        }

        System.out.println("MATRIZ SOMA:  ");
        for (i = 0; i < linhas; i++){
            for (e = 0; e < colunas; e++) {

                mat3[i][e] = mat2[i][e] + mat[i][e];

                System.out.print(mat3[i][e] + " ");
            }
            System.out.println();
        }
    }
}
