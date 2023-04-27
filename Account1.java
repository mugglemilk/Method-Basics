
import java.util.Scanner;

public class Account1 {

    int balance = 10000;

    int deposit(int money) {
        return balance+money;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account1 ac = new Account1();
        int money = scan.nextInt();
        int a = ac.deposit(money);
        System.out.println(a);
    }
}
