package bank.management.system.pkg1;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.util.*;


public class SignupOne extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField, dobTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField;
   
    
    JButton next;
    JRadioButton male, female;
    
    
    SignupOne()
    {
        setLayout(null);
        Random ran = new Random();
        random = (Math.abs((ran.nextLong() % 9000L) + 1000L));
        JLabel formno = new JLabel("APPLICATION  FORM  NO. "   +  random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel personalDetails = new JLabel("PAGE 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
        
         JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 190, 200, 30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(400, 190, 400, 30);
        add(nameTextField);
        
      JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 400, 30);
        add(dob);
        
        dobTextField = new JTextField();
        dobTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        dobTextField.setBounds(400, 240, 400, 30);
        add(dobTextField);
        
      JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        male = new JRadioButton("male");
        male.setBounds(400, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        female = new JRadioButton("female");
                female.setBounds(550, 290, 120, 30);
                female.setBackground(Color.WHITE);
                add(female);
                ButtonGroup gendergroup = new ButtonGroup();
                gendergroup.add(male);
                gendergroup.add(female);

        
        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(400, 340, 400, 30);
        add(emailTextField);
        
       
        
        JLabel Address = new JLabel("Address: ");
        Address.setFont(new Font("Raleway", Font.BOLD, 20));
        Address.setBounds(100, 450, 200, 40);
        add(Address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(400, 450, 400, 30);
        add(addressTextField);
        
      JLabel City = new JLabel("City: ");
        City.setFont(new Font("Raleway", Font.BOLD, 20));
        City.setBounds(100, 510, 200, 40);
        add(City);
        
       cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(400, 510, 400, 30);
        add(cityTextField);
        
      JLabel State = new JLabel("State: ");
        State.setFont(new Font("Raleway", Font.BOLD, 20));
        State.setBounds(100, 570, 200, 40);
        add(State);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(400, 570, 400, 30);
        add(stateTextField);
        
       JLabel Pincode = new JLabel("Pin code: ");
        Pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        Pincode.setBounds(100, 630, 200, 40);
        add(Pincode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pincodeTextField.setBounds(400, 630, 400, 30);
        add(pincodeTextField);
        
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
        String name = nameTextField.getText();
        
        String dob = dobTextField.getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if(female.isSelected())
        {
            gender = "Female";
       
        }
        String email = emailTextField.getText();
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();
        
        try{
            if(name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is Required");
                
            }else{ 
                Con c = new Con();
           String query = "insert into signupp values('"+formno+"', '"+name+"', '"+dob+"', '"+gender+"', '"+email+"','"+address+"', '"+city+"', '"+state+"', '"+pincode+"')";
           c.s.executeUpdate(query);
           setVisible(false);
           new SignupTwo(formno).setVisible(true);
            }
        
        }catch(Exception e) {
        System.out.println(e);
    }
  }
    public static void main(String args[])
    {
        new SignupOne();
    }
}
