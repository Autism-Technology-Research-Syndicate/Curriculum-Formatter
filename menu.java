import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.*;

public class menu {
    private ButtonGroup group = new ButtonGroup();
    private static JRadioButton j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15;
    private static JButton enter;
    private static JButton nextPage;
    private static int sequence;
    private static String content;
    private static JTextField sequenceText;
    private static JTextField contentText;
    private static int seqNum;

    private static JTextField option1Text;
    private static JTextField option2Text;
    private static JTextField option3Text;
    private static JTextField option4Text;

    private static String options;

    private static JLabel messageText;

    private static int pageState;

    private static JLabel label1;
    private static JLabel label2;
    private static JLabel label3;

    private static JLabel logo;

    private static JTextArea preview;
    private static JScrollPane scrollPane;

    private static int limit;

    private static JLabel background;

    private static JButton settings;
    private static JButton save;


    public menu() {
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

        //Setting up Enter and Next Page button.
        enter = new JButton("Enter");
        nextPage = new JButton("View Content");
        settings = new JButton("Settings");
        save = new JButton("Save");

        preview = new JTextArea("", 100, 100);
        scrollPane = new JScrollPane(preview);


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

        enter.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int curriculumNum = 0;
                System.out.println("Sequence: " + sequenceText.getText());
        
                if (sequenceText.getText().equals("")) {
                    sequence = seqNum + 1;
                    seqNum = seqNum + 1;
                    try {
                        saveSeqNum();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
        
                } else {
                    if (Integer.parseInt(sequenceText.getText()) > 99) {
        
                        messageText.setText("Sequence can't be more than 99");
            
                        group.clearSelection();
                        sequenceText.setText("");
                        contentText.setText("");
                        option1Text.setText("");
                        option2Text.setText("");
                        option3Text.setText("");
                        option4Text.setText("");
                    } else {
                        sequence = Integer.parseInt(sequenceText.getText());
                        try {
                            insertSequence(seqNum, sequence);
                        } catch (FileNotFoundException e1) {
                            e1.printStackTrace();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                        seqNum = sequence;
                        try {
                            saveSeqNum();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
                    
            
                    
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
            
                    if (j5.isSelected()) {
                        options = "a)" + option1Text.getText() + "b)" + option2Text.getText() + 
                        "c)" + option3Text.getText() + "d)" + option4Text.getText();
                        format = format + options;
                        format = format + content;
                    } else {
                        format = format + content;
                    }
                    
                    System.out.println(format);
            
                    try {
                        saveFormatToExportFile(format);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
            
                    group.clearSelection();
                    sequenceText.setText("");
                    contentText.setText("");
                    option1Text.setText("");
                    option2Text.setText("");
                    option3Text.setText("");
                    option4Text.setText("");
                }
            }
            
        });
        nextPage.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (pageState == 0) {
                    nextPage.setText("Home");

                    j1.setVisible(false);
                    j1.setEnabled(false);

                    j2.setVisible(false);
                    j2.setEnabled(false);

                    j3.setVisible(false);
                    j3.setEnabled(false);

                    j4.setVisible(false);
                    j4.setEnabled(false);

                    j5.setVisible(false);
                    j5.setEnabled(false);

                    j6.setVisible(false);
                    j6.setEnabled(false);

                    j7.setVisible(false);
                    j7.setEnabled(false);

                    j8.setVisible(false);
                    j8.setEnabled(false);

                    j9.setVisible(false);
                    j9.setEnabled(false);

                    j10.setVisible(false);
                    j10.setEnabled(false);

                    j11.setVisible(false);
                    j11.setEnabled(false);

                    j12.setVisible(false);
                    j12.setEnabled(false);

                    j13.setVisible(false);
                    j13.setEnabled(false);

                    j14.setVisible(false);
                    j14.setEnabled(false);

                    j15.setVisible(false);
                    j15.setEnabled(false);

                    option1Text.setVisible(false);
                    option1Text.setEnabled(false);
                    option2Text.setVisible(false);
                    option2Text.setEnabled(false);
                    option3Text.setVisible(false);
                    option3Text.setEnabled(false);
                    option4Text.setVisible(false);
                    option4Text.setEnabled(false);

                    sequenceText.setVisible(false);
                    sequenceText.setEnabled(false);

                    contentText.setVisible(false);
                    contentText.setEnabled(false);

                    label1.setVisible(false);
                    label2.setVisible(false);
                    label3.setVisible(false);

                    enter.setVisible(false);
                    enter.setEnabled(false);

                    save.setVisible(false);
                    save.setEnabled(false);

                    logo.setVisible(false);

                    scrollPane.setVisible(true);
                    scrollPane.setEnabled(true);
                    scrollPane.getParent().setComponentZOrder(scrollPane, 0);

                    File file = new File("export.txt");
                    try (Scanner reader = new Scanner(file)) {
                        ArrayList<String> exportList = new ArrayList<>();
                        while(reader.hasNextLine()) {
                            exportList.add(reader.nextLine());
                        }

                        reader.close();

                        System.out.println(exportList.toString());

                        ArrayList<Integer> newIndexOrder = new ArrayList<>();
                        ArrayList<String> newListOrder = new ArrayList<>();

                        for (int x = 0; x < exportList.size(); x++) {
                            newIndexOrder.add(Integer.parseInt(exportList.get(x).substring(2, 4)));
                        }

                        Collections.sort(newIndexOrder);

                        for (int y = 0; y < newIndexOrder.size(); y++) {
                            int num = newIndexOrder.get(y);
                            for (int z = 0; z < exportList.size(); z++) {
                                int exSeq = Integer.parseInt(exportList.get(z).substring(2,4));

                                if (exSeq == num) {
                                    newListOrder.add(exportList.get(z));
                                    break;
                                }

                            }
                        }
                        System.out.println(newListOrder.toString());

                        for (int n = 0; n < newListOrder.size(); n++) {
                            readFormat(newListOrder.get(n));
                        }



                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    }

                    pageState++;
                } else if (pageState == 1) {
                    nextPage.setText("View Content");

                    j1.setVisible(true);
                    j1.setEnabled(true);

                    j2.setVisible(true);
                    j2.setEnabled(true);

                    j3.setVisible(true);
                    j3.setEnabled(true);

                    j4.setVisible(true);
                    j4.setEnabled(true);

                    j5.setVisible(true);
                    j5.setEnabled(true);

                    j6.setVisible(true);
                    j6.setEnabled(true);

                    j7.setVisible(true);
                    j7.setEnabled(true);

                    j8.setVisible(true);
                    j8.setEnabled(true);

                    j9.setVisible(true);
                    j9.setEnabled(true);

                    j10.setVisible(true);
                    j10.setEnabled(true);

                    j11.setVisible(true);
                    j11.setEnabled(true);

                    j12.setVisible(true);
                    j12.setEnabled(true);

                    j13.setVisible(true);
                    j13.setEnabled(true);

                    j14.setVisible(true);
                    j14.setEnabled(true);

                    j15.setVisible(true);
                    j15.setEnabled(true);

                    sequenceText.setVisible(true);
                    sequenceText.setEnabled(true);

                    contentText.setVisible(true);
                    contentText.setEnabled(true);

                    label1.setVisible(true);
                    label2.setVisible(true);
                    label3.setVisible(true);

                    enter.setVisible(true);
                    enter.setEnabled(true);

                    save.setVisible(false);
                    save.setEnabled(false);

                    logo.setVisible(true);

                    scrollPane.setVisible(false);
                    scrollPane.setEnabled(false);

                    preview.setText("");
                    
                    pageState--;
                }
                else {
                    nextPage.setText("View Content");

                    j1.setVisible(true);
                    j1.setEnabled(true);

                    j2.setVisible(true);
                    j2.setEnabled(true);

                    j3.setVisible(true);
                    j3.setEnabled(true);

                    j4.setVisible(true);
                    j4.setEnabled(true);

                    j5.setVisible(true);
                    j5.setEnabled(true);

                    j6.setVisible(true);
                    j6.setEnabled(true);

                    j7.setVisible(true);
                    j7.setEnabled(true);

                    j8.setVisible(true);
                    j8.setEnabled(true);

                    j9.setVisible(true);
                    j9.setEnabled(true);

                    j10.setVisible(true);
                    j10.setEnabled(true);

                    j11.setVisible(true);
                    j11.setEnabled(true);

                    j12.setVisible(true);
                    j12.setEnabled(true);

                    j13.setVisible(true);
                    j13.setEnabled(true);

                    j14.setVisible(true);
                    j14.setEnabled(true);

                    j15.setVisible(true);
                    j15.setEnabled(true);

                    sequenceText.setVisible(true);
                    sequenceText.setEnabled(true);

                    contentText.setVisible(true);
                    contentText.setEnabled(true);

                    label1.setVisible(true);
                    label2.setVisible(true);
                    label3.setVisible(true);

                    enter.setVisible(true);
                    enter.setEnabled(true);

                    logo.setVisible(true);

                    scrollPane.setVisible(false);
                    scrollPane.setEnabled(false);

                    preview.setText("");
                    
                    pageState = 0;
                    
                }

            }
            
        });

