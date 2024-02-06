import java.util.Locale;
import java.util.Scanner;

public class matriz_geral {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int quantity = sc.nextInt();

        int[][] mat = new int[quantity][quantity];
        double sum = 0;
        int i;int e;int l;

        for(i = 0; i < quantity; ++i) {
            for (e = 0; e < quantity; ++e) {
                System.out.printf("elemento (%d,%d): ", i, e);
                mat[i][e] = sc.nextInt();
            }
        }

        System.out.print("SOMA DOS POSITIVOS: ");

        for (i = 0; i < quantity; i++){
            for (e = 0; e < quantity; e++){
                if (mat[i][e]>0){
                    sum += mat[i][e];
                }
            }
        }
        System.out.println(sum);
        System.out.println();
        System.out.print("Escolha uma linha: ");
        l = sc.nextInt();

        System.out.print("Linha Escolhida:");
        for (i = l; i < l+1; ++i){
            for(e = 0; e<quantity; e++){
                System.out.print((double)mat[i][e] + " ");
            }
        }
        System.out.println(" ");

        System.out.print("Escolha uma Coluna: ");
        l = sc.nextInt();

        System.out.print("Coluna Escolhida:");
        for (e = l; e < 1; e++){
            for(i = 0; i < quantity; ++i){
                System.out.print((double)mat[i][e] + " ");
            }
        }

        System.out.println(" ");

        System.out.println("MATRIZ ALTERADA: ");
        for (e = 0; e < quantity; e++) {
            for (i = 0; i < quantity; ++i) {

                if(mat[e][i] < 0){

                    mat [e][i] *= mat [e][i];

                    System.out.print((double) mat[e][i] + " ");
                } else {
                    System.out.print((double) mat[e][i] + " ");
                }
            }

            System.out.println();
        }
    }
}
