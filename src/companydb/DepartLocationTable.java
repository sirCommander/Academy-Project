 package companydb;

import java.awt.*;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
 import javax.swing.*;
import javax.swing.table.DefaultTableModel;
 
public class DepartLocationTable extends Frame  implements ActionListener{

    Label LDnumber=new Label("Department number");
    TextField tLDnumber=new TextField();
    Label Dlocation=new Label("Department location");
    TextField tDlocation=new TextField();


    Button insert=new Button("Insert");
    Button delete=new Button("Delete");
    Button update=new Button("Update");
    Button select=new Button("Select");
    Button ex=new Button("Exit");
    Button back=new Button("Back");

    TextArea  outputT5=new TextArea();
    
    String[] cols = new String[]{"Dnumber", "Dlocation"}; 
    TextField[] textFields = {tLDnumber,tDlocation};  
    
    Frame main;
    
    DepartLocationTable(String title, Frame main) {
        super(title);
        this.main = main;

        setLayout(null);
        setBackground(new Color(0,0,0));
        setBounds(170, 0, 1200, 800);
        setVisible(false);

    //Department number
        LDnumber.setBounds(33,59,140,40);
        LDnumber.setBackground(new Color(0,0,0));
        LDnumber.setForeground(new Color(255,255,0));
        add(LDnumber);

        tLDnumber.setBounds(175,59,266,40);
        tLDnumber.setBackground(new Color(220,225,225));
        tLDnumber.setForeground(new Color(0,0,0,0));
        add(tLDnumber);

    //Department location
        Dlocation.setBounds(33,109,140,40);
        Dlocation.setBackground(new Color(0,0,0));
        Dlocation.setForeground(new Color(255,255,0));
        add(Dlocation);

        tDlocation.setBounds(175,109,266,40);
        tDlocation.setBackground(new Color(220,225,225));
        tDlocation.setForeground(new Color(0,0,0,0));
        add(tDlocation);

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
        outputT5.setBounds(520,59,600,490);
        outputT5.setBackground(new Color(160,0,0));
        outputT5.setForeground(new Color(225, 225, 225));
        add(outputT5);
    }
    public static void main(String[] args) {
//        DepartLocationTable depL = new DepartLocationTable("DepartLocation",this.main);
//        depL.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent depL) {
        if(depL.getSource()==select)
        {
            
        }
        if(depL.getSource()==insert)
        {
            SqlCompanyDB.insert("DEPT_LOCATIONS", SqlCompanyDB.getColumns(textFields, cols), SqlCompanyDB.getColumnsValue(textFields));
        }
        if(depL.getSource()==delete)
        {
            SqlCompanyDB.delete("DEPT_LOCATIONS", "Dlocation", tDlocation.getText());
        }
        if(depL.getSource()==update)
        {
            
        }

        if(depL.getSource()==back)
        {
            setVisible(false);
            main.setVisible(true);
        }
        if(depL.getSource()==ex)
        {
            System.exit(0);
        }
    }
}