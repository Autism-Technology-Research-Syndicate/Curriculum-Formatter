import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.*;

public class MyFrame extends JFrame implements KeyListener{

    private ArrayList<String> keyControls;
    private ArrayList<String> labels;
    private ArrayList<JRadioButton> buttons;
    private JButton enterButton;
    private int buttonNum;

    public MyFrame(String title) {
        super(title);
        addKeyListener(this);
        setFocusable(true);
        requestFocus();
        requestFocusInWindow();
        this.keyControls = new ArrayList<>();
        this.labels = new ArrayList<>();
        this.buttonNum = 0;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed: " + e.getKeyChar());

        String keyInput = String.valueOf(e.getKeyChar());
        int index = 0;

        for (int x = 0; x < keyControls.size(); x++) {
            if (keyInput.equals(keyControls.get(x))) {
                index = x;
                break;
            }
        }

        System.out.println(index);

        buttonNum = index;
        JRadioButton selection = new JRadioButton();

        if (index == 0) {
            selection = buttons.get(buttonNum);
            selection.setSelected(true);
        } else if (index == 1) {
            selection = buttons.get(buttonNum);
            selection.setSelected(true);
        } else if (index == 2) {
            selection = buttons.get(buttonNum);
            selection.setSelected(true);
        } else if (index == 3) {
            selection = buttons.get(buttonNum);
            selection.setSelected(true);
        } else if (index == 4) {
            selection = buttons.get(buttonNum);
            selection.setSelected(true);
        } else if (index == 5) {
            selection = buttons.get(buttonNum);
            selection.setSelected(true);
        } else if (index == 6) {
            selection = buttons.get(buttonNum);
            selection.setSelected(true);
        } else if (index == 7) {
            selection = buttons.get(buttonNum);
            selection.setSelected(true);
        } else if (index == 8) {
            selection = buttons.get(buttonNum);
            selection.setSelected(true);
        } else if (index == 9) {
            selection = buttons.get(buttonNum);
            selection.setSelected(true);
        } else if (index == 10) {
            selection = buttons.get(buttonNum);
            selection.setSelected(true);
        } else if (index == 11) {
            selection = buttons.get(buttonNum);
            selection.setSelected(true);
        } else if (index == 12) {
            selection = buttons.get(buttonNum);
            selection.setSelected(true);
        } else if (index == 13) {
            selection = buttons.get(buttonNum);
            selection.setSelected(true);
        } else if (index == 14) {
            selection = buttons.get(buttonNum);
            selection.setSelected(true);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public void setControls(ArrayList<String> list) {
        this.keyControls = list;
        System.out.println(this.keyControls.toString());
    }

    public ArrayList<String> getControls() {
        return this.keyControls;
    }

    public void setLabels(ArrayList<String> list) {
        this.labels = list;
        System.out.println(this.labels.toString());
    }

    public ArrayList<String> getLabels() {
        return this.labels;
    }

    public void setButtons(ArrayList<JRadioButton> b) {
        this.buttons = b;
    }

    public ArrayList<JRadioButton> getButtons() {
        return this.buttons;
    }

    public void setButtonNum(int num) {
        this.buttonNum = num;
    }
    
    public int getButtonNum() {
        return this.buttonNum;
    }
    
}
