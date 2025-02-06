package org.example;

import javax.swing.*;
import java.awt.*;

public class Calculator {
   public void initializeGUI() {
       JButton myButton = new JButton();
    JFrame myFrame = new JFrame();
    FlowLayout f1 = new FlowLayout();
    JPanel windowContent = new JPanel(f1);

    // создаем компоненты в ппамяти
   JLabel label1 = new JLabel("Nomer 1 :");
   JTextField field1 = new JTextField(10);
    JLabel label2 = new JLabel("Nomer 2 :");
    JTextField field2 = new JTextField(10);
    JLabel label3 = new JLabel("Summa :");
    JTextField field3 = new JTextField(10);
    JTextField result = new JTextField(10);
    JButton go = new JButton("Add");
    //  добовляем компоненты на панель


    windowContent.add (label1);
    windowContent.add (label2);
    windowContent.add (label3);
    windowContent.add (result);
    windowContent.add (go);

    // создаем фрейм

    JFrame frame = new JFrame("Moy kalkulyator");
    frame.setContentPane (windowContent);

    frame.setSize (400,100);
    frame.setVisible (true);
    }
}
