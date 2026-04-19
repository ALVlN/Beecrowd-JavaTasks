import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = scanner.nextInt();
        int[] vetor = new int[tamanhoVetor];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = scanner.nextInt();
        }

        int menor = vetor[0];
        int posicao = 0;

        for (int i = 1; i < vetor.length; i++){
            if(vetor[i] < menor){
                menor = vetor[i];
                posicao = i;
            }
        }

        System.out.printf("Menor valor: %d%n", menor);
        System.out.printf("Posicao: %d%n", posicao);

    }
}
