import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
    public Calendar joinDate; 
    /**
     * Constructor for objects of class Jobseeker
     * @param id berisikan id jobseeker
     * @param name berisikan name jobseeker
     * @param email berisikan email jobseeker
     * @param password berisikan password jobseeker
     * @param joinDate berisikan joinDate jobseeker
     * 
     */
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = joinDate;
    }

    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth) {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }

    public Jobseeker(int id, String name, String email, String password)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
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
     public Calendar getJoinDate()
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
    public void setEmail(String email){
        String regex = "^[a-zA-Z0-9&*_~]+([\\.{1}]?[a-z0-9]+)+@[a-z0-9A-Z]+([\\.]{1}[a-z]+)\\S+(?!.*?\\.\\.)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches())
        {
            this.email = email;
        }
        else
        {
            this.email = "";
        }
    }
    /**
     * untuk memasukkan password
     * @param password berisikan password yang ingin dimasukkan
     */
    public void setPassword(String password)
    {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()){
            this.password = password;
        }
        else{
            this.password = "";
        }
    }
    /**
     * untuk memasukkan joinDate
     * @param joinDate berisikan joinDate yang ingin dimasukkan
     */
    public void setJoinDate(Calendar joinDate)
    {
        this.joinDate = joinDate;
    }

    public void setJoinDate(int year, int month, int dayOfMonth){
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }
    /**
     * untuk mengeprint nama
     */
    @Override
    public String toString() {
        if (this.joinDate == null) {
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "
                    + getPassword();
        } else {
            SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
            String date = formattedDate.format(getJoinDate().getTime());
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "
                    + getPassword() + "\nJoin Date = " + date;
        }
    }
}
