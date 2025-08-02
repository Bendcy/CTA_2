import java.util.Scanner;

public class incomeCalculatorc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weeklyIncome;
        double taxRate;
        double taxWithholding;

        System.out.println("Enter weekly income: ");
        weeklyIncome = scanner.nextDouble();

        if (weeklyIncome < 500) {
            taxRate = 0.10;
        } else if (weeklyIncome < 1500) {
            taxRate = 0.15;
        } else if (weeklyIncome < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }
        taxWithholding = weeklyIncome * taxRate;
        System.out.printf("Tax withholding for weekly income of %.2f is: %.2f%n", weeklyIncome, taxWithholding);
        scanner.close();
    }
}