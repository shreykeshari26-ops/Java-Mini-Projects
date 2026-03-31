package BankingManagementSystem;

import javax.swing.*;
import java.awt.*; // for image
import java.awt.event.*;// to perform action and on clicking action is performed


public class Login  extends JFrame implements ActionListener {

    JButton login, Clear, signup;// Globally defining buttons
    JTextField cardTextField;// Globally defining text field (used to add a box to enter data)
    JPasswordField pinTextField; // pin will be entered as password

    Login() {// constructor
        setTitle("Automated Teller Machine");// to give title
        setLayout(null);

        // adding a image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("BankingManagementSystem/icons/logo.jpg"));
        Image i2 =i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel label =new JLabel(i3);
        label.setBounds(70,10,100,100);// to set logo position
        add(label);

        //adding a welcome message
        JLabel text =new JLabel("Welcome to ATM ");// JLabel is used to display text
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400,40); // to set position of text
        add(text);

        //adding Card no
        JLabel cardno =new JLabel("Card No: ");// JLabel is used to display text
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150,30); // to set position of text
        add(cardno);

        //adding a text box for Card no
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(cardTextField);


        //adding pin
        JLabel pin  =new JLabel("PIN: ");// JLabel is used to display text
        pin.setFont(new Font("Raleway", Font.BOLD, 28));//to set font
        pin.setBounds(120, 220, 230,30); // to set position of text
        add(pin);

        //adding a text box for Pin
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        add(pinTextField);

        // adding a button for sign in
        login = new JButton(" SIGN IN");
        login.setBounds(300, 300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);

        login.setOpaque(true);// allows background color to show
        login.setBorderPainted(false);// remove default os styling

        add(login);

        // adding a button for clear
        Clear = new JButton("Clear ");
        Clear.setBounds(430, 300,100,30);
        Clear.setBackground(Color.BLACK);
        Clear.setForeground(Color.WHITE);
        Clear.addActionListener(this);

        Clear.setOpaque(true);// allows background color to show
        Clear.setBorderPainted(false);// remove default os styling

        add(Clear);

        // adding a button for sign in
        signup = new JButton(" SIGN UP");
        signup.setBounds(300, 350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);

        signup.setOpaque(true);// allows background color to show
        signup.setBorderPainted(false);// remove default os styling

        add(signup);




        // to change color of frame
        getContentPane().setBackground(Color.WHITE);


        // to make frame and defining the frame size
        setSize(800, 480); // to make a frame
        setVisible(true);// to show frame
        setLocation(350, 200);// top left origin
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Clear){
            // action perform when this button is clicked
            cardTextField.setText("");
            pinTextField.setText("");

        }
        if(ae.getSource()==login){
            // action perform

        }
        if(ae.getSource()==signup){
            // action perform

        }


    }

    public static void main(String[] args) {
        new Login();// object to call login()
    }
}
