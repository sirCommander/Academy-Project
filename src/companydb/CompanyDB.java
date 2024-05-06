
package companydb;

import java.awt.*;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;


public class CompanyDB extends Frame implements ActionListener {
//first frame
Frame f1=new Frame("Home");
Label uName=new Label("UserName");
TextField tUName=new TextField();

Label pass=new Label("Password");
TextField tpass=new TextField();

Button sub=new Button("Login");
Button ex=new Button("Exit");

//TextArea  output=new TextArea();

//second frame
Frame f2=new Frame("Login");
Button project=new Button("project");
Button department=new Button("Department");
Button employee=new Button("Employee");
Button DLocation=new Button("Depart_location");
Button worksOn=new Button("Works_on");
Button dependent=new Button("Dependent");


    //main button
//Button insert=new Button("Insert");
//Button delete=new Button("Delete");
//Button update=new Button("Update");
//Button select=new Button("Select");
//Button exit=new Button("Exit");

    //T1 frame "employee"

Frame T1=new Frame("Employee");

Label fname=new Label("First name");
TextField tfname=new TextField();
Label lname=new Label("Last name");
TextField tlname=new TextField();
Label ssn=new Label("Social Security number");
TextField tssn=new TextField();
Label address=new Label("Address");
TextField taddress=new TextField();
Label Esex=new Label("Gender");
TextField tEsex=new TextField();
Label Bdate=new Label("Birth date");
TextField tBdate=new TextField();
Label EDnumber=new Label("Dnumber");
TextField tEDnumber=new TextField();
Label superSsn=new Label("Supervisor");
TextField tsuperSsn=new TextField();
Label salary=new Label("Salary");
TextField tSalary=new TextField();

Button insertT1=new Button("Insert");
Button deleteT1=new Button("Delete");
Button updateT1=new Button("Update");
Button selectT1=new Button("Select");
Button exitT1=new Button("Exit");

TextArea  outputT1=new TextArea();

    //T2 frame "works_on"

Frame T2=new Frame("Works_on");

Label Essn=new Label("Social Security number");
TextField tEssn=new TextField();
Label WPnumber=new Label("number");
TextField tWPnumber=new TextField();
Label hours=new Label("Hours");
TextField thours=new TextField();

Button insertT2=new Button("Insert");
Button deleteT2=new Button("Delete");
Button updateT2=new Button("Update");
Button selectT2=new Button("Select");
Button exitT2=new Button("Exit");

TextArea  outputT2=new TextArea();

    //T3 frame "dependent"

Frame T3=new Frame("Dependent");

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

Button insertT3=new Button("Insert");
Button deleteT3=new Button("Delete");
Button updateT3=new Button("Update");
Button selectT3=new Button("Select");
Button exitT3=new Button("Exit");

TextArea  outputT3=new TextArea();

    //T4 frame "department"

Frame T4=new Frame("Department");

Label Dname=new Label("Name");
TextField tDname=new TextField();
Label Dnumber=new Label("Dnumber");
TextField tDnumber=new TextField();
Label startDate=new Label("Start date");
TextField tstartDate=new TextField();
Label Mssn=new Label("social security number");
TextField tMssn=new TextField();

Button insertT4=new Button("Insert");
Button deleteT4=new Button("Delete");
Button updateT4=new Button("Update");
Button selectT4=new Button("Select");
Button exitT4=new Button("Exit");

TextArea  outputT4=new TextArea();

    //T5 frame "depart_Location" 

Frame T5=new Frame("Department Location");

Label LDnumber=new Label("Department number");
TextField tLDnumber=new TextField();
Label Dlocation=new Label("Department location");
TextField tDlocation=new TextField();


Button insertT5=new Button("Insert");
Button deleteT5=new Button("Delete");
Button updateT5=new Button("Update");
Button selectT5=new Button("Select");
Button exitT5=new Button("Exit");

TextArea  outputT5=new TextArea();

    //T6 frame "project"

Frame T6=new Frame("Project");


Label Pname=new Label("Name");
TextField tPname=new TextField();
Label Pnumber=new Label("Number");
TextField tPnumber=new TextField();
Label location=new Label("Location");
TextField tlocation=new TextField();
Label PDnumber=new Label("Number");
TextField tPDnumber=new TextField();


Button insertT6=new Button("Insert");
Button deleteT6=new Button("Delete");
Button updateT6=new Button("Update");
Button selectT6=new Button("Select");
Button exitT6=new Button("Exit");

TextArea  outputT6=new TextArea();

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
    sub.setBackground(new Color(0,255,0));
    sub.setForeground(new Color(0,0,0));
    sub.addActionListener(this);
    f1.add(sub);

