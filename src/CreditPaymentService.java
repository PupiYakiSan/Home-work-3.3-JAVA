public class CreditPaymentService {

    public int calculate (int creditAmountRuble, int creditTermYear, double interestRatePercent) {

        double paymentMonth;
        int creditTermMonth = creditTermYear * 12;
        double interestRate = interestRatePercent * creditTermYear / 100 / creditTermMonth;

        paymentMonth = creditAmountRuble * interestRate / (1 - Math.pow((1 + interestRate), (-1 * creditTermMonth)));

        return (int) paymentMonth;
    }

}
