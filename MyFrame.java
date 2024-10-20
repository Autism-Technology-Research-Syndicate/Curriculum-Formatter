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
    private int state;

    public MyFrame(String title) {
        super(title);
        addKeyListener(this);
        setFocusable(true);
        requestFocus();
        requestFocusInWindow();
        this.keyControls = new ArrayList<>();
        this.labels = new ArrayList<>();
        this.buttonNum = 0;
        this.state = 0;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER && (state != 1 || state != 2)) {
            // Enter key pressed
            System.out.println("Enter key pressed!");
            enterButton.doClick();
        } else {
            System.out.println("Key pressed: " + e.getKeyChar());

            String keyInput = String.valueOf(e.getKeyChar());
            int index = -1;

            for (int x = 0; x < keyControls.size(); x++) {
                if (keyInput.equals(keyControls.get(x))) {
                    index = x;
                    break;
                }
            }

            System.out.println(index);

            buttonNum = index;
            JRadioButton selection = new JRadioButton();

            if (index >= 0 && index <= 14) {
                selection = buttons.get(buttonNum);
                selection.setSelected(true);
            }
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

    public void setEnterButton(JButton enter) {
        this.enterButton = enter;
    }

    public JButton getEnterButton() {
        return this.enterButton;
    }

    public void setButtonNum(int num) {
        this.buttonNum = num;
    }
    
    public int getButtonNum() {
        return this.buttonNum;
    }
    
    public void setState(int state) {
        this.state = state;
    }

    public int getState() {
        return this.state;
    }
}
