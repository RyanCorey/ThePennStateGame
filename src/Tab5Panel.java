
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Tab5Panel extends JPanel {

    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;
    ImageIcon bg, a1, a2, a3;
    Image pa;
    JButton message, message2;
    Rectangle r1, r2, r3, r4, r5, r6;
    int x = 25;
    int y = 25;
    int i = 0;
    int score;

    public Tab5Panel() {
        setLayout(null);
        setBackground(Color.white);
        jb1 = new JButton("Return to Main Menu");
        jb1.setBounds(new Rectangle(1100, 650, 250, 50));
        jb1.setFont(new Font("Arial", Font.PLAIN, 20));
        jb1.setForeground(Color.WHITE);
        jb1.setBackground(Color.BLACK);
        jb2 = new JButton("Time Elapsed");
        jb2.setBounds(new Rectangle(1100, 50, 250, 50));
        jb2.setFont(new Font("Arial", Font.PLAIN, 20));
        jb2.setForeground(Color.WHITE);
        jb2.setBackground(Color.BLACK);
        jb3 = new JButton("Score");
        jb3.setBounds(new Rectangle(800, 50, 250, 50));
        jb3.setFont(new Font("Arial", Font.PLAIN, 20));
        jb3.setForeground(Color.WHITE);
        jb3.setBackground(Color.BLACK);
        jb4 = new JButton("End Game");
        jb4.setBounds(new Rectangle(1100, 575, 250, 50));
        jb4.setFont(new Font("Arial", Font.PLAIN, 20));
        jb4.setForeground(Color.WHITE);
        jb4.setBackground(Color.BLACK);
        jb5 = new JButton("Avatar");
        jb5.setBounds(new Rectangle(x, y, 100, 125));
        add(jb1);
        add(jb2);
        add(jb3);
        add(jb4);
        add(jb5);
        bg = new ImageIcon("images/pamap.jpg");
        a1 = new ImageIcon("images/murph2.jpg");
        a2 = new ImageIcon("images/kmk2.png");
        a3 = new ImageIcon("images/lara2.jpg");
        pa = bg.getImage();
        r1 = new Rectangle(478, 390, 75, 75);
        r2 = new Rectangle(805, 495, 75, 75);
        r3 = new Rectangle(75, 410, 75, 75);
        r4 = new Rectangle(855, 260, 75, 75);
        r5 = new Rectangle(1080, 400, 75, 75);

        message = new JButton("");
        message.setBounds(new Rectangle(1100, 120, 250, 50));
        message.setFont(new Font("Arial", Font.PLAIN, 20));
        message.setForeground(Color.white);
        message.setBackground(Color.black);
        add(message);

        message2 = new JButton("" + score);
        message2.setBounds(new Rectangle(800, 120, 250, 50));
        message2.setFont(new Font("Arial", Font.PLAIN, 20));
        message2.setForeground(Color.white);
        message2.setBackground(Color.black);
        add(message2);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(pa, 0, 0, this);
        g.setColor(Color.yellow);
        g.drawRect(478, 390, 75, 75);
        g.setColor(Color.cyan);
        g.drawRect(805, 495, 75, 75);
        g.setColor(Color.blue);
        g.drawRect(75, 410, 75, 75);
        g.setColor(Color.orange);
        g.drawRect(855, 260, 75, 75);
        g.setColor(Color.red);
        g.drawRect(1080, 400, 75, 75);
        requestFocusInWindow();
    }
}
