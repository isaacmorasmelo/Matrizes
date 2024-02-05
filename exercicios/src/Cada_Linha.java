import java.util.Locale;
import java.util.Scanner;

public class Cada_Linha {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int quantity = sc.nextInt();
        int maior = 0;

        int[][] mat = new int[quantity][quantity];
        int[] vect = new int[quantity];

        int i; int e;

        for(i = 0; i < quantity; ++i) {
            for(e = 0; e < quantity; ++e) {
                System.out.printf("elemento (%d,%d): ", i, e);
                mat[i][e] = sc.nextInt();

                if (mat[i][e] > maior){
                    maior = mat[i][e];
                    vect[i] = mat[i][e];
                }
            }
            maior = 0;
        }

        System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");

        for(i = 0; i < quantity; ++i){
            System.out.println(vect[i]);
        }
    }
}
