import java.util.GregorianCalendar;

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
//        Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Tanah Abang");
//        Recruiter recruiter1 = new Recruiter(1, "Martin", "martin@example.com", "123123123", location1);
//        Bonus bonus1 = new Bonus(33, "GRAB50HEMAT", 333, 1000, true);
//        Bonus bonus2 = new Bonus(34, "GRAB50HEMAT", 222, 100221, true);
//
//         EwalletPayment invoice1 = new EwalletPayment(1, job1, "13 Desember 2021", jobseeker1,InvoiceStatus.Ongoing);
//         EwalletPayment invoice2 = new EwalletPayment(2, job2, "14 Desember 2021", jobseeker1,InvoiceStatus.Ongoing, bonus1);
//         EwalletPayment invoice3 = new EwalletPayment(3, job1, "15 Desember 2021", jobseeker1,InvoiceStatus.Ongoing, bonus2);
//
//         BankPayment bankpayment1 = new BankPayment(224, job1, "1/4/2020", jobseeker1, InvoiceStatus.Finished);
//         BankPayment bankpayment2 = new BankPayment(225, job2, "1/4/2020", jobseeker1, InvoiceStatus.Finished, 12);
//
//         bankpayment1.printData();
//         bankpayment2.printData();
//
//         invoice1.printData();
//         invoice2.printData();
//         invoice3.printData();
//
//         System.out.println(recruiter1.getName());
//         recruiter1.setName("Hizkia");
//         System.out.println(recruiter1.getName());
//         job1.printData();
//        InvoiceStatus i1 = InvoiceStatus.Cancelled;
//        InvoiceStatus i2 = InvoiceStatus.Ongoing;
//        InvoiceStatus i3 = InvoiceStatus.Finished;
//         System.out.println(i1);
//         System.out.println(i2);
//         System.out.println(i3);
//         invoice1.printData();
//
//        Jobseeker js1 = new Jobseeker(1, "Martin", "marrhi..zkia21a@ui.ac.id", "maatinhizkia321", new GregorianCalendar(2000, 0, 15));
//        Jobseeker js2 = new Jobseeker(2, "Hizkia", "hizkia@ui.ac.id", "MartinKrean123", 2021, 03, 6);
//        Jobseeker js3 = new Jobseeker(3, "Parasi", "parasi@ui.ac.id", "MartinAeren41233");
//        Job job1 = new Job(1, "Backend Engineer Solusimas", recruiter1, 10000, JobCategory.BackEnd);
//        Job job2 = new Job(2, "Frontend Engineer Solusimas", recruiter1, 10000, JobCategory.FrontEnd);
//         System.out.println(js1.toString());
//         System.out.println(js2.toString());
//         System.out.println(js3.toString());
//         js1.setEmail("martinhizkia@gg.gg");
//         js1.setPassword("M123oqweqwe");
//         System.out.println(js1.toString());
//
//        EwalletPayment ew1 = new EwalletPayment(2, job1, js2, i1);
//        BankPayment bp1 = new BankPayment(3, job1, js2, i1);
//        ew1.setTotalFee();
//        bp1.setTotalFee();
//        System.out.println(ew1.toString());
//        System.out.println(bp1.toString());


        Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Tanah Abang");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Martin", "martin@example.com", "123123123", location1));
        DatabaseJobSeeker.addJobseeker(new Jobseeker(DatabaseJobSeeker.getLastId() + 1, "Hizkia", "hizkia@ui.ac.id", "MartinKrean123", 2021, 03, 6));
        DatabaseJobSeeker.addJobseeker(new Jobseeker(DatabaseJobSeeker.getLastId() + 1, "Hizkia", "hizkia@ui.ac.id", "MartinKrean123", 2021, 04 ,6));
        DatabaseJobSeeker.addJobseeker(new Jobseeker(DatabaseJobSeeker.getLastId() + 1 , "Fajar", "fajar@ui.ac.id", "FajarJele123k", 2021, 03, 6));
        System.out.println(DatabaseJobSeeker.getDatabaseJobseeker());
        DatabaseJob.addJob(new Job(DatabaseJob.getLastId() + 1, "Backend Engineer Solusimas", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.FrontEnd));
        DatabaseJob.addJob(new Job(DatabaseJob.getLastId() + 1, "Engineer Backend masSoulsi", DatabaseRecruiter.getRecruiterById(1), 20000, JobCategory.FrontEnd));
        DatabaseJob.addJob(new Job(DatabaseJob.getLastId() + 1, "Frontend Engineer Solusimas", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.Devops));
        System.out.println(DatabaseJob.getJobByCategory(JobCategory.FrontEnd));











    }
}
