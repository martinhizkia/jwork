
/**
 * class berisi atribut dan method invoice
 *
 * @author Martin Hizkia Parasi
 * @version 18 Maret 2021
 */
public class Invoice
{
    // instance variables
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;
    private PaymentType paymentType;
    private InvoiceStatus status;

   /**
     * Constructor for objects of class Location
     * @param id merujuk pada id
     * @param idJob merujuk pada id job
     * @param date merujuk pada tanggal entry
     * @param totalFee merujuk gaji yang didapatkan
     * @param jobseeker merujuk object pencari job
     */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker, PaymentType paymentType, InvoiceStatus status){
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.paymentType = paymentType;
        this.status = status;
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
    public int getIdJob(){
        return idJob;
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
    public void setIdJobs(int idJobs){
        this.idJob = idJobs;
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
     * @param  totalFee  totalFee yang ingin dimasukkan
     */
    public void setTotalFee(int totalFee){
        this.totalFee = totalFee;
    }
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
    public PaymentType getPaymentType() {
        return paymentType;
    }
    /**
     * method assesor untuk mengembalikan InvoiceStatus
     * @return  InvoiceStatuse  objek InvoiceStatus yang dikembalikan
     */
    public InvoiceStatus getInvoiceStatus() {
        return status;
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
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    public void printData(){
        System.out.println("============ INVOICE ============");
        System.out.println("ID: " + id);
        System.out.println("ID Job: " + idJob);
        System.out.println("Date: " + date);
        System.out.println("Seeker: " + jobseeker.getName());
        System.out.println("Fee: " + totalFee);
        System.out.println("Status: " + status);
    }
}
