
import java.awt.*;
import javax.swing.*;

public class Tab2Panel extends JPanel {

    JButton jb1, jb2, jb3;
    ImageIcon bg, a1, a2;
    Image psu;

    public Tab2Panel() {
        setLayout(null);
        setBackground(Color.yellow);
        jb1 = new JButton("Return to Main Menu");
        jb1.setBounds(new Rectangle(1100, 650, 250, 50));
        jb1.setFont(new Font("Arial", Font.PLAIN, 20));
        jb1.setForeground(Color.WHITE);
        jb1.setBackground(Color.BLACK);
        add(jb1);
        a1 = new ImageIcon("images/michael.png");
        jb2 = new JButton(a1);
        jb2.setBounds(new Rectangle(400, 200, 186, 171));
        jb2.setFont(new Font("Arial", Font.PLAIN, 20));
        jb2.setForeground(Color.WHITE);
        jb2.setBackground(Color.BLACK);
        add(jb2);
        a2 = new ImageIcon("images/ryan.png");
        jb3 = new JButton(a2);
        jb3.setBounds(new Rectangle(800, 200, 195, 163));
        jb3.setFont(new Font("Arial", Font.PLAIN, 20));
        jb3.setForeground(Color.WHITE);
        jb3.setBackground(Color.BLACK);
        add(jb3);
        bg = new ImageIcon("images/RiseandRoar.jpg");
        psu = bg.getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(psu, 0, 0, this);
        Font f1 = new Font("Arial", Font.BOLD, 50);
        Font f2 = new Font("Arial", Font.BOLD, 30);
        g.setFont(f1);
        g.setColor(Color.RED);
        g.drawString("Credits", 600, 100);
        g.setFont(f2);
        g.drawString("Michael Connolly", 375, 450);
        g.drawString("Ryan Corey", 820, 450);

    }
}
