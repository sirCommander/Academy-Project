
package companydb;

import java.awt.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SqlCompanyDB {

    public static Connection con;
    public static void ConnectToSQL(){ // to connect to SQL
     try {
     String url = "jdbc:sqlserver://localhost:1433;databaseName=companyDB;integratedSecurity=false;encrypt=false;";
     String username ="123";
     String password ="123";
     con = DriverManager.getConnection(url, username, password);
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

    public static boolean insert(String table, String[] cols, String[] values){
        try{ 
        //ConnectToSQL();
            String[] vals = new String[cols.length];
            for(int i = 0; i < values.length ;i++){
                vals[i] = "'" + values[i] +"'";
            }
            Statement stmt = con.createStatement();
            System.out.println("INSERT INTO " + table + " (" + String.join(", ", cols) + ") VALUES ( "+ String.join(", ", vals) + ");");
            stmt.execute("INSERT INTO " + table + " (" + String.join(", ", cols) + ") VALUES ( "+ String.join(", ", vals) + ");");
            return true;
        }catch (Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(null,"Cant make your edit");
            return false;
        }
    }
    
    public static boolean delete(String table, String primaryKey, String value){
        try{ 
        //ConnectToSQL();
            Statement stmt = con.createStatement();
            System.out.println("DELETE FROM " + table + " WHERE " + primaryKey + " = '" + value + "';");
            stmt.execute("DELETE FROM " + table + " WHERE " + primaryKey + " = '" + value + "';");
            return true;
        }catch (Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(null,"Cant make your edit");
            return false;
        }
    }
    
    public static boolean update(String table, String primaryKey, String[] cols, String[] values){
        try{ 
        //ConnectToSQL();
            String[] vals = new String[cols.length];
            for(int i = 0; i < values.length ;i++){
                vals[i] = "'" + values[i] +"'";
            }
            Statement stmt = con.createStatement();
            
            for (int i = 0; i < cols.length ; i++){
                
            }
            System.out.println("INSERT INTO " + table + " (" + String.join(", ", cols) + ") VALUES ( "+ String.join(", ", vals) + ");");
            stmt.execute("UPDATE " + table + " SET " + String.join(", ", cols) + " "+ String.join(", ", vals) + ";");
            return true;
        }catch (Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(null,"Cant make your edit");
            return false;
        }
    }
    
    public static String[] getColumnsValue(TextField[] textFields){
        int numberOfFilled = 0;
        for(int i = 0; i < textFields.length ; i++){
            if(!"".equals(textFields[i].getText()))
                numberOfFilled++;
        }

        var indexes = new ArrayList<Integer>();
        System.out.print("indexes: ");
        for(int i = 0; i < textFields.length ; i++){
            if(!"".equals(textFields[i].getText())){
                //push(indexes, (int)i);
                indexes.add(i);
            }
        }
        for(int i = 0; i < indexes.size() ; i++){
                System.out.print(indexes.get(i) + ", ");
        }
        
        String[] result = new String[numberOfFilled];
        for(int i = 0; i < indexes.size(); i++){
                result[i] = textFields[indexes.get(i)].getText();
        }
        System.out.println("GetColumnsValues: " + String.join(", ", result));
        return result;
    }
    
    public static String[] getColumns(TextField[] textFields, String[] cols){
        int numberOfFilled = 0;
        for(int i = 0; i < textFields.length ; i++){
            if(!"".equals(textFields[i].getText()))
                numberOfFilled++;
        }

        var indexes = new ArrayList<Integer>();
        System.out.println("textFieldsLength: " + textFields.length);
        for(int i = 0; i < textFields.length ; i++){
            if(!"".equals(textFields[i].getText())){
                indexes.add(i);
            }
        }
        String[] result = new String[numberOfFilled];
        for(int i = 0; i < indexes.size(); i++){
                result[i] = cols[indexes.get(i)];
        }
        
        System.out.println("GetColumns: " + String.join(", ", result));
        return result;
    }
}