    ex.setBounds(280,300,90,30);
    ex.setBackground(new Color(255,0,0));
    ex.setForeground(new Color(0,0,0));
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
    f2.add(employee);

    worksOn.setBounds(199,105,100,40);
    worksOn.setBackground(new Color(0,255,0));
    worksOn.setForeground(new Color(0,0,0));
    f2.add(worksOn);

    dependent.setBounds(365,105,100,40);
    dependent.setBackground(new Color(0,255,0));
    dependent.setForeground(new Color(0,0,0));
    f2.add(dependent);

    department.setBounds(33,230, 100, 40);
    department.setBackground(new Color(0,255,0));
    department.setForeground(new Color(0,0,0));
    f2.add(department);

    DLocation.setBounds(199,230, 100, 40);
    DLocation.setBackground(new Color(0,255,0));
    DLocation.setForeground(new Color(0,0,0));
    f2.add(DLocation);

    project.setBounds(365,230, 100, 40);
    project.setBackground(new Color(0,255,0));
    project.setForeground(new Color(0,0,0));
    f2.add(project);

    //T1 frame "employee"
    T1.setLayout(null);
    T1.setBackground(new Color(0,0,0));
    T1.setBounds(170,0,1200,800);
    T1.setVisible(false);                

//First name
    fname.setBounds(33,59,140,40);
    fname.setBackground(new Color(0,0,0));
    fname.setForeground(new Color(255,255,0));
    T1.add(fname);

    tfname.setBounds(175,59,266,40);
    tfname.setBackground(new Color(220,225,225));
    tfname.setForeground(new Color(0,0,0,0));
    T1.add(tfname);

//Last name
    lname.setBounds(33,109,140,40);
    lname.setBackground(new Color(0,0,0));
    lname.setForeground(new Color(255,255,0));
    T1.add(lname);

    tlname.setBounds(175,109,266,40);
    tlname.setBackground(new Color(220,225,225));
    tlname.setForeground(new Color(0,0,0,0));
    T1.add(tlname);

//Social Security number
    ssn.setBounds(33,159,140,40);
    ssn.setBackground(new Color(0, 0, 0));
    ssn.setForeground(new Color(255,255,0));
    T1.add(ssn);

    tssn.setBounds(175,159,266,40);
    tssn.setBackground(new Color(220,225,225));
    tssn.setForeground(new Color(0,0,0,0));
    T1.add(tssn);

//Address
    address.setBounds(33,209,140,40);
    address.setBackground(new Color(0, 0, 0));
    address.setForeground(new Color(255,255,0));
    T1.add(address);

    taddress.setBounds(175,209,266,40);
    taddress.setBackground(new Color(220, 225, 225));
    taddress.setForeground(new Color(0, 0, 0, 0));
    T1.add(taddress);

//Gender
    Esex.setBounds(33,259,140,40);
    Esex.setBackground(new Color(0, 0, 0));
    Esex.setForeground(new Color(255, 255, 0));
    T1.add(Esex);

    tEsex.setBounds(175,259,266,40);
    tEsex.setBackground(new Color(220,225,225));
    tEsex.setForeground(new Color(0, 0, 0, 0));
    T1.add(tEsex);
//Birth date
    Bdate.setBounds(33,309,140,40);
    Bdate.setBackground(new Color(0, 0, 0));
    Bdate.setForeground(new Color(255, 255, 0));
    T1.add(Bdate);

    tBdate.setBounds(175,309,266,40);
    tBdate.setBackground(new Color(220,225,225));
    tBdate.setForeground(new Color(0, 0, 0, 0));
    T1.add(tBdate);

//Dnumber
    EDnumber.setBounds(33,359,140,40);
    EDnumber.setBackground(new Color(0, 0, 0));
    EDnumber.setForeground(new Color(255, 255, 0));
    T1.add(EDnumber);

