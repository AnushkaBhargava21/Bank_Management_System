package bank.management.system.pkg1;
import java.sql.*;

public class Con {
    Connection c;
    Statement s;
    //Register the driver
    //Create Connection
    //Create Statement
    //Execute Query
    //Close Connection
    public Con()
    {
        try
        {
          
          c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem1", "root", "Anushka@1234");
          s = c.createStatement();
    } 
        catch (Exception e) {
            System.out.println(e);
        }
    
}

}