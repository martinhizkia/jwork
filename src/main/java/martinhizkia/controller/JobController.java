package martinhizkia.controller;

import martinhizkia.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * @author Martin Hizkia Parasi
 * @version 16 Juni 2021
 */

@RequestMapping("/job")
@RestController
public class JobController {

    // return all jobs
    @RequestMapping("")
    public ArrayList<Job> getAllJob() {
        ArrayList<Job> job = null;

        job = DatabaseJob.getJobDatabase();
        return job;
    }

    // return a job with an id
    @RequestMapping("/{id}")
    public Job getJobById(@PathVariable int id) {
        Job job = null;
        try {
            job = DatabaseJob.getJobById(id);
        } catch (JobNotFoundException e) {
            e.getMessage();
            return null;
        }
        return job;
    }

    // return a job by its recruiter id
    @RequestMapping("/recruiter/{recruiterId}")
    public ArrayList<Job> getJobByRecruiter(@PathVariable int recruiterId) {
        ArrayList<Job> job = null;
        job = DatabaseJob.getJobByRecruiter(recruiterId);

        return job;
    }

    // return jobs by its category
    @RequestMapping("/category/{category}")
    public ArrayList<Job> getJobByCategory(@PathVariable JobCategory category) {
        ArrayList<Job> job = null;
        job = DatabaseJob.getJobByCategory(category);
        return job;
    }

    // add a new job
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Job addJob(@RequestParam(value="name") String name,
                      @RequestParam(value="fee") int fee,
                      @RequestParam(value="category") String category,
                      @RequestParam(value="recruiterId") int recruiterId) {
        Job job = null;
        try {
            job = new Job(DatabaseJob.getLastId()+1, name, DatabaseRecruiter.getRecruiterById(recruiterId), fee, JobCategory.valueOf(category));
        } catch (RecruiterNotFoundException e) {
            e.getMessage();
        }
        boolean status = DatabaseJob.addJob(job);
        if(status){
            return job  ;
        } else {
            return null;
        }
    }
}
