package martinhizkia.jwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Martin Hizkia Parasi
 * @version 16 Juni 2021
 */

public class DatabaseConnection {
    public static Connection connection () {
        Connection c = null;
        String db_name = "jwork";
        String db_user = "postgres";
        String db_password = "root";
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jbdc:postgresql://localhost:5432/" + db_name, db_user, db_password);
            System.out.println("Berhasil");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return c;
    }
}
