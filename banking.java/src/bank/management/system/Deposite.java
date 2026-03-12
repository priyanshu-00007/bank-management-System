package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposite extends JFrame implements ActionListener {
    String pin;
    JButton deposite,back;
    JTextField amount;


    Deposite(String pin){
        super("Banking Management System");

        this.pin = pin;

        JLabel depo = new JLabel("Enter Amount");
        depo.setBounds(630,350,200,100);
        depo.setFont(new Font("Arial",Font.BOLD,15));
        add(depo);

        amount = new JTextField();
        amount.setBackground(new Color(26, 82, 145));
        amount.setFont(new Font("arial", Font.BOLD,15));
        amount.setForeground(Color.white);
        amount.setBounds(580,420,200,25);
        add(amount);

        ImageIcon Image1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank1.png"));
        Image bank1 = Image1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon Image2= new ImageIcon(bank1);
        JLabel Jimg1 = new JLabel(Image2);
        Jimg1.setBounds(80,10,100,100);
        add(Jimg1);

        deposite = new JButton("Deposit");
        deposite.setBounds(700,515,120,24);
        deposite.setForeground(Color.white);
        deposite.setBackground(new Color(26, 82, 145));
        deposite.addActionListener(this);
        add(deposite);

        back= new JButton("back");
        back.setBounds(700,542,120,24);
        back.setForeground(Color.white);
        back.setBackground(new Color(26, 82, 145));
        back.addActionListener(this);
        add(back);

        ImageIcon bg = new ImageIcon(ClassLoader.getSystemResource("icon/ATM6.jpg"));
        Image ig1 = bg.getImage().getScaledInstance(1250,900, Image.SCALE_DEFAULT);
        ImageIcon ig2 = new ImageIcon(ig1);
        JLabel bg1 = new JLabel(ig2);
        bg1.setBounds(180,-50,1150,900);
        add(bg1);

        setLayout(null);
        setSize(1550,1080);
       getContentPane().setBackground(new Color(225,218,202));
        setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e){
        String Amount = amount.getText();
        String pinno =pin;
        Date date = new Date();
        try {
            if(e.getSource()==deposite){
                if(amount.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter Your Amount");

                } else {
                    conn con = new conn();
                    String q = "Insert into bank values('"+pinno+"','"+date+"','Deposite','"+Amount+"')";
                    JOptionPane.showMessageDialog(null,"your Rs."+Amount +" is successfully Deposit");
                    setVisible(false);
                    new atm();
                    con.statement.executeUpdate(q);
                }


            } else if (e.getSource()==back) {

                setVisible(false);
                new atm();

            }

        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
         new Deposite("");
    }


}
