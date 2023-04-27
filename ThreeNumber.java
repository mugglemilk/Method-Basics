
import java.util.Scanner;

public class ThreeNumber {

    static int FindMin(int x, int y, int z) {
        int a = -1;
        if (x < y && x < z) {
            a = x;
        } else if (x > y && y < z) {
            a = y;
        } else {
            a = z;
        }
        return a;
    }

    static int FindMedian(int x, int y, int z) {
        int a = 0;
        int min = FindMin(x, y, z);
        int max = FindMax(x, y, z);
        if (x != min && x != max) {
            a = x;
        } else if (y != min && y != max) {
            a = y;
        } else {
            a = z;
        }
        return a;
    }

    static int FindMax(int x, int y, int z) {
        int a = 1;
        if (z > x && z > y) {
            a = z;
        } else if (x > y && x > z) {
            a = x;
        } else {
            a = y;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int type = scan.nextInt();

        if (type == -1) {
            System.out.println(FindMin(x, y, z));
        } else if (type == 0) {
            System.out.println(FindMedian(x, y, z));
        } else if (type == 1) {
            System.out.println(FindMax(x, y, z));
        }
    }
}