    tEDnumber.setBounds(175,359,266,40);
    tEDnumber.setBackground(new Color(220,225,225));
    tEDnumber.setForeground(new Color(0, 0, 0, 0));
    T1.add(tEDnumber);

//Supervisor
    superSsn.setBounds(33,409,140,40);
    superSsn.setBackground(new Color(0, 0, 0));
    superSsn.setForeground(new Color(255, 255, 0));
    T1.add(superSsn);

    tsuperSsn.setBounds(175,409,266,40);
    tsuperSsn.setBackground(new Color(220,225,225));
    tsuperSsn.setForeground(new Color(0, 0, 0, 0));
    T1.add(tsuperSsn);

//Salary
    salary.setBounds(33,459,140,40);
    salary.setBackground(new Color(0, 0, 0));
    salary.setForeground(new Color(255, 255, 0));
    T1.add(salary);

    tSalary.setBounds(175,459,266,40);
    tSalary.setBackground(new Color(220,225,225));
    tSalary.setForeground(new Color(0, 0, 0, 0));
    T1.add(tSalary);

//Button
//Insert
    insertT1.setBounds(175,519,266,50);
    insertT1.setBackground(new Color(20,0,160));
    insertT1.setForeground(new Color(225, 225, 225));
    T1.add(insertT1);

//Delete
    deleteT1.setBounds(175,579,130,50);
    deleteT1.setBackground(new Color(10,0,160));
    deleteT1.setForeground(new Color(225, 225, 225));
    T1.add(deleteT1);

//Update
    updateT1.setBounds(311,579,130,50);
    updateT1.setBackground(new Color(0,0,160));
    updateT1.setForeground(new Color( 225, 225, 225));
    T1.add(updateT1);

//Select
    selectT1.setBounds(700,579,266,50);
    selectT1.setBackground(new Color(0,160,0));
    selectT1.setForeground(new Color(0, 0, 0, 0));
    T1.add(selectT1);

//Exit
    exitT1.setBounds(175,639,266,50);
    exitT1.setBackground(new Color(160,0,0));
    exitT1.setForeground(new Color(225, 225, 225));
    T1.add(exitT1);
    
//TextArea
    outputT1.setBounds(520,59,600,490);
    outputT1.setBackground(new Color(160,0,0));
    outputT1.setForeground(new Color(225, 225, 225));
    T1.add(outputT1);
    
    //T2 frame "works_on"

    T2.setLayout(null);
    T2.setBackground(new Color(0,0,0));
    T2.setBounds(170,0,1200,800);
    T2.setVisible(false);

//Social Security number
    Essn.setBounds(33,59,140,40);
    Essn.setBackground(new Color(0,0,0));
    Essn.setForeground(new Color(255,255,0));
    T2.add(Essn);

    tEssn.setBounds(175,59,266,40);
    tEssn.setBackground(new Color(220,225,225));
    tEssn.setForeground(new Color(0,0,0,0));
    T2.add(tEssn);

//number
    WPnumber.setBounds(33,109,140,40);
    WPnumber.setBackground(new Color(0,0,0));
    WPnumber.setForeground(new Color(255,255,0));
    T2.add(WPnumber);

    tWPnumber.setBounds(175,109,266,40);
    tWPnumber.setBackground(new Color(220,225,225));
    tWPnumber.setForeground(new Color(0,0,0,0));
    T2.add(tWPnumber);

//Hours
    hours.setBounds(33,159,140,40);
    hours.setBackground(new Color(0, 0, 0));
    hours.setForeground(new Color(255,255,0));
    T2.add(hours);

    thours.setBounds(175,159,266,40);
    thours.setBackground(new Color(220,225,225));
    thours.setForeground(new Color(0,0,0,0));
    T2.add(thours);

//Button
//Insert
    insertT2.setBounds(175,519,266,50);
    insertT2.setBackground(new Color(20,0,160));
    insertT2.setForeground(new Color(225, 225, 225));
    T2.add(insertT2);

//Delete
    deleteT2.setBounds(175,579,130,50);
    deleteT2.setBackground(new Color(10,0,160));
    deleteT2.setForeground(new Color(225, 225, 225));
    T2.add(deleteT2);

//Update
    updateT2.setBounds(311,579,130,50);
    updateT2.setBackground(new Color(0,0,160));
    updateT2.setForeground(new Color( 225, 225, 225));
    T2.add(updateT2);

//Select
    selectT2.setBounds(700,579,266,50);
    selectT2.setBackground(new Color(0,160,0));
    selectT2.setForeground(new Color(0, 0, 0, 0));
    T2.add(selectT2);

//Exit
    exitT2.setBounds(175,639,266,50);
    exitT2.setBackground(new Color(160,0,0));
    exitT2.setForeground(new Color(225, 225, 225));
    T2.add(exitT2);
    
//TextArea
    outputT2.setBounds(520,59,600,490);
    outputT2.setBackground(new Color(160,0,0));
    outputT2.setForeground(new Color(225, 225, 225));
    T2.add(outputT2);

