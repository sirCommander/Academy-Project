
package companydb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SqlCompanyDB {

    public static Connection con;
    public static void ConnectToSQL(){ // to connect to SQL
     try {
     String url = "jdbc:sqlserver://localhost:1433;databaseName=companyDB;integratedSecurity=false;encrypt=false;";
     String username ="123";
     String password ="123";
     con = DriverManager.getConnection(url, username,password);
     System.out.println("CONNECTED");
     } catch (SQLException ex) {
     Logger.getLogger(SqlCompanyDB.class.getName()).log(Level.SEVERE, null, ex);
     System.out.println("Error CONNECTION");
     }}
    
     public static void Close () { // to close the connection of SQL
     try { 
         con.close();
     } catch (SQLException ex) { 
         System.out.println("ERROR Connection"); }
     }
    public static boolean executeNonquary (String sqlStatement) { //to update, delete, insert
     try{ 
        //ConnectToSQL();
        Statement stmt = con.createStatement();
        stmt.execute(sqlStatement);
        return true;
     }catch (Exception e){
     System.out.println(e);
        //JOptionPane.showMessageDialog(null,"Cant make your edit");
        return false;
     }
     
    }
     public static ResultSet executeQuary (String sqlStatement) { //to update, delete, insert
     try{ 
        //ConnectToSQL();
        Statement stmt = con.createStatement();
        return stmt.executeQuery(sqlStatement);
        //return true;
     }catch (Exception e){
        System.out.println(e);
        //JOptionPane.showMessageDialog(null,"Cant make your edit");
        return null;
     }

    }     
}