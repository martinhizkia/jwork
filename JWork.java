
/**
 * Write a description of class JWork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JWork
{
    // instance variables - replace the example below with your own
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args){
        Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Tanah Abang");
        Recruiter recruiter1 = new Recruiter(1, "Martin", "martin@example.com", "123123123", location1);
        Job job1 = new Job(1, "Martin", recruiter1, 111111, "HRD");
        Jobseeker jobseeker1 = new Jobseeker(1, "Martin", "martin1@example.com", "password123", "12 Maret 2021");
        Invoice invoice1 = new Invoice(1, 2, "12 Maret 2021", 2, jobseeker1);
    }
}
