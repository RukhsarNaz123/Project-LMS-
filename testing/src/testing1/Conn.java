package testing1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
	Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/library?characterEncoding=latin1","root","12345");
            s=c.createStatement();
        }
        catch(Exception e)
        {
           System.out.println(e);  
    }
  }
}
