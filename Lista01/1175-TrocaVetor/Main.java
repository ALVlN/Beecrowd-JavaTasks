import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[20];
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = scanner.nextInt();
        }

        int[] invertido = new int[20];
        for (int i = 0; i < vetor.length; i++){
            invertido[i] = vetor[19 - i];
            System.out.printf("N[%d] = %d%n", i, invertido[i]);
        }
    }
}
