package org.example;
import javax.swing.*;
import java.awt.GridLayout;


public class SimpleCalculatorGrid {
public static void simpl (){
    // создаем панель
    JPanel windowContent = new JPanel();
    // задаем менеджер расположения для этой панели
    GridLayout g1 = new GridLayout(4,2);
    windowContent.setLayout(g1);

    // создаем компоненты в памяти

    JLabel label1 = new JLabel("Nomer 1 :");
    JTextField field1 = new JTextField(10);
    JLabel label2 = new JLabel("Nomer 2 :");
    JTextField field2 = new JTextField(10);
    JLabel label3 = new JLabel("Summa :");
    JTextField field3 = new JTextField(10);
    JTextField result = new JTextField(10);
    JButton go = new JButton("Итог");

    // Добовляем компоненты в панель

    windowContent.add (label1);
    windowContent.add (field1);
    windowContent.add (label2);
    windowContent.add (field2);
    windowContent.add (label3);
    windowContent.add (result);
    windowContent.add (go);

    // создаем фрейм

    JFrame frame = new JFrame("Moy kalkulyator");
    frame.setContentPane (windowContent);

    frame.setSize (600,300);
    frame.setVisible (true);
}
}
