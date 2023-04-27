
import java.util.Scanner;

public class EncodingAlphabetWithNumber {

    static char encode(char c, int n) {
        int cc = c + n;
        if (cc > 'Z') {
            cc = cc - 'Z' + 64;
        }
        return (char) cc;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        for (int i = 0; i < str.length(); ++i) {
            int n = scan.nextInt();
            char c = encode(str.charAt(i), n);
            System.out.print(c);
        }
    }
}
