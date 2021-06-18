package martinhizkia.jwork;
/**
 * @author Martin Hizkia Parasi
 * @version 16 Juni 2021
 */

public class OngoingInvoiceAlreadyExistsException extends Exception{

    private Invoice invoice_error;

    public OngoingInvoiceAlreadyExistsException(Invoice invoice_input) {
        super("Ongoing Invoice ");
        this.invoice_error = invoice_input;
    }

    public String getMessage() {
        return super.getMessage() + invoice_error.getInvoiceStatus() + " already exists";
    }
}