package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {
    JLabel label1 ,label2, label3;
    JTextField textField1;
    JPasswordField passwordField2;
    JButton signup , signin ,clear;
    login(){
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank1.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50,10 , 100 ,100);
        add(image);


        label1 = new JLabel("LOGIN ");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("",Font.BOLD, 38));
        label1.setBounds(350,15 , 500,100);
        add(label1);

        label2 = new JLabel("Card NO :");
        label2.setFont(new Font("",Font.PLAIN,25));
        label2.setForeground(Color.WHITE);
        label2.setBounds(240,130,200,100);
        add(label2);

            textField1 =new JTextField(15);
            textField1.setFont(new Font("",Font.PLAIN,15));
            textField1.setBounds(380,165,200,30);

            add(textField1);

        label3 = new JLabel("PIN NO :");
        label3.setForeground(Color.white);
        label3.setBounds(240,205,200,100);
        label3.setFont(new Font("",Font.PLAIN,25));
        add(label3);

            passwordField2 =new JPasswordField(15);
            passwordField2.setFont(new Font("",Font.PLAIN,15));
            passwordField2.setBounds(380,240,200,30);
            add(passwordField2);

        signin = new JButton("Sign In");
        signin.setBounds(300, 300,100,30);
        signin.setForeground(Color.cyan);
        signin.setBackground(Color.black);
        signin.addActionListener(this);
        signin.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        add(signin);

        clear= new JButton("Clear");
        clear.setBounds(450, 300,100,30);
        clear.setForeground(Color.cyan);
        clear.setBackground(Color.black);
        clear.addActionListener(this);
        clear.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        add(clear);

        signup = new JButton("Sign Up");
        signup.setBounds(300, 350,250,30);
        signup.setForeground(Color.cyan);
        signup.setBackground(Color.black);
        signup.addActionListener(this);
        signup.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        add(signup);




        ImageIcon bg1 = new ImageIcon(ClassLoader.getSystemResource("icon/backgrnd.jpg"));
        Image bg2 = bg1.getImage().getScaledInstance(850 , 480, Image.SCALE_DEFAULT);
        ImageIcon bg3 = new ImageIcon(bg2);
        JLabel bgimage = new JLabel(bg3);
        bgimage.setBounds(0,0,850,480);
            add(bgimage);



        setLayout(null);



        setSize(850, 480);
        setLocation(350,100);
        setVisible(true);

    }
    public static void main(String[] args) {
        new login();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource()==signin) {

            } else if (e.getSource()==clear) {
                textField1.setText("");
                passwordField2.setText("");

            }else if (e.getSource()==signup){
                new signUp();
                setVisible(false);

            }

        }catch (Exception E){
            E.printStackTrace();

        }
    }
}
