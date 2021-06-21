import java.io.File;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Main app {
    public static void main(String[] args) {
        Border border = BorderFactory.createLineBorder(Color.green,3);
        ImageIcon shop = new ImageIcon("shop.png");
        JLabel label = new JLabel();
        label.setText("Eleven Shop");
        label.setIcon(shop);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Boli", Font.PLAIN,20));
        label.setIconTextGap(10);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        JFrame frame = new JFrame();
        //frame.setSize(420,420);
        frame.setTitle("Eleven Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}