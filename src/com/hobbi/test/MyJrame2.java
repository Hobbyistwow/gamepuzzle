package com.hobbi.test;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJrame2 extends JFrame implements MouseListener {

        JButton jbtnutton1 = new JButton("Click)");
        JButton jbtnutton2 = new JButton("Click ME");

        public MyJrame2() {
            super();
            this.setSize(603, 680);
            this.setTitle("puzzle");
            this.setAlwaysOnTop(true);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);


            jbtnutton1.setBounds(0, 0, 100, 50);
            jbtnutton1.addMouseListener(this);


            jbtnutton2.setBounds(100, 0, 100, 50);
            jbtnutton2.addMouseListener(this);
            this.getContentPane().add(jbtnutton1);
            this.getContentPane().add(jbtnutton2);
            this.setVisible(true);

        }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouseClicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed");
    }


    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouseExited");
    }
}

