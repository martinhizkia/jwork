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
    private Job job;
    private String date;
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
    public Invoice(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
        this.id = id;
        this.job = job;
        this.date = date;
        this.jobseeker = jobseeker;
        this.invoiceStatus = invoiceStatus;
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
    public Job getJob(){
        return job;
    }
    /**
    * untuk mengembalikan tanggal
    * @return date
    */
    public String getDate(){
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
    public void setIdJobs(Job job){
        this.job = job;
    }
    /**
     * method mutator untuk mengubah tanggal
     * @param  date  tanggal yang ingin dimasukkan
     */
    public void setDate(String date){
        this.date = date;
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

    public abstract void printData();
}
