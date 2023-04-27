
import java.util.Scanner;

public class UnderLineWithparameter_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; ++i) {
            String str = scan.next();
            int k = scan.nextInt();
            System.out.println(str);
            for (int j = 1; j <= k; ++j) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
