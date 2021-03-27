
/**
 * Class yang berisi atribut dan method Job
 *
 * @author Martin Hizkia Parasi
 * @version 18 Maret 2021
 */
public class Job
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int fee;
    private Recruiter recruiter;
    private JobCategory category;
    
    /**
     * Constructor for objects of class Job
     * @param id berisikan id
     * @param name berisikan nama jon
     * @param recruiter berisikan object recruiter
     * @param fee berisikan gaji
     * @param category berisikan kategori job
     */
    public Job(int id, String name, Recruiter recruiter, int fee, JobCategory category)
    {
        this.id = id;
        this.recruiter = recruiter;
        this.name = name;
        this.fee = fee;
        this.category = category;
        // initialise instance variables
    }

    /**
     * untuk mengembalikan nilai id
     * @return id   id
     */
    public int getId()
    {
        return id;
    }
    /**
     * untuk mengembalikan nama
     * @return name berisikan nama yang dikembalikan
     */
    public String getName()
    {
        return name;
    }
    /**
     * untuk mengembalikan fee
     * @return fee berisikan fee yang dikembalikan
     */
    public int getFee()
    {
        return fee;
    }
    /**
     * untuk mengembalikan category
     * @return category berisikan category yang dikembalikan
     */
    public JobCategory getCategory()
    {
        return category;
    }
    /**
     * untuk mengembalikan recruiter
     * @return recruiter berisikan recruiter yang dikembalikan
     */
    public Recruiter getRecruiter()
    {
        return recruiter;
    }
    /**
     * memasukkan id 
     * @param id berisikan id yang ingin dimasukkan
     */
    public void setId(int id)
    {
       this.id = id;
    }
    /**
     * memasukkan name
     * @param id berisikan id yang ingin dimasukkan
     */
    public void setName(String name)
    {
       this.name = name;
    }
    /**
     * memasukkan Recruiter
     * @param recruiter berisikan recruiter yang ingin dimasukkan
     */
    public void setRecruiter(Recruiter recruiter)
    {
       this.recruiter = recruiter;
    }
    /**
     * memasukkan fee
     * @param fee berisikan fee yang ingin dimasukkan
     */
    public void setFee(int fee)
    {
        this.fee = fee;
    }
    /**
     * memasukkan category
     * @param category berisikan category yang ingin dimasukkan
     */
    public void setCategory(JobCategory category)
    {
        this.category = category;
    }
    /**
     * printdata
     */
    public void printData()
    {
        System.out.println("======================= JOB =======================");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Recruiter: " + recruiter.getName());
        System.out.println("City: " + recruiter.getLocation().getCity());
        System.out.println("Fee: " + fee);
        System.out.println("Category: " + category);
    };
}
