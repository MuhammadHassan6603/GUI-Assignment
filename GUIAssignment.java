import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.*;
class GUIAssignment implements ActionListener
{
    List lst,lst1;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    JTextField txt1,txt2;
    JPanel pnl1,pnl2;
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn5)
        {
            String text=txt1.getText(); 
            lst.add(text);
        }
        if(e.getSource()==btn7)
        {
            int index = lst.getSelectedIndex();
            lst.remove(index);        
        }
        if(e.getSource()==btn6)
        {
            String text=txt2.getText(); 
            lst1.add(text);
        }
        if(e.getSource()==btn8)
        {
            int index = lst1.getSelectedIndex();
            lst1.remove(index);        
        }
        if(e.getSource()==btn1)
        {
            String index = lst.getSelectedItem();
            lst.remove(index);
            lst1.add(index);
        }
        if(e.getSource()==btn3)
        {
            String index = lst1.getSelectedItem();
            lst1.remove(index);
            lst.add(index);
        }

    }
    public static void main(String args[])
    {
        GUIAssignment a=new GUIAssignment();
        a.mygui();
    }
    void mygui()
    {
        
        lst = new List();
        lst1=new List();
        lst.add("Red");
        lst.add("Yellow");
        lst.add("Blue");
        lst.add("Green");
        lst1.add("White");
        lst1.add("Blue");
        lst1.add("Pink");
        lst1.add("Brown");
        JFrame frm=new JFrame("List");
        btn1=new JButton(">");
        btn2=new JButton(">>");
        btn3=new JButton("<");
        btn4=new JButton("<<");
        btn5=new JButton("Add");
        btn6=new JButton("Add");
        btn7=new JButton("Clear");
        btn8=new JButton("Clear");
        txt1=new JTextField();
        txt2=new JTextField(); 
        pnl1=new JPanel();
        pnl2=new JPanel();

        pnl1.setBackground(Color.LIGHT_GRAY);
        pnl1.setLayout(new GridLayout(0,1));
        pnl1.setBounds(0,50,200,300);

        pnl2.setBackground(Color.LIGHT_GRAY);
        pnl2.setLayout(new GridLayout(0,1));
        pnl2.setBounds(300,50,200,300);

        btn1.setBounds(225,70,50,30);
        btn2.setBounds(225,120,50,30);
        btn3.setBounds(225,170,50,30);
        btn4.setBounds(225,220,50,30);
        btn5.setBounds(0,430,200,40);
        btn6.setBounds(300,430,200,40);
        btn7.setBounds(0,480,200,40);
        btn8.setBounds(300,480,200,40);

        txt1.setBounds(0,380,200,30);
        txt2.setBounds(300,380,200,30);

        frm.setSize(530,600);
        frm.add(btn1);
        frm.add(btn2);
        frm.add(btn3);
        frm.add(btn4);
        frm.add(btn5);
        frm.add(btn6);
        frm.add(btn7);
        frm.add(btn8);
        frm.add(pnl1);
        frm.add(pnl2);
        frm.add(txt1);
        frm.add(txt2);
        pnl1.add(lst);
        pnl2.add(lst1);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        txt1.addActionListener(this);
        txt2.addActionListener(this);
        frm.setLayout(null);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(3);
    }
}
