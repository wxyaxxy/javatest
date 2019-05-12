import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class graph  {
    JButton colorbutton;
    JButton labelbutton;
    public void go() {
        JFrame frame = new JFrame();
        colorbutton = new JButton("Click me");
        labelbutton = new JButton("lable me");
        labelbutton.addActionListener(new LableListener());
        colorbutton.addActionListener(new ColorListener());
        frame.getContentPane().add(BorderLayout.SOUTH,colorbutton);
        frame.getContentPane().add(BorderLayout.CENTER,labelbutton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        graph gui = new graph();
        gui.go();
    }

    class LableListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            labelbutton.setText("ouch");
        }
    }

    class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            colorbutton.setText("\"I've been clicked\"");
        }
    }

}
