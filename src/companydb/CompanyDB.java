 package companydb;

import java.awt.*;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
 import javax.swing.*;
import javax.swing.table.DefaultTableModel;
 
 import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CompanyDB extends Frame implements ActionListener {
//first frame
    
    
Frame f1 = new Frame("Home");
Label uName = new Label("UserName");
TextField tUName=new TextField();

Label pass=new Label("Password");
TextField tpass=new TextField();

Button sub=new Button("Login");
Button ex=new Button("Exit");

//second frame
Frame f2=new Frame("Login");
Button project=new Button("project");
Button department=new Button("Department");
Button employee=new Button("Employee");
Button DLocation=new Button("Depart_location");
Button worksOn=new Button("Works_on");
Button dependent=new Button("Dependent");
Button back=new Button("Back");
Button ex2=new Button("Exit");

EmployeeTable em;
Works_onTable w;
DependentTable depend;
DepartmentTable dep;
DepartLocationTable depL;
ProjectTable p;

CompanyDB()
{
//First Frame
    f1.setLayout(null);
    f1.setBounds(450,100,500,500);
    f1.setBackground(new Color(0,0,0));
    f1.setVisible(true);
//Label of first frame
    uName.setBounds(70,200,100,30);
    uName.setBackground(new Color(0,0,0));
    uName.setForeground(new Color(255,255,255));
    f1.add(uName);
    
    pass.setBounds(70,250,100,30);
    pass.setBackground(new Color(0,0,0));
    pass.setForeground(new Color(255,255,255));
    f1.add(pass);
//Text field of first frame    
    tUName.setBounds(170,200,200,30);
    tUName.setBackground(new Color(255,255,255));
    tUName.setForeground(new Color(0,0,0));
    f1.add(tUName);
    
    tpass.setBounds(170,250,200,30);
    tpass.setBackground(new Color(255,255,255));
    tpass.setForeground(new Color(0,0,0));
    f1.add(tpass);
//Button of first frame
    sub.setBounds(170,300,90,30);
    sub.setBackground(new Color(0,200,0));
    sub.setForeground(new Color(0,0,0));
    sub.addActionListener(this);
    f1.add(sub);

    ex.setBounds(280,300,90,30);
    ex.setBackground(new Color(200,0,0));
    ex.setForeground(new Color(255,255,255));
    ex.addActionListener(this);
    f1.add(ex);
//Second frame

    f2.setLayout(null);
    f2.setBackground(new Color(0,0,0));
    f2.setBounds(450,100,500,375);
    f2.setVisible(false);
//Button of Second frame
    employee.setBounds(33,105,100,40);
    employee.setBackground(new Color(0,255,0));
    employee.setForeground(new Color(0,0,0));
    employee.addActionListener(this);
    f2.add(employee);

    worksOn.setBounds(199,105,100,40);
    worksOn.setBackground(new Color(0,255,0));
    worksOn.setForeground(new Color(0,0,0));
    worksOn.addActionListener(this);
    f2.add(worksOn);

    dependent.setBounds(365,105,100,40);
    dependent.setBackground(new Color(0,255,0));
    dependent.setForeground(new Color(0,0,0));
    dependent.addActionListener(this);
    f2.add(dependent);

    department.setBounds(33,230, 100, 40);
    department.setBackground(new Color(0,255,0));
    department.setForeground(new Color(0,0,0));
    department.addActionListener(this);
    f2.add(department);

    DLocation.setBounds(199,230, 100, 40);
    DLocation.setBackground(new Color(0,255,0));
    DLocation.setForeground(new Color(0,0,0));
    DLocation.addActionListener(this);
    f2.add(DLocation);

    project.setBounds(365,230, 100, 40);
    project.setBackground(new Color(0,255,0));
    project.setForeground(new Color(0,0,0));
    project.addActionListener(this);
    f2.add(project);
    
    back.setBounds(121,310,90,30);
    back.setBackground(new Color(0,200,0));
    back.setForeground(new Color(0,0,0,0));
    back.addActionListener(this);
    f2.add(back);
    
    ex2.setBounds(287,310,90,30);
    ex2.setBackground(new Color(200,0,0));
    ex2.setForeground(new Color(255,255,255));
    ex2.addActionListener(this);
    f2.add(ex2);
    
    p=new ProjectTable("project", f2);
    dep = new DepartmentTable("Department", f2);
    em = new EmployeeTable("Employee", f2);
    depL = new DepartLocationTable("DepartLocation", f2);
    w = new Works_onTable("Work_on", f2);
    depend = new DependentTable("Dependent", f2);

}    
    public static void main(String[] args) {
        CompanyDB e = new CompanyDB();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sub)
        {
            if(tUName.getText().equals("123"))
            {
                if(tpass.getText().equals("123"))
                {
                    SqlCompanyDB.ConnectToSQL();  
                    f1.setVisible(false);
                    f2.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, """
                                                The password  used is wrong 
                                                Enter the password is correct""","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, """
                                                The username  used is wrong 
                                                Enter the username  is correct""","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
       
        if(e.getSource()== project)
            {
                f2.setVisible(false);
                this.p.setVisible(true); 
            }
       
        else if(e.getSource()== department )
            {
                f2.setVisible(false);
                dep.setVisible(true);
            }
        else if(e.getSource()== employee)
            {
                f2.setVisible(false);
                em.setVisible(true);
            }
        else if(e.getSource()== DLocation )
            {
                f2.setVisible(false);
                depL.setVisible(true);
            }
        else if(e.getSource()== worksOn )
            {
                f2.setVisible(false);
                w.setVisible(true);
            }
        else if(e.getSource()== dependent)
            {
                f2.setVisible(false);
                depend.setVisible(true);
            }

        if(e.getSource()==ex)
        {
            System.exit(0);
        }
        if(e.getSource()==ex2)
        {
            System.exit(0);
        }
        if(e.getSource()== back)
        {
            f2.setVisible(false);
            f1.setVisible(true);
        }
        
    }
}