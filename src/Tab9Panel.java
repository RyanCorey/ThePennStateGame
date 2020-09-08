
import java.awt.*;
import javax.swing.*;

public class Tab9Panel extends JPanel {

    JButton jb1;
    ImageIcon bg, bg2, bg3, bg4;
    Image psu;
    JLabel jl1, jl2;

    public Tab9Panel() {
        setLayout(null);
        setBackground(Color.yellow);
        jb1 = new JButton("Return to Main Menu");
        jb1.setBounds(new Rectangle(1100, 650, 250, 50));
        jb1.setFont(new Font("Arial", Font.PLAIN, 20));
        jb1.setForeground(Color.WHITE);
        jb1.setBackground(Color.BLACK);
        add(jb1);
        jl1 = new JLabel("Test");
        jl1.setBounds(new Rectangle(750, 450, 200, 50));
        jl1.setForeground(Color.red);
        jl1.setFont(new Font("Arial", Font.BOLD, 20));
        add(jl1);
        jl2 = new JLabel("Test");
        jl2.setBounds(new Rectangle(1000, 450, 300, 50));
        jl2.setForeground(Color.red);
        jl2.setFont(new Font("Arial", Font.BOLD, 20));
        add(jl2);
        bg = new ImageIcon("images/RiseandRoar.jpg");
        bg2 = new ImageIcon("images/math1.jpg");
        bg3 = new ImageIcon("images/science1.jpg");
        bg4 = new ImageIcon("images/history1.jpg");
        psu = bg.getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(psu, 0, 0, this);
        Font f1 = new Font("Arial", Font.BOLD, 80);
        g.setFont(f1);
        g.setColor(Color.RED);
        g.drawString("GAME OVER", 700, 400);

    }
}
