package martinhizkia.jwork;
/**
 * @author Martin Hizkia Parasi
 * @version 16 Juni 2021
 */
public class InvoiceNotFoundException extends Exception{

    private int invoice_error;

    public InvoiceNotFoundException(int invoice_input) {
        super("Invoice Id: ");
        this.invoice_error = invoice_input;
    }

    public String getMessage() {
        return super.getMessage() + invoice_error + " not Found";
    }
}