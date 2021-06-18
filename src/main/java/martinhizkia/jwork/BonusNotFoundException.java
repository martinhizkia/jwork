package martinhizkia.jwork;
/**
 * @author Martin Hizkia Parasi
 * @version 16 Juni 2021
 */

public class BonusNotFoundException extends Exception {
    private int referral_error;

    public BonusNotFoundException(int referral_input){
        super("Referral Code ID: ");
        this.referral_error = referral_input;
    }

    public String getMessage() {
        return super.getMessage() + referral_error + " not found";
    }
}