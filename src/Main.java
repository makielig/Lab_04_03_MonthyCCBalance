public class Main {
    public static void main(String[] args) {
        double balance = 5000.00; // Initial balance
        double interestRate = 0.17; // 17% annual interest rate

        // Calculate monthly interest
        double firstMonthInterest = balance * (interestRate / 12);
        double secondMonthInterest = (balance + firstMonthInterest) * (interestRate / 12);

        System.out.println("Interest after 1 month: $" + firstMonthInterest);
        System.out.println("Interest after 2 months: $" + secondMonthInterest);
    }
}