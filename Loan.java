import java.util.Scanner;

public class Loan{

    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
           Scanner input = new Scanner(System.in);
           System.out.println("Enter investment amount: ");
           money = input.nextDouble();
           System.out.println("Enter number of months: ");
           month = input.nextInt();
           System.out.println("Enter annual interest rate in percentage: ");
           interestRate = input.nextDouble();
        double totalInterest = 0.0;
        for(int i = 1; i <= month; i++){
           totalInterest = 0.0;
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
