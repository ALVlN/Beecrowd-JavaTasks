import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int[] vetor = new int[1000];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = i % input;
            System.out.printf("N[%d] = %d%n", i, vetor[i]);
        }
    }
}
