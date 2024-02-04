import java.util.Locale;
import java.util.Scanner;

public class soma_linhas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a quantidade de linhas da matriz? ");
        int linhas = sc.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        int colunas = sc.nextInt();

        double[][] mat = new double[linhas][colunas];
        double[] vect = new double[linhas];

        for (int i = 0; i < linhas; i++){
            System.out.printf("Digite os elementos da %da linha:\n", (i+1));
            double sum = 0;
            for (int e = 0; e < colunas; e++){
                mat[i][e] = sc.nextDouble();
                sum += mat[i][e];
            }
            vect[i] = sum;
        }

        System.out.println("VETOR GERADO: ");
        for (int i = 0; i < linhas; i++){
            System.out.println(vect[i]);
        }
    }
}
