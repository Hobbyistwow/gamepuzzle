package com.hobbi.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {
    JButton jbtnutton1 = new JButton("Click)");
    JButton jbtnutton2 = new JButton("Click ME");
    public MyJFrame() {
        super();
        this.setSize(603, 680);
        this.setTitle("puzzle");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);


        jbtnutton1.setBounds(0, 0, 100, 50);
        jbtnutton1.addActionListener(this);


        jbtnutton2.setBounds(100, 0, 100, 50);
        jbtnutton2.addActionListener(this);
        this.getContentPane().add(jbtnutton1);
        this.getContentPane().add(jbtnutton2);
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == jbtnutton1){
            jbtnutton1.setSize(200,200);
        }else if (source == jbtnutton2) {
            Random r = new Random();
            jbtnutton2.setLocation(r.nextInt(500),r.nextInt(500));
        }
    }
}
