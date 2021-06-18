package martinhizkia.jwork;
/**
 * @author Martin Hizkia Parasi
 * @version 16 Juni 2021
 */
public enum PaymentType {
    BankPayment {
        @Override
        public String toString(){
            return "Bank Payment";
        }
    },
    EwalletPayment {
        @Override
        public String toString(){
            return "E-wallet Payment";
        }
    };
}
