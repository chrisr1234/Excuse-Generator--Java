import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame {


//JPanel
public static JPanel panel = new JPanel();
//Buttons
public static JButton btn = new JButton("Generate");
// Frame
public static JFrame frame = new JFrame();
// JTextFeild
public static JTextField txt = new JTextField();


public static void main(String[] args) {

	//initialize JFrame, Jpanel, JFrame
    init();
    Button.button();

}

private static void init() {
	int x = 130;
	panel.setLayout(null);
    btn.setBounds(x, 100, 130, 100);
    btn.setBackground(Color.white);
    
    txt.setBounds(x-125,240,380,55);
    txt.setBackground(Color.white);
    
    //JPanel bounds
    panel.setBounds(0, 0, 0, 0);
    panel.setBackground(Color.black);

    //Adding to JFrame
    panel.add(btn);
    panel.add(txt);
    frame.add(panel);
    
    // JFrame properties
    frame.setSize(400, 400);
     
    frame.setTitle("Excuse Generator");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    


}
}
