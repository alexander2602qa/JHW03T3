public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;
        double interestRate = 9.99;
        System.out.println(service.calculate(sum, 12, interestRate));
        System.out.println(service.calculate(sum, 24, interestRate));
        System.out.println(service.calculate(sum, 36, interestRate));
    }
}