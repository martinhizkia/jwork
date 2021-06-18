package martinhizkia.jwork;
/**
 * @author Martin Hizkia Parasi
 * @version 16 Juni 2021
 */

public class RecruiterNotFoundException extends Exception{

    private int recruiter_error;

    public RecruiterNotFoundException(int recruiter_input) {
        super("Recruiter Id: ");
        this.recruiter_error = recruiter_input;
    }

    public String getMessage() {
        return super.getMessage() + recruiter_error + "Not Found";
    }
}