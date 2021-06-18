package martinhizkia.jwork;
import java.util.ArrayList;
/**
 * @author Martin Hizkia Parasi
 * @version 16 Juni 2021
 */

public class FeeCalculator implements Runnable{
    private Invoice invoice;

    public FeeCalculator (Invoice invoice){
        this.invoice = invoice;
    }

    @Override
    public void run() {
        ArrayList<Invoice> list = DatabaseInvoice.getInvoiceDatabase();
        for (Invoice i : list) {
            System.out.println("calculating invoice id: " + i.getId());
            i.setTotalFee();
            System.out.println("finish calculating invoice id: " + i.getId());
        }
    }
}
