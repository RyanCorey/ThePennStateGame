
import java.awt.*;
import javax.swing.*;

public class Tab3Panel extends JPanel {

    JButton jb1, jb2, jb3, jb4;
    Font f1, f2;
    ImageIcon bg;
    Image psu;
    String answer, result;
    JLabel verify;

    public Tab3Panel() {
        setLayout(null);
        setBackground(Color.yellow);
        jb1 = new JButton("Return to Main Menu");
        jb1.setBounds(new Rectangle(1100, 650, 250, 50));
        jb1.setFont(new Font("Arial", Font.PLAIN, 20));
        jb1.setForeground(Color.WHITE);
        jb1.setBackground(Color.BLACK);
        add(jb1);
        jb2 = new JButton("YES");
        jb2.setBounds(new Rectangle(500, 500, 100, 100));
        jb2.setFont(new Font("Arial", Font.PLAIN, 20));
        jb2.setForeground(Color.WHITE);
        jb2.setBackground(Color.BLACK);
        add(jb2);
        jb3 = new JButton("NO");
        jb3.setBounds(new Rectangle(800, 500, 100, 100));
        jb3.setFont(new Font("Arial", Font.PLAIN, 20));
        jb3.setForeground(Color.WHITE);
        jb3.setBackground(Color.BLACK);
        add(jb3);
        jb4 = new JButton("Verify Answer");
        jb4.setBounds(new Rectangle(500, 625, 200, 50));
        jb4.setFont(new Font("Arial", Font.PLAIN, 20));
        jb4.setForeground(Color.WHITE);
        jb4.setBackground(Color.BLACK);
        add(jb4);
        answer = new String();
        result = new String();
        verify = new JLabel("You answered     ");
        verify.setBounds(new Rectangle(800, 625, 200, 50));
        verify.setForeground(Color.red);
        verify.setFont(new Font("Arial", Font.BOLD, 20));
        add(verify);
        bg = new ImageIcon("images/RiseandRoar.jpg");
        psu = bg.getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(psu, 0, 0, this);
        Font f1 = new Font("Arial", Font.BOLD, 25);
        Font f2 = new Font("Arial", Font.BOLD, 50);
        g.setFont(f1);
        g.setColor(Color.RED);
        g.drawString("#1 From Main Menu, choose Options button to choose a character and theme and then return to main menu.", 20, 150);
        g.drawString("#2 From Main Menu, choose Play! to choose a game to play.", 20, 200);
        g.drawString("#3 From Play screen, use your keyboard directional arrows to navigate to a Penn State campus and start a game.", 20, 250);
        g.drawString("#4 To end your game session, choose End Game from Play screen.", 20, 300);
        g.drawString("#5 Your total playing time will be displayed on the final screen.", 20, 350);
        g.drawString("Do you understand these instructions?", 475, 450);
        g.setFont(f2);
        g.drawString("INSTRUCTIONS", 500, 50);

    }
}
