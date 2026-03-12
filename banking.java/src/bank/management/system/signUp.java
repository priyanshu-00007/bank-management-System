package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signUp extends JFrame implements ActionListener {

    ImageIcon bank;
    Random ran = new Random();
    Long l1 = ran.nextLong(9000)+1000;
    String Formno= " "+ Math.abs(l1);

    Random ID = new Random();
    long ID1 = ID.nextLong(900)+100;
    String id = ""+Math.abs(ID1);

    JTextField textName, Tfathername , dob , Jemail ,addtext, tecity ;
    JRadioButton male, female, other;
    JButton back, next;


    signUp(){
        super("Bank Management System");

        ImageIcon bank = new ImageIcon(ClassLoader.getSystemResource("icon/bank1.png"));
        Image bank2 = bank.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon bank3 = new ImageIcon(bank2);
        JLabel image1 = new JLabel(bank3);
        image1.setBounds(50,10 , 100 ,100);
        add(image1);




        ImageIcon form1 = new ImageIcon(ClassLoader.getSystemResource("icon/form.png"));
        Image form2 = form1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon form3 = new ImageIcon(form2);
        JLabel Jform = new JLabel(form3);
        Jform.setBounds(700,550 ,100,100);
        add(Jform);


        JLabel form = new JLabel("Application Form No:"+Formno);
        form.setBounds(600,10,500,50);
        form.setFont(new Font("arial",Font.BOLD,15));
        add(form);

        JLabel page1 = new JLabel("PAGE 1");
        page1.setFont(new Font("Arial",Font.BOLD,25));
        page1.setBounds(350,30,100,100);
        add(page1);

        JLabel pers = new JLabel("Personal Details:- ");
        pers.setBounds(50,50,300,200);
        pers.setFont(new Font("Raleway",Font.BOLD,20));
        add(pers);

        JLabel ID = new JLabel("Your ID No: "+id);
        ID.setBounds(600,120,500,50);
        ID.setFont(new Font("Raleway",Font.BOLD,15));
        add(ID);

        JLabel name = new JLabel("Name");
        name.setBounds(50,205,100,100);
        name.setFont(new Font("raleway",Font.BOLD,19));
        add(name);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(250,240,400,30);
        add(textName);

        JLabel Fname = new JLabel("Father Name");
        Fname.setFont(new Font("Arial",Font.BOLD,19));
        Fname.setBounds(50,270,200,100);
        add(Fname);

        Tfathername = new JTextField(25);
        Tfathername.setBounds(250,300,400,30);
        Tfathername.setFont(new Font("Arial",Font.BOLD,14));
        add(Tfathername);

        JLabel ddob = new JLabel("D.O.B");
        ddob.setFont(new Font("Arial",Font.BOLD,19));
        ddob.setBounds(50,335,200,100);
        add(ddob);

        dob = new JTextField(25);
        dob.setBounds(250,360,400,30);
        dob.setFont(new Font("Arial",Font.BOLD,15));
        add(dob);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(50,395,200,100);
        gender.setFont(new Font("Arial",Font.BOLD,19));
        add(gender);

        male= new JRadioButton("Male");
        male.setBounds(250,430,100,30);
        male.setFont(new Font("Arial",Font.BOLD,15));
        male.setBackground(new Color(128, 191, 255));
        add(male);

        female= new JRadioButton("Female");
        female.setBounds(400,430,100,30);
        female.setFont(new Font("Arial",Font.BOLD,15));
        female.setBackground(new Color(128, 191, 255));
        add(female);

        other= new JRadioButton("Other");
        other.setBounds(550,430,100,30);
        other.setFont(new Font("Arial",Font.BOLD,15));
        other.setBackground(new Color(128, 191, 255));
        add(other);


        ButtonGroup BG = new ButtonGroup();
        BG.add(male);
        BG.add(female);
        BG.add(other);

        JLabel Email = new JLabel("Email Address");
        Email.setFont(new Font("Arial",Font.BOLD,19));
        Email.setBounds(50,460,200,100);
        add(Email);

        Jemail = new JTextField(25);
        Jemail.setBounds(250,490,400,30);
        Jemail.setFont(new Font("Arial",Font.BOLD,15));
        add(Jemail);

        JLabel add = new JLabel("Address");
        add.setFont(new Font("Arial",Font.BOLD,19));
        add.setBounds(50,530,200,100);
        add(add);

        addtext = new JTextField(25);
        addtext.setBounds(250,550,400,50);
        addtext.setFont(new Font("raleway",Font.BOLD,15));
        add(addtext);

        JLabel city = new JLabel("City");
        city.setFont(new Font("Arial",Font.BOLD,19));
        city.setBounds(50,590,200,100);
        add(city);

        tecity = new JTextField(25);
        tecity.setBounds(250,620,400,30);
        tecity.setFont(new Font("raleway",Font.BOLD,15));
        add(tecity);

        back = new JButton("< Back");
        back.setBackground(new Color(255, 255, 255));
        back.setFont(new Font("raleway",Font.BOLD,15));
        back.addActionListener(this);
        back.setBounds(600,700,100,30);
        add(back);

        next = new JButton("Next >");
        next.setBackground(new Color(255,255,255));
        next.addActionListener(this);
        next.setFont(new Font("raleway",Font.BOLD,15));
        next.setBounds(705,700,100,30);
        add(next);


        getContentPane().setBackground(new Color(128, 191, 255));

        setLayout(null);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String ID = id;
        String formno = Formno;
        String name = textName.getText();
        String fname = Tfathername.getText();
        String dobb = dob.getText();
        String email = Jemail.getText();
        String addr = addtext.getText();
        String city = tecity.getText();
        String gender = null;
                if(male.isSelected()){
                    gender = "male";
                }else if(female.isSelected()){
                    gender ="female";
                }
                else gender="Other";

                try{
                    if(name.isEmpty()||email.isEmpty()||addr.isEmpty()){
                        JOptionPane.showMessageDialog(null,"Fill all field");
                    }
                    else if(e.getSource()==next){
                        conn con1 = new conn();
                        String q = "insert into signup1 values( '"+ID+"','"+formno+"','"+name+"','"+fname+"','"+dobb+"','"+email+"','"+addr+"','"+city+"','"+gender+"')";
                        JOptionPane.showMessageDialog(null, "Data Save");
                        con1.statement.executeUpdate(q);
                        new signup2(id,Formno);
                        setVisible(false);
                    }


                }catch(Exception E){
                    E.printStackTrace();
                }
        if(e.getSource()==back){
            setVisible(false);

            new login();
        }


    }
    public static void main(String[] args) {
        new signUp();
    }


}
