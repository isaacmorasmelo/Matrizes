import java.util.Locale;
import java.util.Scanner;

public class Negativos_Matriz {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int negativos = 0;
    System.out.print("Qual a quantidade de linhas da matriz? ");
    int linhas = sc.nextInt();
    System.out.print("Qual a quantidade de colunas da matriz? ");
    int colunas = sc.nextInt();
    int[][] mat = new int[linhas][colunas];

    int i;
    int e;
    for(i = 0; i < linhas; ++i) {
        for(e = 0; e < colunas; ++e) {
            System.out.printf("Elemento [%d][%d]: ", i, e);
            mat[i][e] = sc.nextInt();
            if (mat[i][e] < 0) {
                ++negativos;
            }
        }
    }

    System.out.println("VALORES NEGATIVOS: ");

    for(i = 0; i < linhas; ++i) {
        for(e = 0; e < colunas; ++e) {
            if (mat[i][e] < 0) {
                System.out.printf("%d\n", mat[i][e]);
            }
        }
    }

}
}
