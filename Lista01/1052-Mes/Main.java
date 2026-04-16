import java.io.IOException;
import java.util.Scanner;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        List<String> meses = List.of("January", "February", "March",
                "April", "May", "June", "July", "August", "September",
                "October", "November", "December");

        for (int i = 0; i < meses.size(); i++){
            if((i + 1) == input){
                System.out.println(meses.get(i));
            }

        }
    }

}
