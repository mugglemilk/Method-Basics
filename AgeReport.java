
import java.util.Scanner;

public class AgeReport {

    static int reportAge(int[] ID, int[] age, int MinAge, int MaxAge) {
        int b = 0;
        for (int i = 1; i < age.length; ++i) {
            if (age[i] >= MinAge && age[i] <= MaxAge) {
                b++;
                System.out.println(ID[i]);
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ID = new int[n+1];
        int[] age = new int[n+1];
        for (int i = 1; i <= n; ++i) {
            ID[i] = scan.nextInt();
            age[i] = scan.nextInt();
        }
        int MinAge = scan.nextInt();
        int MaxAge = scan.nextInt();
        int a = reportAge(ID, age, MinAge, MaxAge);
        System.out.println("There are " + a + " persons in age range of " + MinAge + " to " + MaxAge);
    }
}
