
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Tab8Panel extends JPanel implements ActionListener {

    JButton jb1, jb2, jb3;
    ImageIcon bg, bg2, bg3, bg4;
    Image psu;
    JButton game, message, message2;
    boolean timerOn = false;
    JButton b1;
    int score = 0;
    Timer tim;
    int i = 600;
    int delay = 1000;
    int w = 150;
    int h = 150;

    public Tab8Panel() {
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

        b1 = new JButton("click me");
        b1.setBounds(new Rectangle(100, 100, w, h));
        add(b1);
        tim = new Timer(delay, this);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(psu, 0, 0, this);
        Font f1 = new Font("Arial", Font.BOLD, 80);
        g.setFont(f1);
        g.setColor(Color.RED);
        g.drawString("GAME 3", 100, 100);
        g.drawString("Click box", 85, 200);
        g.drawString("to start", 85, 300);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
