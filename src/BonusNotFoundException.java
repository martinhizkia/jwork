public class BonusNotFoundException extends Exception {
    private int referral_code_error;

    public BonusNotFoundException(int referral_code_input){
        super("Referral Code ID: ");
        referral_code_error = referral_code_input;
    }
    public String getMessage() {
        return super.getMessage() + referral_code_error + " not found";
    }
}