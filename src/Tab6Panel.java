
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.beans.*;

public class Tab6Panel extends JPanel {

    JButton jb1, jb2, jb3, jb4, jb8, jb9, jb10, jb11, jb12, jb13;
    ImageIcon bg, bg2, bg3, bg4;
    Image psu;
    XML_240 x2;

    JButton message, message2;

    public Tab6Panel() {
        setLayout(null);
        setBackground(Color.yellow);
        jb1 = new JButton("Return to Map");
        jb1.setBounds(new Rectangle(1100, 650, 250, 50));
        jb1.setFont(new Font("Arial", Font.PLAIN, 20));
        jb1.setForeground(Color.WHITE);
        jb1.setBackground(Color.BLACK);
        add(jb1);
        jb2 = new JButton("Time Elapsed");
        jb2.setBounds(new Rectangle(1100, 50, 250, 50));
        jb2.setFont(new Font("Arial", Font.PLAIN, 20));
        jb2.setForeground(Color.WHITE);
        jb2.setBackground(Color.BLACK);
        add(jb2);
        jb3 = new JButton("Score");
        jb3.setBounds(new Rectangle(800, 50, 250, 50));
        jb3.setFont(new Font("Arial", Font.PLAIN, 20));
        jb3.setForeground(Color.WHITE);
        jb3.setBackground(Color.BLACK);
        add(jb3);
        bg = new ImageIcon("images/RiseandRoar.jpg");
        bg2 = new ImageIcon("images/math1.jpg");
        bg3 = new ImageIcon("images/science1.jpg");
        bg4 = new ImageIcon("images/history1.jpg");
        psu = bg.getImage();

        message = new JButton("");
        message.setBounds(new Rectangle(1100, 120, 250, 50));
        message.setFont(new Font("Arial", Font.PLAIN, 20));
        message.setForeground(Color.white);
        message.setBackground(Color.black);
        add(message);

        message2 = new JButton("");
        message2.setBounds(new Rectangle(800, 120, 250, 50));
        message2.setFont(new Font("Arial", Font.PLAIN, 20));
        message2.setForeground(Color.white);
        message2.setBackground(Color.black);
        add(message2);

        x2 = new XML_240();

        String s1 = "";
        String s2 = "";
        String s3 = "";
        x2.openReaderXML("XML_test.xml");
        s1 = (String) x2.ReadObject();
        s2 = (String) x2.ReadObject();
        s3 = (String) x2.ReadObject();
        x2.closeReaderXML();

        JButton jb5 = new JButton(s1);
        add(jb5);
        JButton jb6 = new JButton(s2);
        add(jb6);
        JButton jb7 = new JButton(s3);
        add(jb7);

        jb5.setBounds(new Rectangle(150, 250, 200, 100));
        jb6.setBounds(new Rectangle(400, 250, 200, 100));
        jb7.setBounds(new Rectangle(650, 250, 200, 100));

        jb8 = new JButton();
        jb8.setText("4");
        add(jb8);
        jb9 = new JButton();
        jb9.setText("500");
        add(jb9);
        jb10 = new JButton();
        jb10.setText("2");
        add(jb10);
        jb11 = new JButton();
        jb11.setText("7000");
        add(jb11);
        jb12 = new JButton();
        jb12.setText("4");
        add(jb12);
        jb13 = new JButton();
        jb13.setText("80");
        add(jb13);

        jb8.setBounds(new Rectangle(150, 400, 200, 100));
        jb9.setBounds(new Rectangle(150, 550, 200, 100));
        jb10.setBounds(new Rectangle(400, 400, 200, 100));
        jb11.setBounds(new Rectangle(400, 550, 200, 100));
        jb12.setBounds(new Rectangle(650, 400, 200, 100));
        jb13.setBounds(new Rectangle(650, 550, 200, 100));

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(psu, 0, 0, this);
        Font f1 = new Font("Arial", Font.BOLD, 80);
        g.setFont(f1);
        g.setColor(Color.RED);
        g.drawString("GAME 1", 100, 100);

    }

}