        settings.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Settings clicked");
                pageState = 2;

                nextPage.setText("Home");

                j1.setVisible(false);
                j1.setEnabled(false);

                j2.setVisible(false);
                j2.setEnabled(false);

                j3.setVisible(false);
                j3.setEnabled(false);

                j4.setVisible(false);
                j4.setEnabled(false);

                j5.setVisible(false);
                j5.setEnabled(false);

                j6.setVisible(false);
                j6.setEnabled(false);

                j7.setVisible(false);
                j7.setEnabled(false);

                j8.setVisible(false);
                j8.setEnabled(false);

                j9.setVisible(false);
                j9.setEnabled(false);

                j10.setVisible(false);
                j10.setEnabled(false);

                j11.setVisible(false);
                j11.setEnabled(false);

                j12.setVisible(false);
                j12.setEnabled(false);

                j13.setVisible(false);
                j13.setEnabled(false);

                j14.setVisible(false);
                j14.setEnabled(false);

                j15.setVisible(false);
                j15.setEnabled(false);

                option1Text.setVisible(false);
                option1Text.setEnabled(false);
                option2Text.setVisible(false);
                option2Text.setEnabled(false);
                option3Text.setVisible(false);
                option3Text.setEnabled(false);
                option4Text.setVisible(false);
                option4Text.setEnabled(false);

