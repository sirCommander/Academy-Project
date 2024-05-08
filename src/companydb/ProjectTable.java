 package companydb;

import java.awt.*;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
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
    Label PDnumber=new Label("Number");
    TextField tPDnumber=new TextField();


    Button insert=new Button("Insert");
    Button delete=new Button("Delete");
    Button update=new Button("Update");
    Button select=new Button("Select");
    Button ex=new Button("Exit");
    Button back=new Button("Back");

    TextArea  outputT6=new TextArea();

    public ProjectTable(String title) {
        super(title);

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
        
    //TextArea
        outputT6.setBounds(520,59,600,490);
        outputT6.setBackground(new Color(160,0,0));
        outputT6.setForeground(new Color(225, 225, 225));
        add(outputT6);

    }

    public static void main(String[] args){
        ProjectTable p = new ProjectTable("Project");
        p.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent p) {
        CompanyDB e = new CompanyDB();   
        if(p.getSource()==select)
        {
            
        }
        if(p.getSource()==insert)
        {
            
        }
        if(p.getSource()==delete)
        {
            
        }
        if(p.getSource()==update)
        {
            
        }

        if(p.getSource()==back)
        {
            setVisible(false);
            e.f2.setVisible(true);
        }
        if(p.getSource()==ex)
        {
            System.exit(0);
        }
            e.f1.setVisible(false);

    }
}