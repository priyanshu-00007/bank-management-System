package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class atm extends JFrame {
    String pin;
    JButton deposit,withdraw,fast, pinCh,stmnt,bal,exit;

    atm(){
        super("Banking Management System");

        this.pin = pin;

        JLabel depo = new JLabel(" Please Select Your Transection");
        depo.setBounds(560,370,300,100);
        depo.setForeground(new Color(21,70,102));
        depo.setFont(new Font("Arial",Font.BOLD,15));
        add(depo);



        deposit = new JButton("Deposit");
        deposit.setBounds(520,460,120,24);
        deposit.setForeground(Color.white);
        deposit.setBackground(new Color(26, 82, 145));
//        deposit.addActionListener(this);
        add(deposit);

        fast = new JButton("Fast cash");
        fast.setBounds(517,490,120,24);
        fast.setForeground(Color.white);
        fast.setBackground(new Color(26, 82, 145));
//        fast.addActionListener(this);
        add(fast);

        pinCh = new JButton("Change pin");
        pinCh.setBounds(514,520,120,24);
        pinCh.setForeground(Color.white);
        pinCh.setBackground(new Color(26, 82, 145));
//        pinCh.addActionListener(this);
        add(pinCh);

        withdraw = new JButton("Cash Withdraw");
        withdraw.setBounds(700,460,120,24);
        withdraw.setForeground(Color.white);
        withdraw.setBackground(new Color(26, 82, 145));
//        deposite.addActionListener(this);
        add(withdraw);

        stmnt = new JButton("Mini Statement");
        stmnt.setBounds(703,490,120,24);
        stmnt.setForeground(Color.white);
        stmnt.setBackground(new Color(26, 82, 145));
//        stmnt.addActionListener(this);
        add(stmnt);

        bal = new JButton("Balance Chack");
        bal.setBounds(706,520,120,24);
        bal.setForeground(Color.white);
        bal.setBackground(new Color(26, 82, 145));
//        bal.addActionListener(this);
        add(bal);

        exit = new JButton("Exit");
        exit.setBounds(965,500,80,60);
        exit.setForeground(Color.red);
        exit.setFont(new Font("Arial",Font.BOLD,20));
        exit.setBorderPainted(false);
        exit.setBackground(new Color(37, 35, 34));
//        exit.addActionListener(this);
        add(exit);



        ImageIcon Image1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank1.png"));
        Image bank1 = Image1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon Image2= new ImageIcon(bank1);
        JLabel Jimg1 = new JLabel(Image2);
        Jimg1.setBounds(80,10,100,100);
        add(Jimg1);



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

    public static void main(String[] args) {
        new atm();
    }
}
