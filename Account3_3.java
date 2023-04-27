
import java.util.Scanner;

public class Account3_3 {

    int balance = 10000;

    int deposit(int money) {
        if (money > 0) {
            balance += money;
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account3_3 ac = new Account3_3();
        int money = scan.nextInt();
        if (ac.deposit(money) == 0) {
            System.out.println(ac.balance);
        } else {
            System.out.println("Error");
        }
    }
}