                sequenceText.setVisible(false);
                sequenceText.setEnabled(false);

                contentText.setVisible(false);
                contentText.setEnabled(false);

                label1.setVisible(false);
                label2.setVisible(false);
                label3.setVisible(false);

                logo.setVisible(false);

                enter.setVisible(false);
                enter.setEnabled(false);

                save.setVisible(true);
                save.setEnabled(true);

                scrollPane.setVisible(true);
                scrollPane.setEnabled(true);
                scrollPane.getParent().setComponentZOrder(scrollPane, 0);

                preview.setText("");

                File file = new File("controlSettings.txt");
                    try (Scanner reader = new Scanner(file)) {
                        ArrayList<String> controlList = new ArrayList<>();
                        while(reader.hasNextLine()) {
                            controlList.add(reader.nextLine());
                        }

                        reader.close();

                        System.out.println(controlList.toString());

                        for (int x = 0; x < controlList.size(); x++) {
                            preview.append(controlList.get(x) + "\n");
                        }

                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    }
            }

        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Save settings");
                try (BufferedWriter writer3 = new BufferedWriter(new FileWriter("controlSettings.txt", false))) {
                    try {
                        writer3.write(preview.getText());
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    writer3.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        sequence = 0;
        content = "";
        pageState = 0;
        limit = 50;
    }

    public static void main (String arg[]) throws IOException {

        File seqNumFile = new File("seqNumber.txt");
        Scanner reader = new Scanner(seqNumFile);
        int data = reader.nextInt();
        //System.out.println(data);
        seqNum = data;
        reader.close();
        setUpGUI();

    }

    /**
     * This method sets up the GUI which creates and stores the content, sequence, and option
     * number into the export.txt file in the appropriate format.
     * @throws IOException
     */
    public static void setUpGUI() throws IOException {
        menu menu = new menu();


        JFrame frame = new JFrame("SEAL App GUI");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                try {
                    deleteDuplicates();
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.setSize(1000, 1000);
        frame.setLayout(null);

        label1 = new JLabel("Curriculum");
        label1.setSize(110,100);
        label1.setLocation(100, 50);
        label1.setFont(new Font("Helvetica Neue", Font.BOLD,20));;
        frame.add(label1);

        j1.setBounds(0, 150, 120, 50);
        j2.setBounds(125, 150, 120, 50);
        j3.setBounds(250, 150, 120, 50);

        j4.setBounds(0, 200, 120, 50);
        j5.setBounds(125, 200, 120, 50);
        j6.setBounds(250, 200, 120, 50);

        j7.setBounds(0, 250, 120, 50);
        j8.setBounds(125, 250, 120, 50);
        j9.setBounds(250, 250, 120, 50);

        j10.setBounds(0, 300, 120, 50);
        j11.setBounds(125, 300, 120, 50);
        j12.setBounds(250, 300, 120, 50);

        j13.setBounds(0, 350, 120, 50);
        j14.setBounds(125, 350, 120, 50);
        j15.setBounds(250, 350, 120, 50);

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

        j1.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        j2.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        j3.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        j4.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        j5.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        j6.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        j7.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        j8.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        j9.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        j10.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        j11.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        j12.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        j13.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        j14.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        j15.setFont(new Font("Helvetica Neue", Font.BOLD,15));


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

        label2 = new JLabel("Sequence");
        label2.setSize(100,100);
        label2.setLocation(400, 0);
        label2.setFont(new Font("Helvetica Neue", Font.BOLD,20));
        frame.add(label2);

        sequenceText = new JTextField();
        sequenceText.setText("");
        sequenceText.setSize(100,50);
        sequenceText.setLocation(500, 25);
        sequenceText.setFont(new Font("Helvetica Neue", Font.BOLD,20));
        frame.add(sequenceText);

        messageText = new JLabel("");
        messageText.setSize(400,100);
        messageText.setLocation(650, 0);
        messageText.setFont(new Font("Helvetica Neue", Font.BOLD,20));
        frame.add(messageText);

        label3 = new JLabel("Content");
        label3.setSize(100,100);
        label3.setLocation(400, 100);
        label3.setFont(new Font("Helvetica Neue", Font.BOLD,20));
        frame.add(label3);

        contentText = new JTextField();
        contentText.setText("");
        contentText.setSize(550,100);
        contentText.setLocation(400, 200);
        contentText.setFont(new Font("Helvetica Neue", Font.BOLD,20));
        frame.add(contentText);

        option1Text = new JTextField();
        option1Text.setText("");
        option1Text.setSize(150,50);
        option1Text.setLocation(400, 400);
        option1Text.setBackground(new Color(56, 163, 165));
        option1Text.setEnabled(false);
        option1Text.setVisible(false);
        option1Text.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        frame.add(option1Text);

        option2Text = new JTextField();
        option2Text.setText("");
        option2Text.setSize(150,50);
        option2Text.setLocation(550, 400);
        option2Text.setEnabled(false);
        option2Text.setVisible(false);
        option2Text.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        frame.add(option2Text);

        option3Text = new JTextField();
        option3Text.setText("");
        option3Text.setSize(150,50);
        option3Text.setLocation(700, 400);
        option3Text.setEnabled(false);
        option3Text.setVisible(false);
        option3Text.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        frame.add(option3Text);

        option4Text = new JTextField();
        option4Text.setText("");
        option4Text.setSize(150,50);
        option4Text.setLocation(850, 400);
        option4Text.setEnabled(false);
        option4Text.setVisible(false);
        option4Text.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        frame.add(option4Text);

        JLabel question = new JLabel("Choices");
        question.setSize(100,100);
        question.setLocation(400, 300);
        question.setVisible(false);
        question.setFont(new Font("Helvetica Neue", Font.BOLD,20));
        frame.add(question);

        ImageIcon image = new ImageIcon("a7366912e4f34cb285e0c659c64be370.png");
        logo = new JLabel();
        logo.setIcon(new ImageIcon(image.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        logo.setLocation(0, 0);
        logo.setSize(50, 50);
        logo.setVisible(true);
        frame.add(logo);

        Color color3 = new Color(76, 111, 159);
        enter.setBackground(color3);
        enter.setFont(new Font("Helvetica Neue", Font.BOLD,25));
        enter.setBounds(800, 700, 100, 100);
        enter.setBorder(new RoundButton(15));

        nextPage.setBackground(color3);
        nextPage.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        nextPage.setBounds(100, 700, 150, 100);
        nextPage.setBorder(new RoundButton(15));

        settings.setBackground(color3);
        settings.setFont(new Font("Helvetica Neue", Font.BOLD,15));
        settings.setBounds(450, 700, 100, 100);
        settings.setBorder(new RoundButton(15));

        save.setBackground(color3);
        save.setFont(new Font("Helvetica Neue", Font.BOLD,25));
        save.setBounds(800, 700, 100, 100);
        save.setBorder(new RoundButton(15));

        frame.add(enter);
        frame.add(nextPage);
        frame.add(settings);
        frame.add(save);

        background = new JLabel(new ImageIcon("gradient.png"));
        background.setLocation(0, 0);
        background.setSize(1000, 1000);
        background.setVisible(true);
        frame.add(background);

        Color color1 = new Color(0, 0, 0,0);
        frame.getContentPane().setBackground(color1);

        scrollPane.setSize(925, 500);
        scrollPane.setLocation(25,0);
        scrollPane.setVisible(false);
        scrollPane.setEnabled(false);

        frame.add(scrollPane);

        while (frame.isActive()) {
            if (j5.isSelected() && pageState == 0) {
                contentText.setLocation(400, 200);

                option1Text.setEnabled(true);
                option1Text.setVisible(true);

                option2Text.setEnabled(true);
                option2Text.setVisible(true);

                option3Text.setEnabled(true);
                option3Text.setVisible(true);

                option4Text.setEnabled(true);
                option4Text.setVisible(true);

                question.setVisible(true);
                label3.setText("Question");

            } else if (j5.isSelected() && pageState == 1) {
                option1Text.setEnabled(false);
                option1Text.setVisible(false);

                option2Text.setEnabled(false);
                option2Text.setVisible(false);

                option3Text.setEnabled(false);
                option3Text.setVisible(false);

                option4Text.setEnabled(false);
                option4Text.setVisible(false);

                question.setVisible(false);
            }
            else {
                label3.setText("Content");
                contentText.setLocation(400, 200);

                option1Text.setEnabled(false);
                option1Text.setVisible(false);

                option2Text.setEnabled(false);
                option2Text.setVisible(false);

                option3Text.setEnabled(false);
                option3Text.setVisible(false);

                option4Text.setEnabled(false);
                option4Text.setVisible(false);

                question.setVisible(false);
            }
        }
        
        deleteDuplicates();
    }


    /**
     * This method saves the given format into the export.txt at the bottom of the file.
     * @param format - The format created by the GUI.
     * @throws IOException
     */
    public void saveFormatToExportFile(String format) throws IOException {
            BufferedWriter writer = new BufferedWriter(new FileWriter("export.txt", true));
            writer.write(format + '\n');
            writer.close();
    }

    /**
     * This method saves the recent sequence number into the seqNumber.txt.
     * @throws IOException
     */
    public void saveSeqNum() throws IOException {
        System.out.println(seqNum);
        PrintWriter printWriter = new PrintWriter("seqNumber.txt");
        String newEntry = Integer.toString(seqNum);
        printWriter.write(newEntry);
        printWriter.close();
    }

    /**
     * This method deletes any duplicates found in the export.txt if they have the same sequence
     * number and stores the content of the duplicates in the error.txt file.
     * @throws IOException
     */
    public static void deleteDuplicates() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("export.txt"));     
        if (br.readLine() == null) {
            System.out.println("No errors, and file empty");
            br.close();
        } else {
            br.close();
            File file = new File("export.txt");
            Scanner reader = new Scanner(file);
            ArrayList<String> list = new ArrayList<>();
            ArrayList<String> duplicates = new ArrayList<>();

            while (reader.hasNextLine()) {
                list.add(reader.nextLine());
            }
            reader.close();

            System.out.println(list.size());

            for (int n = 0; n < list.size(); n++) {
                if (list.get(n).equals("000")) {
                    list.remove(n);
                    n--;
                }
            }

            for (int x = 0; x < list.size(); x++) {
                int count = 0;
                for (int y = 0; y < list.size(); y++) {
                    if (list.get(y).substring(2, 4).equals(list.get(x).subSequence(2, 4))) {
                        count++;
                    }
                    if (count > 1) {
                        duplicates.add(list.get(y));
                        list.remove(y);
                        y--;
                        count--;
                    }
                }
            }

            System.out.println(list.toString());
            System.out.println(duplicates.toString());

            BufferedWriter writer = new BufferedWriter(new FileWriter("error.txt", true));
            for (int x = 0; x < duplicates.size(); x++) {
                writer.write(duplicates.get(x).substring(4) + '\n');
            }
            writer.close();

            BufferedWriter writer2 = new BufferedWriter(new FileWriter("export.txt", false));
            for (int x = 0; x < list.size(); x++) {
                writer2.write(list.get(x) + '\n');
            }
            writer2.close();
       
        }
    }

    /**
     * This method moves the sequence of the existing formats up by 1 if the newest sequence
     * is greater than the number found in the seqNumber.txt file.
     * @param oldNum
     * @param newNum
     * @throws IOException
     */
    public void insertSequence(int oldNum, int newNum) throws IOException {
        System.out.println("Testing");
        System.out.println("Old num: " + oldNum);
        System.out.println("New num: " + newNum);

        File file = new File("export.txt");
        Scanner reader = new Scanner(file);
        ArrayList<String> entries = new ArrayList<>();

        while (reader.hasNextLine()) {
            entries.add(reader.nextLine());
        }

        reader.close();

        System.out.println(entries.toString());

        if (newNum < oldNum) {
            for (int x = 0; x < entries.size(); x++) {
                String entry = entries.get(x);
                String newEntry = "";
                int result = 0;

                result = Integer.parseInt((String) entry.subSequence(2, 4)) + 1;

                if (result < 10) {
                    newEntry = entry.substring(0,2) + "0" + result + entry.substring(4);
                } else {
                    newEntry = entry.substring(0,2) + result + entry.substring(4);
                }

                entries.set(x, newEntry);
            }
        }

        System.out.println(entries.toString());

        BufferedWriter writer3 = new BufferedWriter(new FileWriter("export.txt", false));
            for (int x = 0; x < entries.size(); x++) {
                writer3.write(entries.get(x) + '\n');
            }
        writer3.close();
    }

    /**
     * This method takes the given String format and translates it into human terms.
     * @param format
     */
    public void readFormat(String format) {
        int curriculum = Integer.parseInt(format.substring(0, 2));
        int seq = Integer.parseInt(format.substring(2, 4));

        if (curriculum == 11) {
            preview.append("Curriculum: Talking\n");
            preview.append("Type: Input\n");
        } else if (curriculum == 12) {
            preview.append("Curriculum: Eye Contact\n");
            preview.append("Type: Input\n");
        } else if (curriculum == 13) {
            preview.append("Curriculum: Emotion\n");
            preview.append("Type: Input\n");
        } else if (curriculum == 14) {
            preview.append("Curriculum: Typing\n");
            preview.append("Type: Input\n");
        } else if (curriculum == 15) {
            preview.append("Curriculum: Multiple choice\n");
            preview.append("Type: Input\n");
        } else if (curriculum == 16) {
            preview.append("Curriculum: Slider\n");
            preview.append("Type: Input\n");
        } else if (curriculum == 17) {
            preview.append("Curriculum: Ping for host for validating completed activity\n");
            preview.append("Type: Input\n");
        } else if (curriculum == 21) {
            preview.append("Curriculum: Video Lessons\n");
            preview.append("Type: Output\n");
        } else if (curriculum == 22) {
            preview.append("Curriculum: Reading\n");
            preview.append("Type: Output\n");
        } else if (curriculum == 23) {
            preview.append("Curriculum: Teacher instruction\n");
            preview.append("Type: Output\n");
        } else if (curriculum == 24) {
            preview.append("Curriculum: Pictures/diagrams\n");
            preview.append("Type: Output\n");
        } else if (curriculum == 25) {
            preview.append("Curriculum: Animations of tasks\n");
            preview.append("Type: Output\n");
        } else if (curriculum == 26) {
            preview.append("Curriculum: Conversational AI\n");
            preview.append("Type: Output\n");
        } else if (curriculum == 27) {
            preview.append("Curriculum: Eye contact maintaining virtual avatar\n");
            preview.append("Type: Output\n");
        } else if (curriculum == 28) {
            preview.append("Curriculum: In-person partner finding instruction paired with activity\n");
            preview.append("Type: Output\n");
        }

        preview.append("Sequence: " + Integer.toString(seq) + "\n");

        if (format.substring(4).length() > limit) {
            preview.append("Content: " + format.substring(4, 4+limit) + "...\n");
        } else {
            preview.append("Content: " + format.substring(4) + "\n");
        }
        preview.append("\n");
    }

}