    //T3 frame "dependent"

    T3.setLayout(null);
    T3.setBackground(new Color(0,0,0));
    T3.setBounds(170,0,1200,800);
    T3.setVisible(false);


//Social Security number
    DEssn.setBounds(33,59,140,40);
    DEssn.setBackground(new Color(0,0,0));
    DEssn.setForeground(new Color(255,255,0));
    T3.add(DEssn);

    tDEssn.setBounds(175,59,266,40);
    tDEssn.setBackground(new Color(220,225,225));
    tDEssn.setForeground(new Color(0,0,0,0));
    T3.add(tDEssn);

//Dependent name
    dependentName.setBounds(33,109,140,40);
    dependentName.setBackground(new Color(0,0,0));
    dependentName.setForeground(new Color(255,255,0));
    T3.add(dependentName);

    tdependentName.setBounds(175,109,266,40);
    tdependentName.setBackground(new Color(220,225,225));
    tdependentName.setForeground(new Color(0,0,0,0));
    T3.add(tdependentName);

//Gender
    Dsex.setBounds(33,159,140,40);
    Dsex.setBackground(new Color(0, 0, 0));
    Dsex.setForeground(new Color(255,255,0));
    T3.add(Dsex);

    tDsex.setBounds(175,159,266,40);
    tDsex.setBackground(new Color(220,225,225));
    tDsex.setForeground(new Color(0,0,0,0));
    T3.add(tDsex);

//Birth date
    DBdate.setBounds(33,209,140,40);
    DBdate.setBackground(new Color(0, 0, 0));
    DBdate.setForeground(new Color(255,255,0));
    T3.add(DBdate);

    tDBdate.setBounds(175,209,266,40);
    tDBdate.setBackground(new Color(220, 225, 225));
    tDBdate.setForeground(new Color(0, 0, 0, 0));
    T3.add(tDBdate);

//Relationships
    relationship.setBounds(33,259,140,40);
    relationship.setBackground(new Color(0, 0, 0));
    relationship.setForeground(new Color(255, 255, 0));
    T3.add(relationship);

    trelationship.setBounds(175,259,266,40);
    trelationship.setBackground(new Color(220,225,225));
    trelationship.setForeground(new Color(0, 0, 0, 0));
    T3.add(trelationship);
 
    
//Button
//Insert
    insertT3.setBounds(175,519,266,50);
    insertT3.setBackground(new Color(20,0,160));
    insertT3.setForeground(new Color(225, 225, 225));
    T3.add(insertT3);

//Delete
    deleteT3.setBounds(175,579,130,50);
    deleteT3.setBackground(new Color(10,0,160));
    deleteT3.setForeground(new Color(225, 225, 225));
    T3.add(deleteT3);

//Update
    updateT3.setBounds(311,579,130,50);
    updateT3.setBackground(new Color(0,0,160));
    updateT3.setForeground(new Color( 225, 225, 225));
    T3.add(updateT3);

//Select
    selectT3.setBounds(700,579,266,50);
    selectT3.setBackground(new Color(0,160,0));
    selectT3.setForeground(new Color(0, 0, 0, 0));
    T3.add(selectT3);

//Exit
    exitT3.setBounds(175,639,266,50);
    exitT3.setBackground(new Color(160,0,0));
    exitT3.setForeground(new Color(225, 225, 225));
    T3.add(exitT3);
    
//TextArea
    outputT3.setBounds(520,59,600,490);
    outputT3.setBackground(new Color(160,0,0));
    outputT3.setForeground(new Color(225, 225, 225));
    T3.add(outputT3);
    
    //T4 frame "department"

    T4.setLayout(null);
    T4.setBackground(new Color(0,0,0));
    T4.setBounds(170, 0, 1200, 800);
    T4.setVisible(false);

//Name
    Dname.setBounds(33,59,140,40);
    Dname.setBackground(new Color(0,0,0));
    Dname.setForeground(new Color(255,255,0));
    T4.add(Dname);

