package martinhizkia.jwork;
/**
 * @author Martin Hizkia Parasi
 * @version 16 Juni 2021
 */
public enum JobCategory {
    WebDeveloper("Web Developer"), FrontEnd("Front End"), BackEnd("Back End"), UI("UI"), UX("UX"), Devops("Devops"),
    DataScientist("Data Scientist"), DataAnalyst("Data Analyst");

    private String jobcategory;

    private JobCategory(String category) {
        this.jobcategory = category;

    }

    @Override
    public String toString() {
        return jobcategory;
    }
}