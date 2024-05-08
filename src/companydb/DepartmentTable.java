 package companydb;

import java.awt.*;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
 import javax.swing.*;
import javax.swing.table.DefaultTableModel;
 
public class DepartmentTable extends Frame  implements ActionListener{

    Button insert=new Button("Insert");
    Button delete=new Button("Delete");
    Button update=new Button("Update");
    Button select=new Button("Select");
    Button ex=new Button("Exit");
    Button back=new Button("Back");

    Label Dname=new Label("Name");
    TextField tDname=new TextField();
    Label Dnumber=new Label("Dnumber");
    TextField tDnumber=new TextField();
    Label startDate=new Label("Start date");
    TextField tstartDate=new TextField();
    Label Mssn=new Label("social security number");
    TextField tMssn=new TextField();

    TextArea  outputT4=new TextArea();
    
    String[] cols = new String[]{"Dname", "Dnumber", "M_start_date", "M_ssn"};
    TextField[] textFields = {tDname, tDnumber, tstartDate, tMssn};

    Frame main;
    
    DepartmentTable(String title, Frame main) {
        super(title);
        this.main = main;

        setLayout(null);
        setBackground(new Color(0,0,0));
        setBounds(170, 0, 1200, 800);
        setVisible(false);
    //Name
        Dname.setBounds(33,59,140,40);
        Dname.setBackground(new Color(0,0,0));
        Dname.setForeground(new Color(255,255,0));
        add(Dname);

        tDname.setBounds(175,59,266,40);
        tDname.setBackground(new Color(220,225,225));
        tDname.setForeground(new Color(0,0,0,0));
        add(tDname);

    //Dnumber
        Dnumber.setBounds(33,109,140,40);
        Dnumber.setBackground(new Color(0,0,0));
        Dnumber.setForeground(new Color(255,255,0));
        add(Dnumber);

        tDnumber.setBounds(175,109,266,40);
        tDnumber.setBackground(new Color(220,225,225));
        tDnumber.setForeground(new Color(0,0,0,0));
        add(tDnumber);

    //Srtart date
        startDate.setBounds(33,159,140,40);
        startDate.setBackground(new Color(0, 0, 0));
        startDate.setForeground(new Color(255,255,0));
        add(startDate);

        tstartDate.setBounds(175,159,266,40);
        tstartDate.setBackground(new Color(220,225,225));
        tstartDate.setForeground(new Color(0,0,0,0));
        add(tstartDate);

    //Start date
        Mssn.setBounds(33,209,140,40);
        Mssn.setBackground(new Color(0, 0, 0));
        Mssn.setForeground(new Color(255,255,0));
        add(Mssn);

        tMssn.setBounds(175,209,266,40);
        tMssn.setBackground(new Color(220, 225, 225));
        tMssn.setForeground(new Color(0, 0, 0, 0));
        add(tMssn);

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
        outputT4.setBounds(520,59,600,490);
        outputT4.setBackground(new Color(160,0,0));
        outputT4.setForeground(new Color(225, 225, 225));
        add(outputT4);
    }
    public static void main(String[] args) {
//        DepartmentTable dep = new DepartmentTable("Department");
//        dep.setVisible(true);
    }
   
    @Override
    public void actionPerformed(ActionEvent dep) {
        if(dep.getSource()==select)
        {
            
        }
        if(dep.getSource()==insert)
        {
            SqlCompanyDB.insert("Department", SqlCompanyDB.getColumns(textFields, cols), SqlCompanyDB.getColumnsValue(textFields));
        }
        if(dep.getSource()==delete)
        {
            SqlCompanyDB.delete("Department", "Dnumber", tDnumber.getText());
        }
        if(dep.getSource()==update)
        {
            
        }

        if(dep.getSource()==back)
        {
            setVisible(false);
            main.setVisible(true);
        }
                if(dep.getSource()==ex)
        {
            System.exit(0);
        }

    }
}