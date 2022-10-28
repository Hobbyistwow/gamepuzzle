package com.hobbi.ui;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameJframe extends JFrame {
    int[][] data = new int[4][4];
    public GameJframe() {
//        set width/height
        initJFrame();
        initJMenubar();

        InitData();
        initImage();
        this.setVisible(true);
    }

    private void InitData() {
        int[] tempArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,16};
        Random r = new Random();
        for (int i = 0; i < tempArray.length; i++) {
            int index = r.nextInt(tempArray.length);
            int temp = tempArray[i];
            tempArray[i] = tempArray[index];
            tempArray[index] = temp;
        }

        for (int i = 0; i < tempArray.length; i++) {
            data[i/4][i%4] = tempArray[i];
        }



    }


    private void initImage() {
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                int num = data[a][b];
                JLabel label1 = new JLabel(new ImageIcon("E:\\gamepuzzle\\image\\animal\\animal3\\" + num + ".jpg"));
                label1.setBounds(105 * b, 105 * a, 105, 105);
                this.getContentPane().add(label1);

            }

        }

    }
    private void initJMenubar() {
        JMenuBar JMenuBar = new JMenuBar();
        JMenu functionMenu = new JMenu("function");
        JMenu aboutMenu = new JMenu("about");

        JMenuItem restart = new JMenuItem("restart");
        JMenuItem reLoginItem = new JMenuItem("reLogin");
        JMenuItem closeItem = new JMenuItem("close");

        JMenuItem accountItem = new JMenuItem("account");

//
        functionMenu.add(restart);
        functionMenu.add(reLoginItem);
        functionMenu.add(closeItem);

//
        aboutMenu.add(accountItem);
//
        JMenuBar.add(functionMenu);
        JMenuBar.add(aboutMenu);
//
        this.setJMenuBar(JMenuBar);



    }

    private void initJFrame() {
        this.setSize(603,600);

//       set title
        this.setTitle("puzzle game");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

    }
}
