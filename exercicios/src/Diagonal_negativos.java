import java.util.Locale;
import java.util.Scanner;

public class Diagonal_negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a ordem da matriz? ");
        int quantity = sc.nextInt();
        int negativos = 0;
        int[][] mat = new int[quantity][quantity];

        int i;
        int e;
        for(i = 0; i < quantity; ++i) {
            for(e = 0; e < quantity; ++e) {
                System.out.printf("elemento (%d,%d): ", i, e);
                mat[i][e] = sc.nextInt();
            }
        }

        System.out.println("DIAGONAL PRINCIPAL: ");

        for(i = 0; i < quantity; ++i) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();
        System.out.print("QUANTIDADE DE NEGATIVOS = ");

        for(i = 0; i < quantity; ++i) {
            for(e = 0; e < quantity; ++e) {
                if (mat[i][e] < 0) {
                    ++negativos;
                }
            }
        }

        System.out.println(negativos);
    }
}
