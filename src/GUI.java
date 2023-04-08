import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int count = 0;
    private JPanel panel;
    private JFrame frame;
    private JButton button;
    private JLabel label;


    public GUI(){

        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("Enter");
        label = new JLabel("Welcome!");

        panel.setBorder(BorderFactory.createEmptyBorder(40,40,10,40));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My GUI");
        frame.pack();
        frame.setVisible(true);

        button.addActionListener(this);

    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
