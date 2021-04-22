/**
 * Write a description of class DatabaseRecruiter here.
 *
 * @author Martin Hizkia Parasi
 * @version 25 Maret 2021
 */

public enum JobCategory {
    WebDeveloper("Web Developer"), 
    FrontEnd("Front End"), 
    BackEnd("Back End"), 
    UI("UI"), 
    UX("UX"), 
    Devops("Devops"),
    DataScientist("Data Scientist"), 
    DataAnalyst("Data Analyst");

    private String jobcategory;
    private JobCategory(String jobcategory) {
        this.jobcategory = jobcategory;
    }

    @Override
    public String toString() {
        return jobcategory;
    }
}