import java.util.Locale;
import java.util.Scanner;

public class acima_diagonal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a ordem da matriz?");
        int quantity = sc.nextInt();

        int[][] mat = new int[quantity][quantity];

        int i;
        int e;

        for(i = 0; i < quantity; ++i) {
            for (e = 0; e < quantity; ++e){
                System.out.printf("elemento (%d,%d): ", i, e);
                mat[i][e] = sc.nextInt();
            }
        }
    }
}
