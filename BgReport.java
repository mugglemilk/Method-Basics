
import java.util.Scanner;

public class BgReport {

    static void reportBg(String name, int BirthYear, int StartYear) {
        if (name.length() >= 2) {
            System.out.println("Name: " + name);
        } else {
            System.out.println("Name: INVALID");
        }
        if (BirthYear >= 1900 && BirthYear <= 2022) {
            System.out.println("Birth year: " + BirthYear);
            if (StartYear >= 1900 && StartYear <= 2022) {
                if (StartYear - BirthYear >= 18) {
                    System.out.println("Start year: " + StartYear);
                } else {
                    System.out.println("Start year: INVALID");
                }
            } else {
                System.out.println("Start year: INVALID");
            }
        } else {
            System.out.println("Birth year: INVALID");
            System.out.println("Start year: INVALID");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int BirthYear = scan.nextInt();
        int StartYear = scan.nextInt();
        reportBg(name, BirthYear, StartYear);
    }
}
