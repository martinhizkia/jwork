/**
 * Class Location
 *
 * @author Martin Hizkia Parasi
 * @version 18 Maret 2021
 */
package martinhizkia.jwork;
public class Recruiter
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    /**
     * Constructor for objects of class Location
     * @param id untuk memasukan id
     * @param name untuk memasukan name
     * @param email untuk memasukan email
     * @param phoneNumber untuk memasukan phoneNumber
     * @param location untuk memasukan location
     */
    public Recruiter(int id, String name, String email, String phoneNumber, Location location )
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }
    /**
     * untuk mengembalikan id
     * @return id  id yang ingin dikembalikan
     */
    public int getId()
    {
        return id;
    }
    /**
     * untuk mengembalikan name
     * @return name  name yang ingin dikembalikan
     */
    public String getName()
    {
        return name;
    }   
    /**
     * untuk mengembalikan email
     * @return email  email yang ingin dikembalikan
     */
    public String getEmail()
    {
        return email;
    }
    /**
     * untuk mengembalikan phoneNumber
     * @return phoneNumber  phoneNumber yang ingin dikembalikan
     */
     public String getPhoneNumber()
    {
        return phoneNumber;
    }
    /**
     * untuk mengembalikan location
     * @return location  location yang ingin dikembalikan
     */
    public Location getLocation()
    {
        return location;
    }
    /**
     * untuk memasukkan id
     * @param id id yang ingin dimasukkan  
     */
    public void setId(int id)
    {
        this.id = id;
    }
    /**
     * untuk memasukkan email
     * @param email email yang ingin dimasukkan  
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    /**
     * untuk memasukkan name
     * @param name name yang ingin dimasukkan  
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * untuk memasukkan phoneNumber
     * @param phoneNumber phoneNumber yang ingin dimasukkan  
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    /**
     * untuk memasukkan location
     * @param location location yang ingin dimasukkan  
     */
    public void setLocation(Location location)
    {
        this.location = location;
    }
    /**
     * untuk mengeprint nama
     */
    @Override
    public String toString() {
        return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPhone Number = "
                + getPhoneNumber() + "\nLocation = " + getLocation();
    }
}

