
import java.util.Scanner;

class Employee {

    String name;
    String ID;
    int type;
    int wage;
    int exWork = 0;
    int opWork = 0;

    public Employee(String name, String ID, int type, int wage) {
        this.name = name;
        this.ID = ID;
        this.type = type;
        this.wage = wage;
    }

    boolean workExecutive(int hrs) {
        if (hrs > 0) {
            exWork += hrs;
            System.out.println("true "+calPayment());
           
            return true;
        } else {
            System.out.println("Invalid hour for executive work");
            System.out.println("false "+calPayment());
        }
        return false;
    }

    boolean workOperation(int hrs) {
        if (hrs > 0) {
            opWork += hrs;
             System.out.println("true "+calPayment());
            return true;
        } else {
            System.out.println("Invalid hour for operation work");
             System.out.println("false "+calPayment());
        }
        return false;
    }

    int calPayment() {
        int count = 0;
        if (type == 1) {//บริหาร
            count = exWork * wage;
            count += (opWork * 2) * wage;

        } else if (type == 2) {
            count = opWork * wage;
            count += (exWork * 2) * wage;
        }
        return count;
    }

    void printStats() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);

        if (type == 1) {
            System.out.println("Position: Executive");
        } else {
            System.out.println("Position: Operation");
        }
        System.out.println("Ex Hour: " + exWork);
        System.out.println("Op Hour: " + opWork);
        System.out.println("Wage: " + wage);

        System.out.println("Payment: " + calPayment());
    }
}

public class HR {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String ID = scan.next();
        int type = scan.nextInt();
        int wage = scan.nextInt();
        Employee employee = new Employee(name, ID, type, wage);

        final int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int workType = scan.nextInt();
            int hour = scan.nextInt();
            if (workType == 1) {
                employee.workExecutive(hour);
            } else {
                employee.workOperation(hour);
            }
        }
         employee.printStats();
    }
}
