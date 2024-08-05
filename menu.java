import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.lang.Object.*;

public class Menu implements ActionListener {
    private ButtonGroup group = new ButtonGroup();
    private static JRadioButton j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14;
    private static JButton enter;
    private static int sequence;
    private static String content;


    public Menu() {
        j1 = new JRadioButton("Talking");
        j2 = new JRadioButton("Eye Contact");
        j3 = new JRadioButton("Emotion");
        j4 = new JRadioButton("Typing");
        j5 = new JRadioButton("Multiple Choice");
        j6 = new JRadioButton("Slider");
        j7 = new JRadioButton("Video Lessons");
        j8 = new JRadioButton("Reading");
        j9 = new JRadioButton("Teacher instruction");
        j10 = new JRadioButton("Pictures/diagrams");
        j11 = new JRadioButton("Animations of tasks");
        j12 = new JRadioButton("Conversational AI");
        j13 = new JRadioButton("Eye contact maintaining virtual avatar");
        j14 = new JRadioButton("In-person partner finding instruction paired with activity");

        enter = new JButton("Enter");

        group.add(j1);
        group.add(j2);
        group.add(j3);
        group.add(j4);
        group.add(j5);
        group.add(j6);
        group.add(j7);
        group.add(j8);
        group.add(j9);
        group.add(j10);
        group.add(j11);
        group.add(j12);
        group.add(j13);
        group.add(j14);

        enter.addActionListener(this);

        sequence = 0;
        content = "";
    }

    public static void main (String arg[]) {
        
        setUpGUI();

        
    }

    public static void setUpGUI() {
        Menu menu = new Menu();


        JFrame frame = new JFrame("SEAL App GUI");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.setSize(1000, 1000);
        frame.setLayout(null);

        JLabel label1 = new JLabel("Curriculum");
        label1.setSize(100,100);
        label1.setLocation(100, 0);
        frame.add(label1);

        j1.setBounds(250, 0, 120, 50);
        j2.setBounds(400, 0, 120, 50);
        j3.setBounds(550, 0, 120, 50);
        j4.setBounds(700, 0, 120, 50);
        j5.setBounds(825, 0, 120, 50);
        j6.setBounds(250, 50, 120, 50);
        j7.setBounds(400, 50, 120, 50);
        j8.setBounds(550, 50, 120, 50);
        j9.setBounds(675, 50, 120, 50);
        j10.setBounds(825, 50, 120, 50);
        j11.setBounds(250, 100, 120, 50);
        j12.setBounds(400, 100, 120, 50);
        j13.setBounds(550, 100, 120, 50);
        j14.setBounds(675, 100, 120, 50);
        

        frame.add(j1);
        frame.add(j2);
        frame.add(j3);
        frame.add(j4);
        frame.add(j5);
        frame.add(j6);
        frame.add(j7);
        frame.add(j8);
        frame.add(j9);
        frame.add(j10);
        frame.add(j11);
        frame.add(j12);
        frame.add(j13);
        frame.add(j14);

        JLabel label2 = new JLabel("Sequence");
        label2.setSize(100,100);
        label2.setLocation(100, 200);
        frame.add(label2);


        enter.setLocation(800, 700);
        enter.setSize(100,100);

        frame.add(enter);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Test");
    }
    
}