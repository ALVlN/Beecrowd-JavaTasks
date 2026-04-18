import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int P = scanner.nextInt();
        int R = scanner.nextInt();

        if (P == 0){
            System.out.println("C");
        } else if ((P + R) == 2){
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
