/**
 * Write a description of class DatabaseRecruiter here.
 *
 * @author Martin Hizkia Parasi
 * @version 25 Maret 2021
 */package martinhizkia.jwork;

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
}
