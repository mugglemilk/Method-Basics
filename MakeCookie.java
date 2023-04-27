
import java.util.Scanner;

public class MakeCookie {

    static void calCookieBags(int powder, int butter) {
        if ((powder < 0 || powder > 100000) && (butter < 0 || butter > 100000)) {
            System.out.println("Cookie bags: Error");
            System.out.println("Flour left: Invalid");
            System.out.println("Butter left: Invalid");
        } else if (powder < 0 || powder > 100000) {
            System.out.println("Cookie bags: Error");
            System.out.println("Flour left: Invalid");
            System.out.println("Butter left: " + butter);
        } else if (butter < 0 || butter > 100000) {
            System.out.println("Cookie bags: Error");
            System.out.println("Flour left: " + powder);
            System.out.println("Butter left: Invalid");
        } else {
            int cookieBags;//จำนวนคุกกี้
            if (powder / 6 < butter / 3) {
                cookieBags = powder / 6;
            } else {
                cookieBags = butter / 3;
            }
            System.out.println("Cookie bags: " + cookieBags);
            System.out.println("Flour left: " + (powder - cookieBags * 6));
            System.out.println("Butter left: " + (butter - cookieBags * 3));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int powder = scan.nextInt();
        int butter = scan.nextInt();
        calCookieBags(powder, butter);//เรียกเมธอด
    }
}
