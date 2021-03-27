
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
        Invoice invoice1 = new Invoice(1, job1.getId(), "12 Maret 2021", job1.getFee(),jobseeker1, PaymentType.EwalletPayment, InvoiceStatus.Ongoing);
        System.out.println(recruiter1.getName());
        recruiter1.setName("Hizkia");
        System.out.println(recruiter1.getName());
        job1.printData();
        InvoiceStatus i1 = InvoiceStatus.Cancelled;
        InvoiceStatus i2 = InvoiceStatus.Ongoing;
        InvoiceStatus i3 = InvoiceStatus.Finished;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        invoice1.printData();

    }
}
