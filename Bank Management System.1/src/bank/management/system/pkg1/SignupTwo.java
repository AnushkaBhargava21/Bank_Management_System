package bank.management.system.pkg1;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;



public class SignupTwo extends JFrame implements ActionListener {
    long random;
    
  JButton next;
    JRadioButton eyes, eno;
    JComboBox religion, category, occupation,education;
    String formno;
    
    
    SignupTwo(String formno)
    {
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        
        JLabel additionalDetails = new JLabel("PAGE 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
         JLabel name = new JLabel("Relegion: ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 190, 200, 30);
        add(name);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(400, 190, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
      
      JLabel dob = new JLabel("Category: ");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
      category = new JComboBox(valcategory);
      category.setBounds(400, 240, 400, 30);
      category.setBackground(Color.WHITE);
        add(category);
      
        
        JLabel email = new JLabel("Education: ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);
        
        String educationvalues[] = {"Non-Graduate", "Graduate", "Post-Graduation", "Doctrate", "Others"};
        education = new JComboBox(educationvalues);
        education.setBounds(400, 340, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
       
        
        JLabel Address = new JLabel("Occupation: ");
        Address.setFont(new Font("Raleway", Font.BOLD, 20));
        Address.setBounds(100, 450, 200, 40);
        add(Address);
        
        String occupationvalues[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired"};
        occupation = new JComboBox(occupationvalues);
        occupation.setBounds(400, 450, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
      
      
        
         JLabel gender = new JLabel("Existing Account: ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(400, 290, 60, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        eno = new JRadioButton("No");
                eno.setBounds(550, 290, 120, 30);
                eno.setBackground(Color.WHITE);
                add(eno);
                ButtonGroup egendergroup = new ButtonGroup();
                egendergroup.add(eyes);
                egendergroup.add(eno);
        
       
        
        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));  
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
    getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
  public void actionPerformed(ActionEvent ae){
        String formno = "" , random;
        String sreligion = (String) religion.getSelectedItem();
        
        String scategory = (String) category.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String existingaccount = null;
        
        
        if(eyes.isSelected()){
            existingaccount = "Yes";
        }else if(eno.isSelected())
        {
            existingaccount = "No";
       
        }
       
        
        
       
        
        try{
          Con c = new Con();
           String query = "insert into signuptwoo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+seducation+"', '"+soccupation+"','"+existingaccount+"')";
           c.s.executeUpdate(query);
           
           setVisible(false);
           new SignupThree(formno).setVisible(true);
            
        
        }catch(Exception e) {
        System.out.println(e);
    }
  }
    public static void main(String args[])
    {
        new SignupTwo("");
    }
}


