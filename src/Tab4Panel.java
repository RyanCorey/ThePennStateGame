
import java.awt.*;
import javax.swing.*;

public class Tab4Panel extends JPanel {

    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7;
    ImageIcon bg, a1, a2, a3, t1, t2, t3;
    Image psu;
    JLabel jl1, jl2;
    Font f1;

    public Tab4Panel() {
        setLayout(null);
        setBackground(Color.yellow);
        jb1 = new JButton("Return to Main Menu");
        jb1.setBounds(new Rectangle(1100, 650, 250, 50));
        jb1.setFont(new Font("Arial", Font.PLAIN, 20));
        jb1.setForeground(Color.WHITE);
        jb1.setBackground(Color.BLACK);
        add(jb1);
        bg = new ImageIcon("images/RiseandRoar.jpg");
        psu = bg.getImage();
        a1 = new ImageIcon("images/murph1.jpg");
        jb2 = new JButton(a1);
        jb2.setBounds(new Rectangle(200, 75, 200, 250));
        a2 = new ImageIcon("images/kmk1.jpg");
        jb3 = new JButton(a2);
        jb3.setBounds(new Rectangle(600, 75, 200, 250));
        a3 = new ImageIcon("images/lara1.jpg");
        jb4 = new JButton(a3);
        jb4.setBounds(new Rectangle(1000, 75, 200, 250));
        t1 = new ImageIcon("images/math2.jpg");
        jb5 = new JButton(t1);
        jb5.setBounds(new Rectangle(200, 375, 200, 250));
        t2 = new ImageIcon("images/science2.jpg");
        jb6 = new JButton(t2);
        jb6.setBounds(new Rectangle(600, 375, 200, 250));
        t3 = new ImageIcon("images/History.png");
        jb7 = new JButton(t3);
        jb7.setBounds(new Rectangle(1000, 375, 200, 250));
        Font f1 = new Font("Arial", Font.BOLD, 20);
        jl1 = new JLabel("Character is DEFAULT");
        jl1.setBounds(new Rectangle(100, 300, 400, 750));
        jl1.setFont(f1);
        jl1.setForeground(Color.RED);
        jl2 = new JLabel("Theme is DEFAULT");
        jl2.setBounds(new Rectangle(500, 300, 400, 750));
        jl2.setFont(f1);
        jl2.setForeground(Color.RED);
        add(jb2);
        add(jb3);
        add(jb4);
        add(jb5);
        add(jb6);
        add(jb7);
        add(jl1);
        add(jl2);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(psu, 0, 0, this);
        Font f1 = new Font("Arial", Font.BOLD, 30);
        g.setFont(f1);
        g.setColor(Color.RED);
        g.drawString("Choose", 40, 150);
        g.drawString("Character", 40, 200);
        g.drawString("Choose", 40, 450);
        g.drawString("Theme", 40, 500);

    }
}
