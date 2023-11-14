package OrangeHrm.DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ColsultDataBase {

    private ConectionDataBase conectionDataBase;

    public void ConsultDataBase(){ this.conectionDataBase = new ConectionDataBase();}

    public static void consultUsers() throws SQLException {
        Connection testCon = ConectionDataBase.getConnection();
        if(testCon!= null){
            System.out.println( "Conecto exitosamente");
            Statement stm = testCon.createStatement();
            ResultSet rst = stm.executeQuery("Select * from [User]");
            while(rst.next()){
                System.out.println( "user"+ rst.getString(1) + rst.getString(2));
            }
        } else{
            System.out.println( "No conecto");
        }
    }
}
