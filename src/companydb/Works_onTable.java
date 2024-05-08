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
 
public class Works_onTable extends Frame  implements ActionListener{

    Label Essn=new Label("Social Security number");
    TextField tEssn=new TextField();
    Label WPnumber=new Label("number");
    TextField tWPnumber=new TextField();
    Label hours=new Label("Hours");
    TextField thours=new TextField();
    Label ID=new Label("ID");
    TextField tID=new TextField();

    Button insert=new Button("Insert");
    Button delete=new Button("Delete");
    Button update=new Button("Update");
    Button select=new Button("Select");
    Button ex=new Button("Exit");
    Button back=new Button("Back");

    JTable table;
    DefaultTableModel tableModel;
    
    Frame main;
    
    String[] cols = new String[]{"Essn", "Pnumber", "WHours", "ID"};
    TextField[] textFields = {tEssn, tWPnumber, thours, tID};

    public Works_onTable(String title, Frame main) {
        super(title);
        this.main = main;

        setLayout(null);
        setBackground(new Color(0,0,0));
        setBounds(170,0,1200,800);
        setVisible(false);

        Essn.setBounds(33,59,140,40);
        Essn.setBackground(new Color(0,0,0));
        Essn.setForeground(new Color(255,255,0));
        add(Essn);

        tEssn.setBounds(175,59,266,40);
        tEssn.setBackground(new Color(220,225,225));
        tEssn.setForeground(new Color(0,0,0,0));
        add(tEssn);

        WPnumber.setBounds(33,109,140,40);
        WPnumber.setBackground(new Color(0,0,0));
        WPnumber.setForeground(new Color(255,255,0));
        add(WPnumber);

        tWPnumber.setBounds(175,109,266,40);
        tWPnumber.setBackground(new Color(220,225,225));
        tWPnumber.setForeground(new Color(0,0,0,0));
        add(tWPnumber);

        hours.setBounds(33,159,140,40);
        hours.setBackground(new Color(0, 0, 0));
        hours.setForeground(new Color(255,255,0));
        add(hours);

        thours.setBounds(175,159,266,40);
        thours.setBackground(new Color(220,225,225));
        thours.setForeground(new Color(0,0,0,0));
        add(thours);
                
        ID.setBounds(33,209,140,40);
        ID.setBackground(new Color(0, 0, 0));
        ID.setForeground(new Color(255,255,0));
        add(ID);

        tID.setBounds(175,209,266,40);
        tID.setBackground(new Color(220, 225, 225));
        tID.setForeground(new Color(0, 0, 0, 0));
        add(tID);

        insert.setBounds(175,519,266,50);
        insert.setBackground(new Color(20,0,160));
        insert.setForeground(new Color(225, 225, 225));
        insert.addActionListener(this);
        add(insert);

        delete.setBounds(175,579,130,50);
        delete.setBackground(new Color(10,0,160));
        delete.setForeground(new Color(225, 225, 225));
        delete.addActionListener(this);
        add(delete);

        update.setBounds(311,579,130,50);
        update.setBackground(new Color(0,0,160));
        update.setForeground(new Color( 225, 225, 225));
        update.addActionListener(this);
        add(update);

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
//        Works_onTable w = new Works_onTable("Work_on");
//        w.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent w) {
        if(w.getSource()==select)
        {
            ResultSet result = SqlCompanyDB.select("WORKS_ON");
            try {
                tableModel.setRowCount(0);
                while(result.next()){ //String[] cols = new String[]{"Essn", "Pnumber", "WHours"};
                    tableModel.addRow(new Object[]{result.getString("Essn"), result.getString("Pnumber"), result.getString("WHours"), result.getString("ID")});
                }
            } catch (SQLException ex) {
                Logger.getLogger(DepartmentTable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(w.getSource()==insert)
        {
            SqlCompanyDB.insert("WORKS_ON", SqlCompanyDB.getColumns(textFields, cols), SqlCompanyDB.getColumnsValue(textFields));
        }
        if(w.getSource()==delete)
        {
            SqlCompanyDB.delete("WORKS_ON", "Pumber", tID.getText());
        }
        if(w.getSource()==update)
        {
            SqlCompanyDB.update("WORKS_ON", "Pumber", tID.getText(), SqlCompanyDB.getColumns(textFields, cols), SqlCompanyDB.getColumnsValue(textFields));
        }

        if(w.getSource()==back)
        {
            setVisible(false);
            main.setVisible(true);
        }
        if(w.getSource()==ex)
        {
            System.exit(0);
        }
    }
}