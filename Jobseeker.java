/**
 * Class yang berisi atribut dan method Jobseeker
 *
 * @author Martin Hizkia Parasi
 * @version 18 Maret 2021
 */
public class Jobseeker
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;
    /**
     * Constructor for objects of class Jobseeker
     * @param id berisikan id jobseeker
     * @param name berisikan name jobseeker
     * @param email berisikan email jobseeker
     * @param password berisikan password jobseeker
     * @param joinDate berisikan joinDate jobseeker
     * 
     */
    public Jobseeker(int id, String name, String email, String password, String joinDate)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }
    /**
     * untuk mengembalikan nilai id
     * @return id  
     */
    public int getId()
    {
        return id;
    }
    /**
     * untuk mengembalikan nilai name
     * @return name  mengembalikan name yang diinginkan
     */
    public String getName()
    {
        return name;
    }
    /**
     * untuk mengembalikan nilai email
     * @return email  mengembalikan email yang diinginkan
     */
    public String getEmail()
    {
        return email;
    }
    /**
     * untuk mengembalikan password
     * @return password  mengembalikan password yang diinginkan
     */
    public String getPassword()
    {
        return password;
    }
    /**
     * untuk mengembalikan joinDate
     * @return joinDate  mengembalikan joinDate yang diinginkan
     */
     public String getJoinDate()
    {
        return joinDate;
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
     * untuk memasukkan email
     * @param email berisikan email yang ingin dimasukkan
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    /**
     * untuk memasukkan password
     * @param password berisikan password yang ingin dimasukkan
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
    /**
     * untuk memasukkan joinDate
     * @param joinDate berisikan joinDate yang ingin dimasukkan
     */
    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate;
    }
    /**
     * untuk mengeprint nama
     */
    public void printData() {
        System.out.println(name);
    }
}