    tDname.setBounds(175,59,266,40);
    tDname.setBackground(new Color(220,225,225));
    tDname.setForeground(new Color(0,0,0,0));
    T4.add(tDname);

//Dnumber
    Dnumber.setBounds(33,109,140,40);
    Dnumber.setBackground(new Color(0,0,0));
    Dnumber.setForeground(new Color(255,255,0));
    T4.add(Dnumber);

    tDnumber.setBounds(175,109,266,40);
    tDnumber.setBackground(new Color(220,225,225));
    tDnumber.setForeground(new Color(0,0,0,0));
    T4.add(tDnumber);

//Srtart date
    startDate.setBounds(33,159,140,40);
    startDate.setBackground(new Color(0, 0, 0));
    startDate.setForeground(new Color(255,255,0));
    T4.add(startDate);

    tstartDate.setBounds(175,159,266,40);
    tstartDate.setBackground(new Color(220,225,225));
    tstartDate.setForeground(new Color(0,0,0,0));
    T4.add(tstartDate);

//Start date
    Mssn.setBounds(33,209,140,40);
    Mssn.setBackground(new Color(0, 0, 0));
    Mssn.setForeground(new Color(255,255,0));
    T4.add(Mssn);

    tMssn.setBounds(175,209,266,40);
    tMssn.setBackground(new Color(220, 225, 225));
    tMssn.setForeground(new Color(0, 0, 0, 0));
    T4.add(tMssn);

//Button
//Insert
    insertT4.setBounds(175,519,266,50);
    insertT4.setBackground(new Color(20,0,160));
    insertT4.setForeground(new Color(225, 225, 225));
    T4.add(insertT4);

//Delete
    deleteT4.setBounds(175,579,130,50);
    deleteT4.setBackground(new Color(10,0,160));
    deleteT4.setForeground(new Color(225, 225, 225));
    T4.add(deleteT4);

//Update
    updateT4.setBounds(311,579,130,50);
    updateT4.setBackground(new Color(0,0,160));
    updateT4.setForeground(new Color( 225, 225, 225));
    T4.add(updateT4);

//Select
    selectT4.setBounds(700,579,266,50);
    selectT4.setBackground(new Color(0,160,0));
    selectT4.setForeground(new Color(0, 0, 0, 0));
    T4.add(selectT4);

//Exit
    exitT4.setBounds(175,639,266,50);
    exitT4.setBackground(new Color(160,0,0));
    exitT4.setForeground(new Color(225, 225, 225));
    T4.add(exitT4);
    
//TextArea
    outputT4.setBounds(520,59,600,490);
    outputT4.setBackground(new Color(160,0,0));
    outputT4.setForeground(new Color(225, 225, 225));
    T4.add(outputT4);

//T5 frame "depart_Location"     
    
    T5.setLayout(null);
    T5.setBackground(new Color(0,0,0));
    T5.setBounds(170, 0, 1200, 800);
    T5.setVisible(false);

//Department number
    LDnumber.setBounds(33,59,140,40);
    LDnumber.setBackground(new Color(0,0,0));
    LDnumber.setForeground(new Color(255,255,0));
    T5.add(LDnumber);

    tLDnumber.setBounds(175,59,266,40);
    tLDnumber.setBackground(new Color(220,225,225));
    tLDnumber.setForeground(new Color(0,0,0,0));
    T5.add(tLDnumber);

//Department location
    Dlocation.setBounds(33,109,140,40);
    Dlocation.setBackground(new Color(0,0,0));
    Dlocation.setForeground(new Color(255,255,0));
    T5.add(Dlocation);

