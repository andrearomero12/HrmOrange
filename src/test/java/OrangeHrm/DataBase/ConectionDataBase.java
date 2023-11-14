package OrangeHrm.DataBase;

import org.openqa.selenium.devtools.v85.database.Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectionDataBase {
    private static Connection con;

    public static Connection getConnection() {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver//ONLKBOLADM179; databaseName = OrangeHrm", "DataBase", "pruebas1");
        } catch (Exception e) {
            con = null;
            e.printStackTrace();
        }
        return null;
    }
}
