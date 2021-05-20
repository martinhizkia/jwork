package martinhizkia.jwork;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.ArrayList;
/**
 * class berisi atribut dan method invoice
 *
 * @author Martin Hizkia Parasi
 * @version 18 Maret 2021
 */
abstract class Invoice
{
    // instance variables
    private int id;
    private ArrayList<Job> jobs;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;

   /**
     * Constructor for objects of class Location
     * @param id merujuk pada id
     * @param idJob merujuk pada id job
     * @param date merujuk pada tanggal entry
     * @param totalFee merujuk gaji yang didapatkan
     * @param jobseeker merujuk object pencari job
     */
   public Invoice( int id, ArrayList<Job> jobs, Jobseeker jobseeker){
       this.id = id;
       this.jobs = jobs;
       this.totalFee = totalFee;
       this.jobseeker = jobseeker;
       this.invoiceStatus = InvoiceStatus.Ongoing;
       this.date = Calendar.getInstance();
   }
    /**
    * untuk mengembalikan id
    * @return id
    */
    public int getId(){
        return id;
    }
    /**
    * untuk mengembalikan idJon (pekerjaan)
    * @return idJob
    */
    public ArrayList<Job> getJobs(){
        return jobs;
    }
    /**
    * untuk mengembalikan tanggal
    * @return date
    */
    public Calendar getDate(){
        return date;
    }
     /**
    * untuk mengembalikan gaji
    * @return date
    */
    public int getTotalFee(){
        return totalFee;
    }
     /**
     * method mutator untuk mengubah id
     * @param  id  nomor id yang ingin dimasukkan
     */
    public void setId(int id){
        this.id = id;
    }
    /**
     * method mutator untuk mengubah idJobs
     * @param  idJobs  nomor idJobs yang ingin dimasukkan
     */
    public void setJobs(ArrayList<Job> jobs){
        this.jobs = jobs;
    }
    /**
     * method mutator untuk mengubah tanggal
     * @param  date  tanggal yang ingin dimasukkan
     */
    public void setDate(Calendar date){
        this.date = date;
    }
    public void setDate(int year, int month, int dayOfMonth){
        this.date = new GregorianCalendar(year, month - 1, dayOfMonth);
    }
    public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }
    /**
     * method mutator untuk mengubah fee
     */
    public abstract void setTotalFee();
    /**
     * method assesor untuk mengembalikan jobseeker
     * @return  jobseeker  objek jobseeker yang dikembalikan
     */
    public Jobseeker getJobseeker() {
        return jobseeker;
    }
    /**
     * method assesor untuk mengembalikan payment type
     * @return  payment type  objek payment type yang dikembalikan
     */
    public abstract PaymentType getPaymentType();
    /**
     * method assesor untuk mengembalikan InvoiceStatus
     * @return  InvoiceStatuse  objek InvoiceStatus yang dikembalikan
     */
    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }
     /**
     * method memasukkan objek jobseeker
     * @param  jobseeker  objek jobseeker yang dimasukkan
     */
    public void setJobseeker(Jobseeker jobseeker) {
        this.jobseeker = jobseeker;
    }
    /**
     * method memasukkan objek jobseeker
     * @param  jobseeker  objek jobseeker yang dimasukkan
     */

    public abstract String toString();
}
