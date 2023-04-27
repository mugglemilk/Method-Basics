
import java.util.Scanner;

public class ProcessInfo {

    static boolean listProcesses(String[] names, int[] ramUses, int ram) {
        int count = 0;
        for (int i = 0; i < names.length; ++i) {
            System.out.print(names[i]);
            if (ramUses[i] >= 10) {
                System.out.print("*");
            }
            System.out.println(" " + ramUses[i]);
            count += ramUses[i];
        }
        System.out.println("RAM used = " + count + " out of " + ram);
        if (count > ram) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] names = new String[n];
        int[] ramUses = new int[n];
        for (int i = 0; i < n; ++i) {
            names[i] = scan.next();
            ramUses[i] = scan.nextInt();
        }
        int ram = scan.nextInt();
        boolean list = listProcesses(names, ramUses, ram);
        if (list) {
            System.out.println("Sufficient RAM");
        } else if (!list) {
            System.out.println("Not enough RAM");
        }
    }
}
