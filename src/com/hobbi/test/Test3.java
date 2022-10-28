package com.hobbi.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setSize(603, 680);
        jframe.setTitle("Test");
        jframe.setAlwaysOnTop(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setLayout(null);


        JButton button = new JButton("Click me to test");
        button.setBounds(0, 0, 100, 50);

        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Click me to test");
            }
        });

        jframe.getContentPane().add(button);

        jframe.setVisible(true);

    }
}
