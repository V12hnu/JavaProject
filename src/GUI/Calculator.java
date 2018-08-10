package GUI;

import First.InterfaceEx;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vishnu on 24/07/18.
 */
public class Calculator implements ActionListener {
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JButton button1;
    JButton button2;

    Calculator(){
        JFrame f=new JFrame("Calculator");
        f.setLayout(null);
        f.setSize(500,500);
        textField1=new JTextField();
        textField2=new JTextField();
        textField3=new JTextField();
        button1=new JButton("+");
        button2=new JButton("-");
        f.add(textField1);
        f.add(textField2);
        f.add(textField3);
        f.add(button1);
        f.add(button2);
        button1.addActionListener(this);
        button2.addActionListener(this);
        textField1.setBounds(50,50,150,50);
        textField2.setBounds(50,100,150,50);
        textField3.setBounds(50,200,150,50);
        button1.setBounds(50,300,50,50);
        button2.setBounds(150,300,50,50);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int a= Integer.parseInt(textField1.getText());
        int b=Integer.parseInt(textField2.getText());
        int c=0;

        if(e.getSource()==button1){
            c=a+b;
            textField3.setText(c+"");
        }
        else
            c=a-b;
        textField3.setText(c+"");


    }
}
