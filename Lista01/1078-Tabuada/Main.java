import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            int x = i * N;
            System.out.printf("%d x %d = %d%n", i, N, x);
        }
    }

}
