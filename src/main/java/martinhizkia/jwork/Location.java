package martinhizkia.jwork;
/**
 * Class Location
 *
 * @author Martin Hizkia Parasi
 * @version 18 Maret 2021
 */
public class Location
{
    private String province;
    private String city;
    private String description;
    /**
     * Constructor for objects of class Location
     * @param province untuk memasukan provinsi
     * @param city untuk memasukan city
     * @param description untuk memasukan provinsi
     */
    public Location(String province, String city, String description)
    {
        this.province = province;
        this.city = city;
        this.description = description;
    }
    /**
     * untuk mengembalikan province
     * @return province  
     */
    public String getProvince()
    {
        return province;
    }
    /**
     * untuk mengembalikan city
     * @return city  
     */
    public String getCity()
    {
        return city;
    }
    /**
     * untuk mengembalikan description
     * @return description  
     */
    public String getDescription()
    {
        return description;
    }
    /**
     * untuk memasukkan province
     * @param province pronvisi yang ingin dimasukkan  
     */
    public void setProvince(String province)
    {
        this.province = province;
    }
    /**
     * untuk memasukkan city
     * @param city city yang ingin dimasukkan  
     */
    public void setCity(String city)
    {
        this.city = city;
    }
    /**
     * untuk memasukkan description
     * @param description description yang ingin dimasukkan  
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
    /**
     * untuk mengeprint provinsi
     */
    @Override
    public String toString() {
        return "Province = " + getProvince() + "\nCity = " + getCity() + "\nDescription = " + getDescription();
    }
}
