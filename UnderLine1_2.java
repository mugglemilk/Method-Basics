
import java.util.Scanner;

public class UnderLine1_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; ++i) {
            String str = scan.next();
            System.out.println(str);
            System.out.println("--------------------");
        }
    }
}