    tDlocation.setBounds(175,109,266,40);
    tDlocation.setBackground(new Color(220,225,225));
    tDlocation.setForeground(new Color(0,0,0,0));
    T5.add(tDlocation);

//Button
//Insert
    insertT5.setBounds(175,519,266,50);
    insertT5.setBackground(new Color(20,0,160));
    insertT5.setForeground(new Color(225, 225, 225));
    T5.add(insertT5);

//Delete
    deleteT5.setBounds(175,579,130,50);
    deleteT5.setBackground(new Color(10,0,160));
    deleteT5.setForeground(new Color(225, 225, 225));
    T5.add(deleteT5);

//Update
    updateT5.setBounds(311,579,130,50);
    updateT5.setBackground(new Color(0,0,160));
    updateT5.setForeground(new Color( 225, 225, 225));
    T5.add(updateT5);

//Select
    selectT5.setBounds(700,579,266,50);
    selectT5.setBackground(new Color(0,160,0));
    selectT5.setForeground(new Color(0, 0, 0, 0));
    T5.add(selectT5);

//Exit
    exitT5.setBounds(175,639,266,50);
    exitT5.setBackground(new Color(160,0,0));
    exitT5.setForeground(new Color(225, 225, 225));
    T5.add(exitT5);
    
//TextArea
    outputT5.setBounds(520,59,600,490);
    outputT5.setBackground(new Color(160,0,0));
    outputT5.setForeground(new Color(225, 225, 225));
    T5.add(outputT5);
    
    //T6 frame "project"
    
    T6.setLayout(null);
    T6.setBackground(new Color(0,0,0));
    T6.setBounds(170, 0, 1200, 800);
    T6.setVisible(false);


//Name
    Pname.setBounds(33,59,140,40);
    Pname.setBackground(new Color(0,0,0));
    Pname.setForeground(new Color(255,255,0));
    T6.add(Pname);

    tPname.setBounds(175,59,266,40);
    tPname.setBackground(new Color(220,225,225));
    tPname.setForeground(new Color(0,0,0,0));
    T6.add(tPname);

//Number
    Pnumber.setBounds(33,109,140,40);
    Pnumber.setBackground(new Color(0,0,0));
    Pnumber.setForeground(new Color(255,255,0));
    T6.add(Pnumber);

    tPnumber.setBounds(175,109,266,40);
    tPnumber.setBackground(new Color(220,225,225));
    tPnumber.setForeground(new Color(0,0,0,0));
    T6.add(tPnumber);

//Location
    location.setBounds(33,159,140,40);
    location.setBackground(new Color(0, 0, 0));
    location.setForeground(new Color(255,255,0));
    T6.add(location);

    tlocation.setBounds(175,159,266,40);
    tlocation.setBackground(new Color(220,225,225));
    tlocation.setForeground(new Color(0,0,0,0));
    T6.add(tlocation);

//Number
    PDnumber.setBounds(33,209,140,40);
    PDnumber.setBackground(new Color(0, 0, 0));
    PDnumber.setForeground(new Color(255,255,0));
    T6.add(PDnumber);

    tPDnumber.setBounds(175,209,266,40);
    tPDnumber.setBackground(new Color(220, 225, 225));
    tPDnumber.setForeground(new Color(0, 0, 0, 0));
    T6.add(tPDnumber);
    
//Button
//Insert
    insertT6.setBounds(175,519,266,50);
    insertT6.setBackground(new Color(20,0,160));
    insertT6.setForeground(new Color(225, 225, 225));
    T6.add(insertT6);

//Delete
    deleteT6.setBounds(175,579,130,50);
    deleteT6.setBackground(new Color(10,0,160));
    deleteT6.setForeground(new Color(225, 225, 225));
    T6.add(deleteT6);

//Update
    updateT6.setBounds(311,579,130,50);
    updateT6.setBackground(new Color(0,0,160));
    updateT6.setForeground(new Color( 225, 225, 225));
    T6.add(updateT6);

//Select
    selectT6.setBounds(700,579,266,50);
    selectT6.setBackground(new Color(0,160,0));
    selectT6.setForeground(new Color(0, 0, 0, 0));
    T6.add(selectT6);

//Exit
    exitT6.setBounds(175,639,266,50);
    exitT6.setBackground(new Color(160,0,0));
    exitT6.setForeground(new Color(225, 225, 225));
    T6.add(exitT6);
    
//TextArea
    outputT6.setBounds(520,59,600,490);
    outputT6.setBackground(new Color(160,0,0));
    outputT6.setForeground(new Color(225, 225, 225));
    T6.add(outputT6);

    
}
    
    public static void main(String[] args) {
         CompanyDB e = new CompanyDB();
// e.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==sub)
    {
     if(tUName.getText().equals("123"))
     {
        if(tpass.getText().equals("123"))
        {
         
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
    if(e.getSource()==ex)
    {
        System.exit(0);
    }
    
    }
    
}
