 package companydb;

import java.awt.*;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class EmployeeTable extends Frame  implements ActionListener{

    Label fname=new Label("First name");
    TextField tfname=new TextField();
    Label lname=new Label("Last name");
    TextField tlname=new TextField();
    JLabel ssn=new JLabel("🔑Social Security number");
    TextField tssn=new TextField();
    Label address=new Label("Address");
    TextField taddress=new TextField();
    Label Esex=new Label("Gender");
    TextField tEsex=new TextField();
    Label Bdate=new Label("Birth date");
    TextField tBdate=new TextField();
    JLabel EDnumber=new JLabel("🗝️Dnumber");
    TextField tEDnumber=new TextField();
    JLabel superSsn=new JLabel("🗝️Supervisor");
    TextField tsuperSsn=new TextField();
    Label salary=new Label("Salary");
    TextField tSalary=new TextField();

    Button insert=new Button("Insert");
    Button delete=new Button("Delete");
    Button update=new Button("Update");
    Button select=new Button("Select");
    Button ex=new Button("Exit");
    Button back=new Button("Back");
    
    JTable table;
    DefaultTableModel tableModel;
    
    Frame main;
    
    String[] cols = new String[]{"Fname", "Lname", "ssn", "addres", "sex", "Bdate", "Dnumber", "super_ssn", "salary"};
    TextField[] textFields = {tfname, tlname, tssn, taddress, tEsex, tBdate, tEDnumber, tsuperSsn, tSalary};

    EmployeeTable(String title, Frame main) {
        super(title);
        this.main = main;

        setLayout(null);
        setBackground(new Color(0,0,0));
        setBounds(170,0,1200,800);
        setVisible(false);                

    //First name
        fname.setBounds(33,59,140,40);
        fname.setBackground(new Color(0,0,0));
        fname.setForeground(new Color(255,255,0));
        add(fname);

        tfname.setBounds(175,59,266,40);
        tfname.setBackground(new Color(220,225,225));
        tfname.setForeground(new Color(0,0,0,0));
        add(tfname);

    //Last name
        lname.setBounds(33,109,140,40);
        lname.setBackground(new Color(0,0,0));
        lname.setForeground(new Color(255,255,0));
        add(lname);

        tlname.setBounds(175,109,266,40);
        tlname.setBackground(new Color(220,225,225));
        tlname.setForeground(new Color(0,0,0,0));
        add(tlname);

    //Social Security number
        ssn.setBounds(13,159,145,40);
        ssn.setBackground(new Color(0, 0, 0));
        ssn.setForeground(new Color(255,0,0));
        add(ssn);

        tssn.setBounds(175,159,266,40);
        tssn.setBackground(new Color(220,225,225));
        tssn.setForeground(new Color(0,0,0,0));
        add(tssn);

    //Address
        address.setBounds(33,209,140,40);
        address.setBackground(new Color(0, 0, 0));
        address.setForeground(new Color(255,255,0));
        add(address);

        taddress.setBounds(175,209,266,40);
        taddress.setBackground(new Color(220, 225, 225));
        taddress.setForeground(new Color(0, 0, 0, 0));
        add(taddress);

    //Gender
        Esex.setBounds(33,259,140,40);
        Esex.setBackground(new Color(0, 0, 0));
        Esex.setForeground(new Color(255, 255, 0));
        add(Esex);

        tEsex.setBounds(175,259,266,40);
        tEsex.setBackground(new Color(220,225,225));
        tEsex.setForeground(new Color(0, 0, 0, 0));
        add(tEsex);
    //Birth date
        Bdate.setBounds(33,309,140,40);
        Bdate.setBackground(new Color(0, 0, 0));
        Bdate.setForeground(new Color(255, 255, 0));
        add(Bdate);

        tBdate.setBounds(175,309,266,40);
        tBdate.setBackground(new Color(220,225,225));
        tBdate.setForeground(new Color(0, 0, 0, 0));
        add(tBdate);

    //Dnumber
        EDnumber.setBounds(33,359,140,40);
        EDnumber.setBackground(new Color(0, 0, 0));
        EDnumber.setForeground(new Color(0, 255, 0));
        add(EDnumber);

        tEDnumber.setBounds(175,359,266,40);
        tEDnumber.setBackground(new Color(220,225,225));
        tEDnumber.setForeground(new Color(0, 0, 0, 0));
        add(tEDnumber);

    //Supervisor
        superSsn.setBounds(33,409,140,40);
        superSsn.setBackground(new Color(0, 0, 0));
        superSsn.setForeground(new Color(0, 255, 0));
        add(superSsn);

        tsuperSsn.setBounds(175,409,266,40);
        tsuperSsn.setBackground(new Color(220,225,225));
        tsuperSsn.setForeground(new Color(0, 0, 0, 0));
        add(tsuperSsn);

    //Salary
        salary.setBounds(33,459,140,40);
        salary.setBackground(new Color(0, 0, 0));
        salary.setForeground(new Color(255, 255, 0));
        add(salary);

        tSalary.setBounds(175,459,266,40);
        tSalary.setBackground(new Color(220,225,225));
        tSalary.setForeground(new Color(0, 0, 0, 0));
        add(tSalary);

    //Buttons
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
    
    @Override
    public void actionPerformed(ActionEvent em ) {
        if(em.getSource()==select)
        {
            ResultSet result = SqlCompanyDB.select("employee");
            try {
                tableModel.setRowCount(0);
                while(result.next()){ //String[]{"Fname", "Lname", "ssn", "addres", "sex", "Bdate", "Dnumber", "super_ssn", "salary"};
                    tableModel.addRow(new Object[]{result.getString("Fname"), result.getString("Lname"), result.getString("ssn"), result.getString("addres"), result.getString("sex"), result.getString("Bdate"), result.getString("Dnumber"), result.getString("super_ssn"), result.getString("salary")});
                }
            } catch (SQLException ex) {
                Logger.getLogger(DepartmentTable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(em.getSource()==insert)
        {
            SqlCompanyDB.insert("employee", SqlCompanyDB.getColumns(textFields, cols), SqlCompanyDB.getColumnsValue(textFields));
        }
        if(em.getSource()==delete)
        {
            SqlCompanyDB.delete("employee", "ssn", tssn.getText());
        }
        if(em.getSource()==update)
        {
            SqlCompanyDB.update("employee", "ssn", tssn.getText(), SqlCompanyDB.getColumns(textFields, cols), SqlCompanyDB.getColumnsValue(textFields));
        }
        if(em.getSource()==back)
        {
            main.setVisible(true);
            setVisible(false);
            
        }
            if(em.getSource()==ex)
        {
            System.exit(0);
        }
    }


}