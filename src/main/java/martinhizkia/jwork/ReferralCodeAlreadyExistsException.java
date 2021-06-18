package martinhizkia.jwork;
/**
 * @author Martin Hizkia Parasi
 * @version 16 Juni 2021
 */

public class ReferralCodeAlreadyExistsException extends Exception {

    private Bonus referral_error;

    public ReferralCodeAlreadyExistsException(Bonus referral_input){
        super("Referral Code: ");
        this.referral_error = referral_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + referral_error.getReferralCode() + " already exists.";
    }
}
