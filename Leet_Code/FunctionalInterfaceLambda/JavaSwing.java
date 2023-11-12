package FunctionalInterfaceLambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaSwing {

    public static void main(String[] main) {

        JFrame frame1 = new JFrame();
        frame1.setSize(400,400);
        frame1.setLayout(new FlowLayout());
        JButton button1 = new JButton("Click Me!!!");
        frame1.add(button1);

        button1.addActionListener((event) -> {
            System.out.println("Button CLicked");
            JOptionPane.showConfirmDialog(null, "Button Clicked.");
        });
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
    }
}
