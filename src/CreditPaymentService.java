public class CreditPaymentService {

    public double calculate(double summaCredit, double percentageRate, double loanTerm) {
        double monthsOfTheYear = 12;
        double percentages = 100;
        double monthlyRate = percentageRate / percentages / monthsOfTheYear;
        double combingOut = 1 + monthlyRate;
        double payment = summaCredit * (monthlyRate * (Math.pow(combingOut, loanTerm) / (Math.pow(combingOut, loanTerm) - 1)));

        return payment;
    }

}

