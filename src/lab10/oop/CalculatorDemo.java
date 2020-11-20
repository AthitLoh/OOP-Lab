/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10.oop;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author User
 */
public class CalculatorDemo {
     public static void main(String[] args) {
        JFrame frame = new JFrame("FrameDemo");
        JLabel welcomeMessage = new JLabel("Welcome!");
            welcomeMessage.setBounds(160, 50, 200, 30);
        JTextField num1 = new JTextField("Enter First Number");
            num1.setBounds(100,100, 200,30);
        JTextField num2 = new JTextField("Enter Second Number");
            num2.setBounds(100,150, 200,30);
        JButton plusButton = new JButton("Plus");
            plusButton.setBounds(30, 200, 80, 45);
        JButton minusButton = new JButton("Minus");
            minusButton.setBounds(110, 200, 80, 45);
        JButton MultiplyButton = new JButton("Multiply");
            MultiplyButton.setBounds(190, 200, 80, 45);
        JButton DivisionButton = new JButton("Division");
            DivisionButton.setBounds(270, 200, 80, 45);
    plusButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //if(num1.getText() && num2.getText()) {
                JDialog dialog = new JDialog(frame, "Pop-up Dialog", false);
                String plus = num1.getText()+ num2.getText();
                JTextField plusMessage = new JTextField(plus);
                dialog.add(plusMessage);
                dialog.pack();
                dialog.setVisible(true);
            //}
        }
    });
    minusButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //if(num1.getText() && num2.getText()) {
                JDialog dialog = new JDialog(frame, "Pop-up Dialog", false);
                JTextField minusMessage = new JTextField();
                dialog.add(minusMessage);
                dialog.pack();
                dialog.setVisible(true);
            //}
        }
    });
    MultiplyButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //if(num1.getText() && num2.getText()) {
                JDialog dialog = new JDialog(frame, "Pop-up Dialog", false);
                JTextField MultiplyMessage = new JTextField();
                dialog.add(MultiplyMessage);
                dialog.pack();
                dialog.setVisible(true);
            //}
        }
    });
    DivisionButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //if(num1.getText() && num2.getText()) {
                JDialog dialog = new JDialog(frame, "Pop-up Dialog", false);
                JTextField DivisionMessage = new JTextField("mook");
                dialog.add(DivisionMessage);
                dialog.pack();
                dialog.setVisible(true);
            //}
        }
    });
    frame.add(welcomeMessage); frame.add(num1); frame.add(num2); 
    frame.add(plusButton); frame.add(minusButton); frame.add(MultiplyButton); frame.add(DivisionButton);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    frame.setLayout(null);
    frame.setVisible(true);
    }
}
