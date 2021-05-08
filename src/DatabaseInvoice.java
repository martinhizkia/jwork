import java.util.ArrayList;

public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE =  new ArrayList<Invoice>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }
    public static int getLastId(){
        return lastId;
    }
    public static Invoice getRecruiterById(int id){
        Invoice temp = null;
        for (Invoice invoice: INVOICE_DATABASE) {
            if (id == invoice.getId()){
                temp = invoice;
            }
            else{
                temp =  null;
            }
        }
        return temp;
    }
    public static ArrayList<Invoice> getJobByJobseeker(int jobseekerid) {
        ArrayList<Invoice> temp = new ArrayList<Invoice>();
        for(int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (jobseekerid == INVOICE_DATABASE.get(i).getJobseeker().getId()) {
                temp.add(INVOICE_DATABASE.get(i));
            }
        }
        return temp;
    }
    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException{
        for (Invoice invoice2 : INVOICE_DATABASE) {
            if (invoice2.getInvoiceStatus() == InvoiceStatus.Ongoing) {
                throw new OngoingInvoiceAlreadyExistsException(invoice2);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getInvoiceStatus() == InvoiceStatus.Ongoing) {
                invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    public static boolean removeInvoice(int id) throws InvoiceNotFoundException {
        boolean temp = false;
        for (Invoice invoice: INVOICE_DATABASE) {
            if (id == invoice.getId()){
                INVOICE_DATABASE.remove(id);
                temp = true;
                return temp;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

}
