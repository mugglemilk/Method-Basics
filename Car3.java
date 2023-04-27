
import java.util.Scanner;

public class Car3 {

    int calculatePrice(int year, int km) {
        int age = 2021 - year;
        int value = 10000 - km;
        return 25000 + value - (age * 1000);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int km = scan.nextInt();
        Car3 obj = new Car3();//scan
        int price = obj.calculatePrice(year, km);
        System.out.println(price);
    }
}
