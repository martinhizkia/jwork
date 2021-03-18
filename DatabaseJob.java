/**
 * Class berisikan method dan atribut untuk kegunaan database job
 * @author Martin Hizkia Parasi
 * @version 18 Maret 2021
 */
public class DatabaseJob {
/**
 * Variabel untuk menampung listjob
 */
    private String[] listJob;
    /**
     * Inisialisas variabel
     */
    public DatabaseJob(){
       listJob = new String[123];
    }
      /**
     * Constructor Class DatabaseJob
     */
    public DatabaseJob(String[] listJob){
        this.listJob = listJob;
    }
    /**
     * addJob untuk menambah Job
     *
     * @param  job berisi object job
     * @return boolean (untuk sementara)
     */
    public boolean addJob(Job job){
        return false;
    }
    /**
     * removeJob untuk menghapus Job
     *
     * @param  job berisi object job
     * @return boolean (untuk sementara)
     */
    public boolean remove(Job job){
        return false;
    }
    /**
     * getJob untuk mengembalikan objek Job
     *
     * @return null (untuk sementara)
     */
    public Job getJob(){
        return null;
    }
    /**
     * getJob untuk mengembalikan array string listjob
     *
     * @return listJob string array
     */
    public String[] getListJob(){
        return listJob;
    }
}
