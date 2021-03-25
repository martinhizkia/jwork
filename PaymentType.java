public enum PaymentType {
    BankPayment("Bank Payment"),
    EwalletPayment("E-wallet Payment");

    private String payment;
    private PaymentType(String payment) {
        this.payment = payment;
    }
    @Override
    public String toString(){
        return this.payment;
    }

    // Driver method
    public static void main(String[] args)
    {
        PaymentType p1 = PaymentType.BankPayment;
        PaymentType p2 = PaymentType.EwalletPayment;
        System.out.println(p1);
        System.out.println(p2);
    }
}
