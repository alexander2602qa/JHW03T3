public class CreditPaymentService {

    // period указывается в месяцах
    public int calculate(int sum, int period, double interestRate) {
        double i = interestRate / 12 / 100;
        double monthlyPayment = sum * i * Math.pow(1 + i, period) / (Math.pow(1 + i, period) - 1);
        return (int) monthlyPayment;
    }

}
