public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long result12 = service.calculate(1000000, 12);
        System.out.println("Ежемесячный платеж: " + result12 + " Р");

        long result24 = service.calculate(1000000, 24);
        System.out.println("Ежемесячный платеж: " + result24 + " Р");

        long result36 = service.calculate(1000000, 36);
        System.out.println("Ежемесячный платеж: " + result36 + " Р");
    }
}
