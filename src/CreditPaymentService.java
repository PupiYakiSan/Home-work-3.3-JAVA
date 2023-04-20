public class CreditPaymentService {

    public int calculate (int creditAmountRuble, int creditTermYear, double interestRatePercent) {

        double paymentMonth;
        int creditTermMonth = creditTermYear * 12;
        double interestRate = interestRatePercent / 100 / 12;

        paymentMonth = creditAmountRuble * interestRate / (1 - Math.pow((1 + interestRate), (-1 * creditTermMonth)));

        return (int) paymentMonth;
    }

}
