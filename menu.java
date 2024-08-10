import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.lang.Object.*;

public class Menu implements ActionListener {
    private ButtonGroup group = new ButtonGroup();
    private static JRadioButton j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15;
    private static JButton enter;
    private static int sequence;
    private static String content;
    private static JTextField sequenceText;
    private static JTextField contentText;


    public Menu() {
        //Setting up input options
        j1 = new JRadioButton("Talking");
        j2 = new JRadioButton("Eye Contact");
        j3 = new JRadioButton("Emotion");
        j4 = new JRadioButton("Typing");
        j5 = new JRadioButton("Multiple Choice");
        j6 = new JRadioButton("Slider");
        j7 = new JRadioButton("Pinging host for validating completed activity");

        //Setting up output options
        j8 = new JRadioButton("Video Lessons");
        j9 = new JRadioButton("Reading");
        j10 = new JRadioButton("Teacher instruction");
        j11 = new JRadioButton("Pictures/diagrams");
        j12 = new JRadioButton("Animations of tasks");
        j13 = new JRadioButton("Conversational AI");
        j14 = new JRadioButton("Eye contact maintaining virtual avatar");
        j15 = new JRadioButton("In-person partner finding instruction paired with activity");

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
        group.add(j15);

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
        j4.setBounds(675, 0, 120, 50);
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
        j15.setBounds(825, 100, 120, 50);

        Color color2 = new Color(216, 215, 249);
        
        j1.setBackground(color2);
        j2.setBackground(color2);
        j3.setBackground(color2);
        j4.setBackground(color2);
        j5.setBackground(color2);
        j6.setBackground(color2);
        j7.setBackground(color2);
        j8.setBackground(color2);
        j9.setBackground(color2);
        j10.setBackground(color2);
        j11.setBackground(color2);
        j12.setBackground(color2);
        j13.setBackground(color2);
        j14.setBackground(color2);
        j15.setBackground(color2);


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
        frame.add(j15);

        JLabel label2 = new JLabel("Sequence");
        label2.setSize(100,100);
        label2.setLocation(100, 200);
        frame.add(label2);

        sequenceText = new JTextField();
        sequenceText.setText("");
        sequenceText.setSize(200,100);
        sequenceText.setLocation(250, 200);
        frame.add(sequenceText);

        JLabel label3 = new JLabel("Content");
        label3.setSize(100,100);
        label3.setLocation(100, 400);
        frame.add(label3);

        contentText = new JTextField();
        contentText.setText("");
        contentText.setSize(700,100);
        contentText.setLocation(250, 400);
        frame.add(contentText);


        enter.setLocation(800, 700);
        enter.setSize(100,100);

        frame.add(enter);

        Color color1 = new Color(169, 192, 232);
        frame.getContentPane().setBackground(color1);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int curriculumNum = 0;
        System.out.println("Sequence: " + sequenceText.getText());
        sequence = Integer.parseInt(sequenceText.getText());
        System.out.println("Content: " + contentText.getText());
        content = contentText.getText();

        if (j1.isSelected() == true) {
            System.out.println("Curriculum: " + j1.getText());
            curriculumNum = 11;
        }
        else if (j2.isSelected() == true) {
            System.out.println("Curriculum: " + j2.getText());
            curriculumNum = 12;
        }
        else if (j3.isSelected() == true) {
            System.out.println("Curriculum: " + j3.getText());
            curriculumNum = 13;
        }
        else if (j4.isSelected() == true) {
            System.out.println("Curriculum: " + j4.getText());
            curriculumNum = 14;
        }
        else if (j5.isSelected() == true) {
            System.out.println("Curriculum: " + j5.getText());
            curriculumNum = 15;
        }
        else if (j6.isSelected() == true) {
            System.out.println("Curriculum: " + j6.getText());
            curriculumNum = 16;
        }
        else if (j7.isSelected() == true) {
            System.out.println("Curriculum: " + j7.getText());
            curriculumNum = 17;
        }
        else if (j8.isSelected() == true) {
            System.out.println("Curriculum: " + j8.getText());
            curriculumNum = 21;
        }
        else if (j9.isSelected() == true) {
            System.out.println("Curriculum: " + j9.getText());
            curriculumNum = 22;
        }
        else if (j10.isSelected() == true) {
            System.out.println("Curriculum: " + j10.getText());
            curriculumNum = 23;
        }
        else if (j11.isSelected() == true) {
            System.out.println("Curriculum: " + j11.getText());
            curriculumNum = 24;
        }
        else if (j12.isSelected() == true) {
            System.out.println("Curriculum: " + j12.getText());
            curriculumNum = 25;
        }
        else if (j13.isSelected() == true) {
            System.out.println("Curriculum: " + j13.getText());
            curriculumNum = 26;
        }
        else if (j14.isSelected() == true) {
            System.out.println("Curriculum: " + j14.getText());
            curriculumNum = 27;
        }
        else if (j15.isSelected() == true) {
            System.out.println("Curriculum: " + j15.getText());
            curriculumNum = 27;
        }
        else {
            System.out.println("No Curriculum chosen.");
        }

        String format = "";
        format = curriculumNum + "";

        if (sequence < 10) {
            format = format + "0" + sequence;
        } else {
            format = format + sequence;
        }
        format = format + content;
        System.out.println(format);

        try {
            saveFormatToExportFile(format);
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        
    }

    public void saveFormatToExportFile(String format) throws IOException {
            BufferedWriter writer = new BufferedWriter(new FileWriter("export.txt", true));
            writer.write(format + '\n');
            writer.close();
    }
    
}