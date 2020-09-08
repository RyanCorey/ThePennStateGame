
import java.awt.*;
import javax.swing.*;

public class Tab1Panel extends JPanel {

    JButton jb1, jb2, jb3, jb4;
    ImageIcon bg;
    Image psu;

    public Tab1Panel() {
        setLayout(null);
        setBackground(Color.WHITE);

        jb1 = new JButton("Credits");
        jb1.setBounds(new Rectangle(950, 25, 400, 150));
        jb1.setFont(new Font("Arial", Font.PLAIN, 40));
        jb1.setForeground(Color.white);
        jb1.setBackground(Color.BLACK);
        add(jb1);
        jb2 = new JButton("Instructions");
        jb2.setBounds(new Rectangle(950, 200, 400, 150));
        jb2.setFont(new Font("Arial", Font.PLAIN, 40));
        jb2.setForeground(Color.white);
        jb2.setBackground(Color.BLACK);
        add(jb2);
        jb3 = new JButton("Options");
        jb3.setBounds(new Rectangle(950, 375, 400, 150));
        jb3.setFont(new Font("Arial", Font.PLAIN, 40));
        jb3.setForeground(Color.white);
        jb3.setBackground(Color.BLACK);
        add(jb3);
        jb4 = new JButton("Play!");
        jb4.setBounds(new Rectangle(950, 550, 400, 150));
        jb4.setFont(new Font("Arial", Font.PLAIN, 40));
        jb4.setForeground(Color.white);
        jb4.setBackground(Color.BLACK);
        add(jb4);
        bg = new ImageIcon("images/RiseandRoar.jpg");
        psu = bg.getImage();

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(psu, 0, 0, this);
        Font f1 = new Font("Arial", Font.BOLD, 60);
        g.setFont(f1);
        g.setColor(Color.RED);
        g.drawString("Final Project IST240 FA18", 125, 80);

    }
}
