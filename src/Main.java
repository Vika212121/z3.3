public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        {
            double option1 = service.calculate(1_000_000, 9.99, 12);
            System.out.println(" Ежемесячный платеж " + option1);

            double option2 = service.calculate(1_000_000, 9.99, 24);
            System.out.println(" Ежемесячный платеж " + option2);

            double option3 = service.calculate(1_000_000, 9.99, 36);
            System.out.println(" Ежемесячный платеж " + option3);

        }
    }
}