
/**
 * Write a description of class JWork here.
 *
 * @author Martin Hizkia Parasi
 * @version 18 Maret 2021
 */
public class JWork
{
    /**
     * Main Method
     */
    public static void main(String[] args){
        Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Tanah Abang");
        Recruiter recruiter1 = new Recruiter(1, "Martin", "martin@example.com", "123123123", location1);
        Job job1 = new Job(1, "Backend Engineer Solusimas", recruiter1, 111111, JobCategory.BackEnd);
        Jobseeker jobseeker1 = new Jobseeker(1, "Hizkia", "martin1@example.com", "password123", "13 Maret 2021");
        Invoice invoice1 = new Invoice(1, 2, "12 Maret 2021", 2, jobseeker1);
        System.out.println(recruiter1.getName());
        recruiter1.setName("Hizkia");
        System.out.println(recruiter1.getName());
        job1.printData();
    }
}
