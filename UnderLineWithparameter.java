
import java.util.Scanner;

public class UnderLineWithparameter {

    static void UnderLine(int parameter) {
        for (int i = 0; i < parameter; ++i) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; ++i) {
            String str = scan.next();
            int a = scan.nextInt();
            System.out.println(str);
            UnderLine(a);
        }
    }
}
