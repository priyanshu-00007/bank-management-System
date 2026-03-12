package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class signup2 extends JFrame implements ActionListener {
    JComboBox  rele,categ,Income,Edu,occu;
    JRadioButton citizeny,citizenn,accy,accn;
    JTextField pan,adhar;
    JButton next;

//    Random ID = new Random();
//    long ID1 = ID.nextLong(900)+100;
//    String id = ""+Math.abs(ID1);
    public String fro;
    public String idno;

    signup2(String id , String formno){
        super("Bank Management System");


        ImageIcon bankIc = new ImageIcon(ClassLoader.getSystemResource("icon/bank1.png"));
        Image bankIc2 = bankIc.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon bankIc3 = new ImageIcon(bankIc2);
        JLabel bank = new JLabel(bankIc3);
        bank.setBounds(50,10 , 100 ,100);
        add(bank);

        ImageIcon form1 = new ImageIcon(ClassLoader.getSystemResource("icon/form.png"));
        Image form2 = form1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon form3 = new ImageIcon(form2);
        JLabel Jform = new JLabel(form3);
        Jform.setBounds(700,550 ,100,100);
        add(Jform);


        JLabel page2= new JLabel("PAGE 2");
        page2.setBounds(350,20,100,100);
        page2.setFont(new Font("raleway", Font.BOLD,25));
        page2.setForeground(Color.black);
        add(page2);

        JLabel form = new JLabel("Application Form No:"+formno);
        form.setBounds(600,10,500,50);
        form.setFont(new Font("arial",Font.BOLD,15));
        add(form);
        JLabel pers = new JLabel("Personal Details:- ");
        pers.setBounds(50,50,300,200);
        pers.setFont(new Font("Raleway",Font.BOLD,20));
        add(pers);

        JLabel ID = new JLabel("Your ID No: "+id);
        ID.setBounds(600,120,500,50);
        ID.setFont(new Font("Raleway",Font.BOLD,15));
        add(ID);

        JLabel religion = new JLabel("Religion");
        religion.setBounds(50,190,500,50);
        religion.setFont(new Font("arial",Font.BOLD,17));
        add(religion);

        String []rel = {"Other","Hindu","muslim","sikkh","chritian"};
        rele = new JComboBox(rel);
        rele.setBounds(250,200,500,30);
        add(rele);

        JLabel Category = new JLabel("Category");
        Category.setBounds(50,240,500,50);
        Category.setFont(new Font("arial",Font.BOLD,17));
        add(Category);

        String []cat = {"Genral","OBC","SC","ST","EWS"};
         categ = new JComboBox(cat);
         categ.setBounds(250,250,500,30);
         add(categ);

        JLabel income = new JLabel("Income");
        income.setBounds(50,290,500,50);
        income.setFont(new Font("arial",Font.BOLD,17));
        add(income);

        String []LInc = {"<10,000","<20,000","<50,000","<1,00,000","5,00,000"};
         Income = new JComboBox(LInc);
        Income.setBounds(250,300,500,30);
        add(Income);

        JLabel eduj = new JLabel("Education");
        eduj.setBounds(50,340,500,50);
        eduj.setFont(new Font("arial",Font.BOLD,17));
        add(eduj);

        String [] Ledu = {"Non-Graduate","Graduate","Post-Graduate","10 above"};
        Edu= new JComboBox(Ledu);
        Edu.setBounds(250,350,500,30);
        add(Edu);

        JLabel Joccu = new JLabel("Occupation");
        Joccu.setBounds(50,390,500,50);
        Joccu.setFont(new Font("arial",Font.BOLD,17));
        add(Joccu);

        String [] Loccu = {"Other","salaried","self-Employmed","Business","Student","Retired"};
        occu= new JComboBox(Loccu);
        occu.setBounds(250,400,500,30);
        add(occu);

        JLabel Jpan = new JLabel("Pan No");
        Jpan.setBounds(50,440,500,50);
        Jpan.setFont(new Font("arial",Font.BOLD,17));
        add(Jpan);

        pan= new JTextField();
        pan.setBounds(250,450,500,30);
        pan.setFont(new Font("arial",Font.BOLD,17));
        add(pan);

        JLabel Jadh = new JLabel("Adhar No");
        Jadh.setBounds(50,490,500,50);
        Jadh.setFont(new Font("arial",Font.BOLD,17));
        add(Jadh);

        adhar= new JTextField();
        adhar.setBounds(250,500,500,30);
        adhar.setFont(new Font("arial",Font.BOLD,17));
        add(adhar);

        JLabel Jcitz = new JLabel("Senior Citizen");
        Jcitz.setBounds(50,550,500,50);
        Jcitz.setFont(new Font("arial",Font.BOLD,17));
        add(Jcitz);

        citizeny = new JRadioButton("YES");
        citizeny.setBounds(300,560,100,30);
        citizeny.setBackground(new Color(52, 229, 235));
        add(citizeny);

        citizenn = new JRadioButton("NO");
        citizenn.setBounds(500,560,100,30);
        citizenn.setBackground(new Color(52, 229, 235));
        add(citizenn);
        ButtonGroup bg = new ButtonGroup();
        bg.add(citizenn);
        bg.add(citizeny);


        JLabel Jacc = new JLabel("Existing ACC");
        Jacc.setBounds(50,595,500,50);
        Jacc.setFont(new Font("arial",Font.BOLD,17));
        add(Jacc);

        accy = new JRadioButton("YES");
        accy.setBounds(300,610,100,30);
        accy.setBackground(new Color(52, 229, 235));
        add(accy);

        accn = new JRadioButton("NO");
        accn.setBounds(500,610,50,30);
        accn.setBackground(new Color(52, 229, 235));
        add(accn);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(accn);
        bg1.add(accy);

        next = new JButton("Next");
        next.setBounds(705,700,100,30);
        next.setFont(new Font("raleway",Font.BOLD,15));
        next.addActionListener(this);
        add(next);

        fro =formno;
        idno=id;
        setLayout(null);
        setSize(850,800);
        setLocation(300,10);
        getContentPane().setBackground(new Color(52, 229, 235));
        setVisible(true);

    }




    @Override
    public void actionPerformed(ActionEvent e) {
        String Form =fro;
        String ID =idno;
        String pan1=pan.getText();
        String adhar1 =adhar.getText();
        String cizen = null;
        String acc = null;
        if(accn.isSelected()){
            acc = "No";
        }else if(accy.isSelected()){
            acc = "Yes";
        }
        if(accn.isSelected()){
            cizen = "No";
        }else if(accy.isSelected()){
            cizen="yes";
        }

        String reli =(String) rele.getSelectedItem();
        String cate = (String) categ.getSelectedItem();
        String inc = (String) Income.getSelectedItem();
        String Educ = (String) Edu.getSelectedItem();
        String occut = (String) occu.getSelectedItem();

        try{
            if(inc.isEmpty()||Educ.isEmpty()||pan1.isEmpty()||adhar1.isEmpty()||occut.isEmpty()){
                JOptionPane.showMessageDialog(null,"Fill All field");
            }
            else if(e.getSource()==next){
                conn connection = new conn();
                String data = "insert into signup2 values('"+ID+"','"+Form+"','"+pan1+"','"+adhar1+"','"+reli+"','"+cate+"','"+inc+"','"+Educ+"','"+occut+"','"+cizen+"','"+acc+"')";
               connection.statement.executeUpdate(data);
               JOptionPane.showMessageDialog(null, "Data Save");
                  new signup3(Form,ID);
                setVisible(false);

            }



        }
        catch (Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {

    }
}
