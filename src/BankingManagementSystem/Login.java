package BankingManagementSystem;

import javax.swing.*;
import java.awt.*; // for image


public class Login  extends JFrame {
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
        cardno.setBounds(120, 150, 150,40); // to set position of text
        add(cardno);

        //adding a text box
        JTextField cardTextField = new JTextField();
        cardTextField.setBounds(300,150,250,30);
        add(cardTextField);

        //adding pin
        JLabel pin  =new JLabel("PIN: ");// JLabel is used to display text
        pin.setFont(new Font("Raleway", Font.BOLD, 28));//to set font
        pin.setBounds(120, 220, 400,40); // to set position of text
        add(pin);

        // to change color of frame
        getContentPane().setBackground(Color.WHITE);



        setSize(800, 480); // to make a frame
        setVisible(true);// to show frame
        setLocation(350, 200);// top left origin
    }

    public static void main(String[] args) {
        new Login();// object to call login()
    }
}
