package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4 ,c5 ;
    JButton next ,cencel;
    String formno , ID;
    signup3(String Formno, String id){
        super("Banking Management System");
       this.formno = Formno;
        this.ID =id;
        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("icon/bank1.png"));
        Image i1 = image.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon image2 = new ImageIcon(i1);
        JLabel img =  new JLabel(image2);
        img.setBounds(50,10 , 100 ,100);
        add(img);

        ImageIcon form1 = new ImageIcon(ClassLoader.getSystemResource("icon/form.png"));
        Image form2 = form1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon form3 = new ImageIcon(form2);
        JLabel Jform = new JLabel(form3);
        Jform.setBounds(700,550 ,100,100);
        add(Jform);

        JLabel page3= new JLabel("PAGE 3");
        page3.setBounds(350,20,100,100);
        page3.setFont(new Font("raleway", Font.BOLD,25));
        page3.setForeground(Color.black);
        add(page3);

        JLabel form = new JLabel("Application Form No:"+Formno);
        form.setBounds(600,10,500,50);
        form.setFont(new Font("arial",Font.BOLD,15));
        add(form);

        JLabel ID = new JLabel("Your ID No: "+id);
        ID.setBounds(600,120,500,50);
        ID.setFont(new Font("Raleway",Font.BOLD,15));
        add(ID);

        JLabel pers = new JLabel("Personal Details:- ");
        pers.setBounds(50,50,300,200);
        pers.setFont(new Font("Raleway",Font.BOLD,20));
        add(pers);

        JLabel acc = new JLabel("Account Type:-");
        acc.setBounds(50,180,500,50);
        acc.setFont(new Font("arial",Font.BOLD,17));
        add(acc);

        r1 = new JRadioButton("Saving A/c");
        r1.setBounds(50,220,200,50);
        r1.setBackground(new Color(255,255,255));
        add(r1);

        r2 = new JRadioButton("Current A/c");
        r2.setBounds(300,220,200,50);
        r2.setBackground(new Color(255,255,255));
        add(r2);

        r3 = new JRadioButton("Fixed Deposite A/c");
        r3.setBounds(50,260,200,50);
        r3.setBackground(new Color(255,255,255));
        add(r3);
        r4 = new JRadioButton("Rcurring Deposite A/c");
        r4.setBounds(300,260,200,50);
        r4.setBackground(new Color(255,255,255));
        add(r4);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(r1);
        bg1.add(r2);
        bg1.add(r3);
        bg1.add(r4);

        JLabel Lcardno = new JLabel("Card Number:");
        Lcardno.setBounds(50,310,200,50);
        Lcardno.setFont(new Font("arial",Font.BOLD,17));
        add(Lcardno);

        JLabel l2 = new JLabel("[ Your 16-Deigit card no. ]");
        l2.setBounds(50,335,500,50);
        l2.setFont(new Font("arial",Font.PLAIN,12));
        add(l2);

        JLabel cardno  = new JLabel("XXXX-XXXX-XXXX-4248");
        cardno.setBounds(300,310,500,50);
        cardno.setFont(new Font("arial",Font.BOLD,16));
        add(cardno);
        JLabel l5  = new JLabel("(It would apear on ATM card/cheque book and statements)");
        l5.setBounds(300,335,500,50);
        l5.setFont(new Font("arial",Font.BOLD,12));
        add(l5);

        JLabel Lpin = new JLabel("PIN Number:");
        Lpin.setBounds(50,380,200,50);
        Lpin.setFont(new Font("arial",Font.BOLD,17));
        add(Lpin);

        JLabel l6 = new JLabel("[ Your 4-Deigit Pin no. ]");
        l6.setBounds(50,400,500,50);
        l6.setFont(new Font("arial",Font.PLAIN,12));
        add(l6);

        JLabel Pinno  = new JLabel("XXXX");
        Pinno.setBounds(300,380,500,50);
        Pinno.setFont(new Font("arial",Font.BOLD,16));
        add(Pinno);
        JLabel l7  = new JLabel("(It would apear on ATM card/cheque book and statements)");
        l7.setBounds(300,400,500,50);
        l7.setFont(new Font("arial",Font.BOLD,12));
        add(l7);

        JLabel Lser = new JLabel("Services Required:");
        Lser.setBounds(50,450,200,50);
        Lser.setFont(new Font("arial",Font.BOLD,17));
        add(Lser);

        c1 = new JCheckBox("ATM Card");
        c1.setBounds(50,500,200,50);
        c1.setBackground(new Color(255,255,255));
        add(c1);

        c2 = new JCheckBox("Mobile Banking");
        c2.setBounds(300,500,200,50);
        c2.setBackground(new Color(255,255,255));
        add(c2);

        c3 = new JCheckBox("Internet Banking ");
        c3.setBounds(50,550,200,50);
        c3.setBackground(new Color(255,255,255));
        add(c3);
        c4 = new JCheckBox("Email Alert");
        c4.setBounds(300,550,200,50);
        c4.setBackground(new Color(255,255,255));
        add(c4);

        c5 = new JCheckBox("I hereby declare that the information provided above is true and correct to the best of my knowledge !!");
        c5.setBounds(50,600,600,50);
        c5.setBackground(new Color(255,255,255));
        add(c5);

        next = new JButton("Submit");
        next.setBounds(250,700,100,30);
        next.setFont(new Font("raleway",Font.BOLD,15));
        next.addActionListener(this);

        add(next);
        cencel = new JButton("cencel");
        cencel.setBounds(400,700,100,30);
        cencel.setFont(new Font("raleway",Font.BOLD,15));
        cencel.addActionListener(this);

        add(cencel);

        setLayout(null);
        setSize(850,800);
        setLocation(300,10);
        getContentPane().setBackground(new Color(255,255,255));
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String Fno = formno;
        String id = ID;
        String acctype = null;
        if(r1.isSelected()){
            acctype = "Saving A/c";
        } else if (r2.isSelected()) {
            acctype ="current A/c";
        }else if (r3.isSelected()){
            acctype ="Fixed Deposit A/c";
        }else if (r4.isSelected()){
            acctype ="Recurring Deposit A/c";
        }

        Random rn1 = new Random();
        long rndom = rn1.nextLong(900000000L)+100000000;
        long rl1 = 6315631200000000L +rndom;
        String cardno = " "+Math.abs(rl1);

        long rl3 = rn1.nextLong(9000)+1000;
        String pinno = " "+Math.abs(rl3);

        String service = "";
        if(c1.isSelected()){
            service = service+"ATM Card";
        }
        if(c2.isSelected()){
            service = service+"Mobile Banking";
        }
        if(c3.isSelected()){
            service = service+" Internet Banking";
        }
        if(c4.isSelected()){
            service = service+" Email Alert ";
        }



        try{
            if(e.getSource()==cencel){
                setVisible(false);
            }

            if(service.isEmpty()||acctype.isEmpty()){
                JOptionPane.showMessageDialog(null,"Fill all Field");
            } else if (e.getSource() == next){
                conn conne = new conn();
                String data1 = "Insert into Acc_detail values('"+id+"', '"+Fno+"','"+cardno+"','"+pinno+"','"+acctype+"','"+service+"')";
                String data2 = "Insert into login_detail values('"+Fno+"','"+cardno+"','"+pinno+"')";
                conne.statement.executeUpdate(data1);
                conne.statement.executeUpdate(data2);
                JOptionPane.showMessageDialog(null, "Card no:-"+cardno+"\n" +"pin no :-"+pinno+ "\n your data is save");
                new Deposite(pinno);

                setVisible(false);

            }



        }catch(Exception E){
            E.printStackTrace();
        }

    }
    public static void main(String[] args) {
         new signup3("","");


    }


}
