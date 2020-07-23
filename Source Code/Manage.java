// This class will take the data from collect.java and manage it in way that it could be developed into an api as well as used by other developers 
import java.util.*;
import java.sql.*;

public class Manage(){
  private String user_info;
  private String data;
  
  // JDBC driver name and database URL
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
  static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";

  //  Database credentials
  static final String USER = "username";
  static final String PASS = "password";
    
  public void initate_database(){
    // this is the method to open a connection with database and get the data out of it 
    Connection conn = null;
   Statement stmt = null;
  }
  
  public String get_data(){
    // method to return the extracted data to the user
    return data;
  }
}
