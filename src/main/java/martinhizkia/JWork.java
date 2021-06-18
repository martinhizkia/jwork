
package martinhizkia;

import martinhizkia.jwork.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author Martin Hizkia Parasi
 * @version 16 Juni 2021
 */

@SpringBootApplication
public class JWork {

    public static void main(String[] args) {
        Location location1 = new Location("jakarta", "serpong", "-1");
        Location location2 = new Location("bekasi", "serpong utara", "INFO LOKER");
        Location location3 = new Location("dallas", "texas", "INGFO LOKER");

        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Martin", "Martin@aa.com", "085813", location1));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Martin Hizkia", "martinha@aa.com", "0858134", location2));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Martin Hizkia Parasi", "martinhp@ee.com", "08581345", location3));

        try {
            DatabaseJob.addJob(new Job(1, "Backend Engineer solusimas", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(2, "Data Analyst solusimas", DatabaseRecruiter.getRecruiterById(2), 10000, JobCategory.DataAnalyst));
            DatabaseJob.addJob(new Job(3, "Data Analyst masSolusi", DatabaseRecruiter.getRecruiterById(3), 10000, JobCategory.DataAnalyst));
            DatabaseJob.addJob(new Job(4, "Frontend ashiapCorp", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.UX));
        }
        catch(RecruiterNotFoundException e){
            e.printStackTrace();
        }

        try {
            DatabaseBonus.addBonus(new Bonus(1, "KERJABOS", 200, 1000, true));
        } catch (ReferralCodeAlreadyExistsException e) {
            e.printStackTrace();
        }

        SpringApplication.run(JWork.class, args);
    }

}
