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
 
public class ProjectTable extends Frame  implements ActionListener{

    Label Pname=new Label("Name");
    TextField tPname=new TextField();
    Label Pnumber=new Label("Number");
    TextField tPnumber=new TextField();
    Label location=new Label("Location");
    TextField tlocation=new TextField();
    Label PDnumber=new Label("Deparment Number");
    TextField tPDnumber=new TextField();


    Button insert=new Button("Insert");
    Button delete=new Button("Delete");
    Button update=new Button("Update");
    Button select=new Button("Select");
    Button ex=new Button("Exit");
    Button back=new Button("Back");
    
    JTable table;
    DefaultTableModel tableModel;
    
    Frame main;
    
    String[] cols = new String[]{"Pname", "Pnumber", "Plocation", "Dnumber"};
    TextField[] textFields = {tPname, tPnumber, tlocation, tPDnumber};

    public ProjectTable(String title, Frame main) {
        super(title);
        this.main = main;

        setLayout(null);
        setBackground(new Color(0,0,0));
        setBounds(170, 0, 1200, 800);
        setVisible(false);

    //Name
        Pname.setBounds(33,59,140,40);
        Pname.setBackground(new Color(0,0,0));
        Pname.setForeground(new Color(255,255,0));
        add(Pname);

        tPname.setBounds(175,59,266,40);
        tPname.setBackground(new Color(220,225,225));
        tPname.setForeground(new Color(0,0,0,0));
        add(tPname);

    //Number
        Pnumber.setBounds(33,109,140,40);
        Pnumber.setBackground(new Color(0,0,0));
        Pnumber.setForeground(new Color(255,255,0));
        add(Pnumber);

        tPnumber.setBounds(175,109,266,40);
        tPnumber.setBackground(new Color(220,225,225));
        tPnumber.setForeground(new Color(0,0,0,0));
        add(tPnumber);

    //Location
        location.setBounds(33,159,140,40);
        location.setBackground(new Color(0, 0, 0));
        location.setForeground(new Color(255,255,0));
        add(location);

        tlocation.setBounds(175,159,266,40);
        tlocation.setBackground(new Color(220,225,225));
        tlocation.setForeground(new Color(0,0,0,0));
        add(tlocation);

    //Number
        PDnumber.setBounds(33,209,140,40);
        PDnumber.setBackground(new Color(0, 0, 0));
        PDnumber.setForeground(new Color(255,255,0));
        add(PDnumber);

        tPDnumber.setBounds(175,209,266,40);
        tPDnumber.setBackground(new Color(220, 225, 225));
        tPDnumber.setForeground(new Color(0, 0, 0, 0));
        add(tPDnumber);
        
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
        
        tableModel = new DefaultTableModel(cols, 0);

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(520,59,600,490);
        add(scrollPane);

    }

    public static void main(String[] args){
//        ProjectTable p = new ProjectTable("Project");
//        p.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent p) {  
        if(p.getSource()==select)
        {
            ResultSet result = SqlCompanyDB.select("PROJECT");
            try {
                tableModel.setRowCount(0);
                while(result.next()){ //String[]{"Pname", "Pnumber", "Plocation", "Dnumber"};
                    tableModel.addRow(new Object[]{result.getString("Pname"), result.getString("Pnumber"), result.getString("Plocation"), result.getString("Dnumber")});
                }
            } catch (SQLException ex) {
                Logger.getLogger(DepartmentTable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(p.getSource()==insert)
        {
            SqlCompanyDB.insert("PROJECT", SqlCompanyDB.getColumns(textFields, cols), SqlCompanyDB.getColumnsValue(textFields));
        }
        if(p.getSource()==delete)
        {
            SqlCompanyDB.delete("PROJECT", "Pumber", tPnumber.getText());
        }
        if(p.getSource()==update)
        {
            SqlCompanyDB.update("PROJECT", "Pumber", tPnumber.getText(), SqlCompanyDB.getColumns(textFields, cols), SqlCompanyDB.getColumnsValue(textFields));
        }

        if(p.getSource()==back)
        {
            setVisible(false);
            main.setVisible(true);
        }
        if(p.getSource()==ex)
        {
            System.exit(0);
        }

    }
}