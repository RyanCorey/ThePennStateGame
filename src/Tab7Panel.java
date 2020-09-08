
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Tab7Panel extends JPanel {

    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb10, jb11, jb12;
    ImageIcon bg, bg2, bg3, bg4;
    Image psu;
    JButton message, message2;

    public Tab7Panel() {
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

        jb4 = new JButton("1");
        jb4.setBounds(250, 250, 100, 100);
        add(jb4);

        jb5 = new JButton("2");
        jb5.setBounds(400, 250, 100, 100);
        add(jb5);

        jb6 = new JButton("3");
        jb6.setBounds(550, 250, 100, 100);
        add(jb6);

        jb7 = new JButton("4");
        jb7.setBounds(250, 375, 100, 100);
        add(jb7);

        jb8 = new JButton("5");
        jb8.setBounds(400, 375, 100, 100);
        add(jb8);

        jb9 = new JButton("6");
        jb9.setBounds(550, 375, 100, 100);
        add(jb9);

        jb10 = new JButton("7");
        jb10.setBounds(250, 525, 100, 100);
        add(jb10);

        jb11 = new JButton("8");
        jb11.setBounds(400, 525, 100, 100);
        add(jb11);

        jb12 = new JButton("9");
        jb12.setBounds(550, 525, 100, 100);
        add(jb12);

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
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(psu, 0, 0, this);
        Font f1 = new Font("Arial", Font.BOLD, 80);
        g.setFont(f1);
        g.setColor(Color.RED);
        g.drawString("GAME 2", 100, 100);
        g.drawString("Guess The Boxes", 45, 200);

    }

}
