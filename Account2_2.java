
import java.util.Scanner;

public class Account2_2 {

    int balance = 10000;

    private void deposit(int money) {
        balance += money;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account2_2 ac = new Account2_2();
        int money = scan.nextInt();
        ac.deposit(money);
        System.out.println(ac.balance);
    }
}
