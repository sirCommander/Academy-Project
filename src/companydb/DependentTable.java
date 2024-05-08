 package companydb;

import java.awt.*;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
 import javax.swing.*;
import javax.swing.table.DefaultTableModel;
 
public class DependentTable extends Frame  implements ActionListener{

    Label DEssn=new Label("Social Security number");
    TextField tDEssn=new TextField();
    Label dependentName=new Label("Dependent name");
    TextField tdependentName=new TextField();
    Label Dsex=new Label("Gender");
    TextField tDsex=new TextField();
    Label DBdate=new Label("Birth date");
    TextField tDBdate=new TextField();
    Label relationship=new Label("Relationships");
    TextField trelationship=new TextField();

    Button insert=new Button("Insert");
    Button delete=new Button("Delete");
    Button update=new Button("Update");
    Button select=new Button("Select");
    Button ex=new Button("Exit");
    Button back=new Button("Back");
    
    JTable table;
    DefaultTableModel tableModel;
    
    Frame main;
    
    String[] cols = new String[]{"Essn", "Dependent_name", "sex", "Bdate", "Relationship"};
    TextField[] textFields = {tDEssn, tdependentName, tDsex, tDBdate, trelationship};

    DependentTable(String title, Frame main) {
        super(title);
        this.main = main;

        setLayout(null);
        setBackground(new Color(0,0,0));
        setBounds(170,0,1200,800);
        setVisible(false);


    //Social Security number
        DEssn.setBounds(33,59,140,40);
        DEssn.setBackground(new Color(0,0,0));
        DEssn.setForeground(new Color(255,255,0));
        add(DEssn);

        tDEssn.setBounds(175,59,266,40);
        tDEssn.setBackground(new Color(220,225,225));
        tDEssn.setForeground(new Color(0,0,0,0));
        add(tDEssn);

    //Dependent name
        dependentName.setBounds(33,109,140,40);
        dependentName.setBackground(new Color(0,0,0));
        dependentName.setForeground(new Color(255,255,0));
        add(dependentName);

        tdependentName.setBounds(175,109,266,40);
        tdependentName.setBackground(new Color(220,225,225));
        tdependentName.setForeground(new Color(0,0,0,0));
        add(tdependentName);

    //Gender
        Dsex.setBounds(33,159,140,40);
        Dsex.setBackground(new Color(0, 0, 0));
        Dsex.setForeground(new Color(255,255,0));
        add(Dsex);

        tDsex.setBounds(175,159,266,40);
        tDsex.setBackground(new Color(220,225,225));
        tDsex.setForeground(new Color(0,0,0,0));
        add(tDsex);

    //Birth date
        DBdate.setBounds(33,209,140,40);
        DBdate.setBackground(new Color(0, 0, 0));
        DBdate.setForeground(new Color(255,255,0));
        add(DBdate);

        tDBdate.setBounds(175,209,266,40);
        tDBdate.setBackground(new Color(220, 225, 225));
        tDBdate.setForeground(new Color(0, 0, 0, 0));
        add(tDBdate);

    //Relationships
        relationship.setBounds(33,259,140,40);
        relationship.setBackground(new Color(0, 0, 0));
        relationship.setForeground(new Color(255, 255, 0));
        add(relationship);

        trelationship.setBounds(175,259,266,40);
        trelationship.setBackground(new Color(220,225,225));
        trelationship.setForeground(new Color(0, 0, 0, 0));
        add(trelationship);
    
        
    //Button
    //Insert
        insert.setBounds(175,519,266,50);
        insert.setBackground(new Color(20,0,160));
        insert.setForeground(new Color(225, 225, 225));
        insert.addActionListener(this);
        add(insert);

    //Delete
        delete.setBounds(175,579,130,50);
        delete.setBackground(new Color(10,0,160));
        delete.setForeground(new Color(225, 225, 225));
        delete.addActionListener(this);
        add(delete);

    //Update
        update.setBounds(311,579,130,50);
        update.setBackground(new Color(0,0,160));
        update.setForeground(new Color( 225, 225, 225));
        update.addActionListener(this);
        add(update);

    //Select
        select.setBounds(700,579,266,50);
        select.setBackground(new Color(0,200,0));
        select.setForeground(new Color(0, 0, 0, 0));
        select.addActionListener(this);
        add(select);

    //Back
            back.setBounds(175,639,266,50);
            back.setBackground(new Color(0,200,0));
            back.setForeground(new Color(0,0,0,0));
            back.addActionListener(this);
            add(back);
            
    //Exit
        ex.setBounds(175,700,266,50);
        ex.setBackground(new Color(200,0,0));
        ex.setForeground(new Color(225, 225, 225));
        ex.addActionListener(this);
        add(ex);
        
    //TextArea
       tableModel = new DefaultTableModel(cols, 0);

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(520,59,600,490);
        add(scrollPane);
    }

    public static void main(String[] args) {
//        DependentTable depend = new DependentTable("Dependent");
//        depend.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent depend) {
        if(depend.getSource()==select)
        {
            ResultSet result = SqlCompanyDB.select("DEPENDENT1");
            try {
                tableModel.setRowCount(0);
                while(result.next()){ //String[] cols = new String[]{"Essn", "Dependent_name", "sex", "Bdate", "Relationship"};
                    tableModel.addRow(new Object[]{result.getString("Essn"), result.getString("Dependent_name"), result.getString("sex"), result.getString("Bdate"), result.getString("Relationship")});
                }
            } catch (SQLException ex) {
                Logger.getLogger(DepartmentTable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(depend.getSource()==insert)
        {
            SqlCompanyDB.insert("DEPENDENT1", SqlCompanyDB.getColumns(textFields, cols), SqlCompanyDB.getColumnsValue(textFields));
        }
        if(depend.getSource()==delete)
        {
            SqlCompanyDB.delete("DEPENDENT1", "Essn", tDEssn.getText());
        }
        if(depend.getSource()==update)
        {
            SqlCompanyDB.update("DEPENDENT1", "Essn", tDEssn.getText(), SqlCompanyDB.getColumns(textFields, cols), SqlCompanyDB.getColumnsValue(textFields));
        }

        if(depend.getSource()==back)
        {
            setVisible(false);
            main.setVisible(true);
        }
        if(depend.getSource()==ex)
        {
            System.exit(0);
        }

    }

}