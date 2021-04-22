/*
 * Write a description of class DatabaseRecruiter here.
 *
 * @author Martin Hizkia Parasi
 * @version 25 Maret 2021
 */
import java.util.ArrayList;

public class DatabaseRecruiter
{
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId = 0;

    public static ArrayList<Recruiter> getRecruiterDatabase()
    {
        return RECRUITER_DATABASE;
    }
    public static int getLastId()
    {
        return lastId;
    }
    public static Recruiter getRecruiterById(int id)
    {
        Recruiter temp = null;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()){
                temp = recruiter;
            }
            else{
                temp =  null;
            }
        }
        return temp;
    }
    /*
     * An example of a method - replace this comment with your own
     *
     * @param  recruiter  objek recruiter
     * @return    boolean
     */
    public static boolean addRecruiter(Recruiter recruiter)
    {
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }
       /*
     * An example of a method - replace this comment with your own
     *
     * @param  recruiter  objek recruiter
     * @return    boolean
     */
       public static boolean removeRecruiter(int id)
       {
           boolean temp = true;
           for (Recruiter recruiter: RECRUITER_DATABASE) {
               if (id == recruiter.getId()){
                   RECRUITER_DATABASE.remove(id);
                   temp = true;
               }
               else{
                   temp = false;
               }
           }
           return temp;
       }
}