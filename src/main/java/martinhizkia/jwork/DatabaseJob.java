package martinhizkia.jwork;
/**
 * Class berisikan method dan atribut untuk kegunaan database job
 * @author Martin Hizkia Parasi
 * @version 18 Maret 2021
 */

import java.util.ArrayList;

public class DatabaseJob {
    // instance variable dari DatabaseJob
    private static ArrayList<Job> JOB_DATABASE =  new ArrayList<Job>();
    private static int lastId = 0;
    /**
     * fungsi untuk menambahkan objel job (
     *
     * @return    boolean
     */
    public static boolean addJob(Job job){
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }

    /**
     * metode untuk menghapus job
     *
     * @return    boolean
     */
    public static boolean removeJob(int id) throws JobNotFoundException {
            for (Job job : JOB_DATABASE) {
                if (job.getId() == id) {
                    JOB_DATABASE.remove(job);
                    return true;
                }
            }
        throw new JobNotFoundException(id);
    }
    /**
     * fungsi untuk mengembalikan job
     *
     * @return    null
     */
    public static ArrayList<Job> getJobDatabase(){
        return JOB_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Job getJobById(int id) throws JobNotFoundException {
        Job result = null;
        for (Job el : JOB_DATABASE) {
            if (el.getId() == id) {
                result = el;
                return result;
            }
        }
        if (result == null){
            throw new JobNotFoundException(id);
        }

        return result;
    }

    public static ArrayList<Job> getJobByRecruiter(int recruiterId) {
        ArrayList<Job> result = null;

        for (Job element : JOB_DATABASE) {
            if (element.getRecruiter().getId() == recruiterId) {
                if (result == null) {
                    result = new ArrayList<Job>();
                }
                result.add(element);
            }
        }
        return result;
    }

    public static ArrayList<Job> getJobByCategory(JobCategory category) {
        ArrayList<Job> temp = new ArrayList<Job>();
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (category == JOB_DATABASE.get(i).getCategory()) {
                temp.add(JOB_DATABASE.get(i));
            }
        }
        return temp;
    }
}
