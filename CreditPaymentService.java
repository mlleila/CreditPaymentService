public class CreditPaymentService {
    public long calculate(int sum, int months) {
        double interest = 9.99/100/12 ; //  Месячная процентная ставка
        int payment = months; //количество платежей = количеству месяцев
        double annuity = (interest * Math.pow((1+interest),payment)) / (Math.pow((1+interest),payment) - 1); // коэффициент аннуитета
        int mainPayment = (int)(sum * annuity); // аннуитетный платеж
        return mainPayment;
    }
}
