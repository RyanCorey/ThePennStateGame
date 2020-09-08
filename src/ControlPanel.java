
import java.awt.event.*;
import java.awt.*;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.*;

public class ControlPanel extends JPanel implements ActionListener, KeyListener {
    
    JTabbedPane tabsPanel;
    Tab1Panel tab1;
    Tab2Panel tab2;
    Tab3Panel tab3;
    Tab4Panel tab4;
    Tab5Panel tab5;
    Tab6Panel tab6;
    Tab7Panel tab7;
    Tab8Panel tab8;
    Tab9Panel tab9;
    XML_240 XML;
    Timer tim;
    
    public ControlPanel() {
        super();
        setLayout(null);
        
        tabsPanel = new JTabbedPane();
        tabsPanel.setBackground(Color.gray);
        tabsPanel.setBounds(new Rectangle(0, 0, 1400, 800));
        
        XML = new XML_240();
        
        tab1 = new Tab1Panel();
        tab2 = new Tab2Panel();
        tab3 = new Tab3Panel();
        tab4 = new Tab4Panel();
        tab5 = new Tab5Panel();
        tab6 = new Tab6Panel();
        tab7 = new Tab7Panel();
        tab8 = new Tab8Panel();
        tab9 = new Tab9Panel();
        
        tim = new Timer(1000, this);
        
        tabsPanel.addTab("Intro Sreen", tab1);
        tabsPanel.addTab("Credits/About", tab2);
        tabsPanel.addTab("Instructions", tab3);
        tabsPanel.addTab("Options", tab4);
        tabsPanel.addTab("Play!", tab5);
        tabsPanel.addTab("Game 1", tab6);
        tabsPanel.addTab("Game 2", tab7);
        tabsPanel.addTab("Game 3", tab8);
        tabsPanel.addTab("Game Over", tab9);
        
        tabsPanel.setEnabledAt(0, false);
        tabsPanel.setEnabledAt(1, false);
        tabsPanel.setEnabledAt(2, false);
        tabsPanel.setEnabledAt(3, false);
        tabsPanel.setEnabledAt(4, false);
        tabsPanel.setEnabledAt(5, false);
        tabsPanel.setEnabledAt(6, false);
        tabsPanel.setEnabledAt(7, false);
        tabsPanel.setEnabledAt(8, false);
        add(tabsPanel);
        tab1.jb1.addActionListener(this);
        tab1.jb2.addActionListener(this);
        tab1.jb3.addActionListener(this);
        tab1.jb4.addActionListener(this);
        tab2.jb1.addActionListener(this);
        tab3.jb1.addActionListener(this);
        tab3.jb2.addActionListener(this);
        tab3.jb3.addActionListener(this);
        tab3.jb4.addActionListener(this);
        tab4.jb1.addActionListener(this);
        tab4.jb2.addActionListener(this);
        tab4.jb3.addActionListener(this);
        tab4.jb4.addActionListener(this);
        tab4.jb5.addActionListener(this);
        tab4.jb6.addActionListener(this);
        tab4.jb7.addActionListener(this);
        tab5.jb1.addActionListener(this);
        tab5.jb4.addActionListener(this);
        tab6.jb1.addActionListener(this);
        tab7.jb1.addActionListener(this);
        tab8.jb1.addActionListener(this);
        tab9.jb1.addActionListener(this);
        tab5.setFocusable(true);
        tab5.addKeyListener(this);
        tab8.addKeyListener(this);
        tab8.b1.addActionListener(this);
        tab6.jb8.addActionListener(this);
        tab6.jb9.addActionListener(this);
        tab6.jb10.addActionListener(this);
        tab6.jb11.addActionListener(this);
        tab6.jb12.addActionListener(this);
        tab6.jb13.addActionListener(this);        
        tab7.jb4.addActionListener(this);
        tab7.jb5.addActionListener(this);
        tab7.jb6.addActionListener(this);
        tab7.jb7.addActionListener(this);
        tab7.jb8.addActionListener(this);
        tab7.jb9.addActionListener(this);
        tab7.jb10.addActionListener(this);
        tab7.jb11.addActionListener(this);
        tab7.jb12.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent event) {
        
        Object obj = event.getSource();
        
        if (obj == tab1.jb1) {
            tabsPanel.setSelectedIndex(1);
            tabsPanel.setEnabledAt(0, false);
            tabsPanel.setEnabledAt(1, true);
            tabsPanel.setEnabledAt(2, false);
            tabsPanel.setEnabledAt(3, false);
            tabsPanel.setEnabledAt(4, false);
            tabsPanel.setEnabledAt(5, false);
            tabsPanel.setEnabledAt(6, false);
            tabsPanel.setEnabledAt(7, false);
            tabsPanel.setEnabledAt(8, false);
        }
        if (obj == tab1.jb2) {
            tabsPanel.setSelectedIndex(2);
            tabsPanel.setEnabledAt(0, false);
            tabsPanel.setEnabledAt(1, false);
            tabsPanel.setEnabledAt(2, true);
            tabsPanel.setEnabledAt(3, false);
            tabsPanel.setEnabledAt(4, false);
            tabsPanel.setEnabledAt(5, false);
            tabsPanel.setEnabledAt(6, false);
            tabsPanel.setEnabledAt(7, false);
            tabsPanel.setEnabledAt(8, false);
        }
        if (obj == tab1.jb3) {
            tabsPanel.setSelectedIndex(3);
            tabsPanel.setEnabledAt(0, false);
            tabsPanel.setEnabledAt(1, false);
            tabsPanel.setEnabledAt(2, false);
            tabsPanel.setEnabledAt(3, true);
            tabsPanel.setEnabledAt(4, false);
            tabsPanel.setEnabledAt(5, false);
            tabsPanel.setEnabledAt(6, false);
            tabsPanel.setEnabledAt(7, false);
            tabsPanel.setEnabledAt(8, false);
            
        }
        if (obj == tab1.jb4) {
            tabsPanel.setSelectedIndex(4);
            tabsPanel.setEnabledAt(0, false);
            tabsPanel.setEnabledAt(1, false);
            tabsPanel.setEnabledAt(2, false);
            tabsPanel.setEnabledAt(3, false);
            tabsPanel.setEnabledAt(4, true);
            tabsPanel.setEnabledAt(5, false);
            tabsPanel.setEnabledAt(6, false);
            tabsPanel.setEnabledAt(7, false);
            tabsPanel.setEnabledAt(8, false);
            tim.start();
            
        }
        if (obj == tab2.jb1) {
            tabsPanel.setSelectedIndex(0);
            tabsPanel.setEnabledAt(0, true);
            tabsPanel.setEnabledAt(1, false);
            tabsPanel.setEnabledAt(2, false);
            tabsPanel.setEnabledAt(3, false);
            tabsPanel.setEnabledAt(4, false);
            tabsPanel.setEnabledAt(5, false);
            tabsPanel.setEnabledAt(6, false);
            tabsPanel.setEnabledAt(7, false);
            tabsPanel.setEnabledAt(8, false);
            
        }
        if (obj == tab3.jb1) {
            tabsPanel.setSelectedIndex(0);
            tabsPanel.setEnabledAt(0, true);
            tabsPanel.setEnabledAt(1, false);
            tabsPanel.setEnabledAt(2, false);
            tabsPanel.setEnabledAt(3, false);
            tabsPanel.setEnabledAt(4, false);
            tabsPanel.setEnabledAt(5, false);
            tabsPanel.setEnabledAt(6, false);
            tabsPanel.setEnabledAt(7, false);
            tabsPanel.setEnabledAt(8, false);
            
        }
        if (obj == tab4.jb1) {
            tabsPanel.setSelectedIndex(0);
            tabsPanel.setEnabledAt(0, true);
            tabsPanel.setEnabledAt(1, false);
            tabsPanel.setEnabledAt(2, false);
            tabsPanel.setEnabledAt(3, false);
            tabsPanel.setEnabledAt(4, false);
            tabsPanel.setEnabledAt(5, false);
            tabsPanel.setEnabledAt(6, false);
            tabsPanel.setEnabledAt(7, false);
            tabsPanel.setEnabledAt(8, false);
            tab4.jl1.setText("Character is DEFAULT");
            tab4.jl2.setText("Theme is DEFAULT");
            
        }
        if (obj == tab5.jb1) {
            tabsPanel.setSelectedIndex(0);
            tabsPanel.setEnabledAt(0, true);
            tabsPanel.setEnabledAt(1, false);
            tabsPanel.setEnabledAt(2, false);
            tabsPanel.setEnabledAt(3, false);
            tabsPanel.setEnabledAt(4, false);
            tabsPanel.setEnabledAt(5, false);
            tabsPanel.setEnabledAt(6, false);
            tabsPanel.setEnabledAt(7, false);
            tabsPanel.setEnabledAt(8, false);
            
        }
        if (obj == tab6.jb1) {
            tabsPanel.setSelectedIndex(4);
            tabsPanel.setEnabledAt(0, false);
            tabsPanel.setEnabledAt(1, false);
            tabsPanel.setEnabledAt(2, false);
            tabsPanel.setEnabledAt(3, false);
            tabsPanel.setEnabledAt(4, true);
            tabsPanel.setEnabledAt(5, false);
            tabsPanel.setEnabledAt(6, false);
            tabsPanel.setEnabledAt(7, false);
            tabsPanel.setEnabledAt(8, false);
            tab5.message2.setText("" + tab5.score);
            
        }
        if (obj == tab7.jb1) {
            tabsPanel.setSelectedIndex(4);
            tabsPanel.setEnabledAt(0, false);
            tabsPanel.setEnabledAt(1, false);
            tabsPanel.setEnabledAt(2, false);
            tabsPanel.setEnabledAt(3, false);
            tabsPanel.setEnabledAt(4, true);
            tabsPanel.setEnabledAt(5, false);
            tabsPanel.setEnabledAt(6, false);
            tabsPanel.setEnabledAt(7, false);
            tabsPanel.setEnabledAt(8, false);
            tab5.message2.setText("" + tab5.score);
            tab7.jb4.setText("1");
            tab7.jb5.setText("2");
            tab7.jb6.setText("3");
            tab7.jb7.setText("4");
            tab7.jb8.setText("5");
            tab7.jb9.setText("6");
            tab7.jb10.setText("7");
            tab7.jb11.setText("8");
            tab7.jb12.setText("9");
        }
        if (obj == tab8.jb1) {
            tabsPanel.setSelectedIndex(4);
            tabsPanel.setEnabledAt(0, false);
            tabsPanel.setEnabledAt(1, false);
            tabsPanel.setEnabledAt(2, false);
            tabsPanel.setEnabledAt(3, false);
            tabsPanel.setEnabledAt(4, true);
            tabsPanel.setEnabledAt(5, false);
            tabsPanel.setEnabledAt(6, false);
            tabsPanel.setEnabledAt(7, false);
            tabsPanel.setEnabledAt(8, false);
            tab5.message2.setText("" + tab5.score);
            
        }
        if (obj == tab9.jb1) {
            tabsPanel.setSelectedIndex(0);
            tabsPanel.setEnabledAt(0, true);
            tabsPanel.setEnabledAt(1, false);
            tabsPanel.setEnabledAt(2, false);
            tabsPanel.setEnabledAt(3, false);
            tabsPanel.setEnabledAt(4, false);
            tabsPanel.setEnabledAt(5, false);
            tabsPanel.setEnabledAt(6, false);
            tabsPanel.setEnabledAt(7, false);
            tabsPanel.setEnabledAt(8, false);
        }
        if (obj == tab5.jb4) {
            tabsPanel.setSelectedIndex(8);
            tabsPanel.setEnabledAt(0, false);
            tabsPanel.setEnabledAt(1, false);
            tabsPanel.setEnabledAt(2, false);
            tabsPanel.setEnabledAt(3, false);
            tabsPanel.setEnabledAt(4, false);
            tabsPanel.setEnabledAt(5, false);
            tabsPanel.setEnabledAt(6, false);
            tabsPanel.setEnabledAt(7, false);
            tabsPanel.setEnabledAt(8, true);
            tim.stop();
            tab9.jl1.setText("Score " + tab5.score);
            tab9.jl2.setText("Total time " + tab5.i + " seconds");
        }
        if (obj == tab4.jb2) {
            tab4.jl1.setText("Character is Lt. Michael Murphy");
            tab5.jb5.setIcon(tab5.a1);
        }
        if (obj == tab4.jb3) {
            tab4.jl1.setText("Character is Keegan-Michael Key");
            tab5.jb5.setIcon(tab5.a2);
        }
        if (obj == tab4.jb4) {
            tab4.jl1.setText("Character is Lara Spencer");
            tab5.jb5.setIcon(tab5.a3);
        }
        if (obj == tab4.jb5) {
            tab4.jl2.setText("Theme is mathematics");
            tab6.psu = tab6.bg2.getImage();
            tab7.psu = tab7.bg2.getImage();
            tab8.psu = tab8.bg2.getImage();
            tab9.psu = tab9.bg2.getImage();
        }
        if (obj == tab4.jb6) {
            tab4.jl2.setText("Theme is science");
            tab6.psu = tab6.bg3.getImage();
            tab7.psu = tab7.bg3.getImage();
            tab8.psu = tab8.bg3.getImage();
            tab9.psu = tab9.bg3.getImage();
        }
        if (obj == tab4.jb7) {
            tab4.jl2.setText("Theme is history");
            tab6.psu = tab6.bg4.getImage();
            tab7.psu = tab7.bg4.getImage();
            tab8.psu = tab8.bg4.getImage();
            tab9.psu = tab9.bg4.getImage();
        }
        if (obj == tab3.jb2) {
            tab3.answer = ("You answered YES");
        }
        {
            try {
                XML.xe = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("info.xml")));
            } catch (Exception xx) {
                xx.printStackTrace();
            }
            
            try {
                XML.xe.writeObject(tab3.answer);
            } catch (Exception xx) {
                xx.printStackTrace();
            }
            
            try {
                XML.xe.close();
            } catch (Exception xx) {
                xx.printStackTrace();
            }
        }
        if (obj == tab3.jb3) {
            tab3.answer = ("You answered NO");
        }
        {
            try {
                XML.xe = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("info.xml")));
            } catch (Exception xx) {
                xx.printStackTrace();
            }
            
            try {
                XML.xe.writeObject(tab3.answer);
            } catch (Exception xx) {
                xx.printStackTrace();
            }
            
            try {
                XML.xe.close();
            } catch (Exception xx) {
                xx.printStackTrace();
            }
        }
        if (obj == tab3.jb4) {
            try {
                XML.de = new XMLDecoder(new BufferedInputStream(new FileInputStream("info.xml")));
            } catch (Exception xx) {
                xx.printStackTrace();
            }
            try {
                tab3.result = (String) XML.de.readObject();
                
            } catch (Exception xx) {
                xx.printStackTrace();
            }
            try {
                XML.de.close();
            } catch (Exception xx) {
                xx.printStackTrace();
            }
            tab3.verify.setText(tab3.result);
        }
        if (obj == tim) {
            tab5.i = tab5.i + 1;
            tab5.message.setText("Time = " + tab5.i);
            tab6.message.setText("Time = " + tab5.i);
            tab7.message.setText("Time = " + tab5.i);
            tab8.message.setText("Time = " + tab5.i);
            
        }
        if (obj == tab6.jb8) {
            tab6.jb8.setText("Correct!");
            tab5.score = tab5.score + 100;
            tab6.message2.setText("" + tab5.score);
            
        }
        
        if (obj == tab6.jb9) {
            tab6.jb9.setText("NO");
            
        }
        if (obj == tab6.jb10) {
            tab6.jb10.setText("Correct!");
            tab5.score = tab5.score + 200;
            tab6.message2.setText("" + tab5.score);
            
        }
        if (obj == tab6.jb11) {
            tab6.jb11.setText("NO");
            
        }
        if (obj == tab6.jb12) {
            
            tab6.jb12.setText("Correct!");
            tab5.score = tab5.score + 300;
            tab6.message2.setText("" + tab5.score);
            
        }
        if (obj == tab6.jb13) {
            tab6.jb13.setText("NO");
            
        }
        
        if (obj == tab7.jb4) {
            tab7.jb4.setText("Correct!");
            tab5.score = tab5.score + 100;
            tab7.message2.setText("" + tab5.score);
            
        }
        
        if (obj == tab7.jb5) {
            tab7.jb5.setText("NO");
            
        }
        if (obj == tab7.jb6) {
            tab7.jb6.setText("Correct!");
            tab5.score = tab5.score + 200;
            tab7.message2.setText("" + tab5.score);
            
        }
        if (obj == tab7.jb7) {
            tab7.jb7.setText("Correct!");
            tab5.score = tab5.score + 300;
            tab7.message2.setText("" + tab5.score);
            
        }
        if (obj == tab7.jb8) {
            tab7.jb8.setText("NO");
            
        }
        if (obj == tab7.jb9) {
            tab7.jb9.setText("NO");
            
        }
        if (obj == tab7.jb10) {
            tab7.jb10.setText("NO");
            
        }
        if (obj == tab7.jb11) {
            tab7.jb11.setText("Correct!");
            tab5.score = tab5.score + 50;
            tab7.message2.setText("" + tab5.score);
            
        }
        if (obj == tab7.jb12) {
            tab7.jb12.setText("Correct!");
            tab5.score = tab5.score + 75;
            tab7.message2.setText("" + tab5.score);
            
        }
        
        if (obj == tab8.tim) {
            tab8.i = tab8.i + 1;
            tab8.game.setText("Number = " + tab8.i);
        }
        if (obj == tab8.tim) {
            tab8.i = tab8.i - 10;
            double r = Math.random();
            double s = Math.random();
            int x = (int) (r * 500);
            int y = (int) (s * 500);
            Rectangle ch = new Rectangle(x, y, tab8.w, tab8.h);
            tab8.b1.setBounds(ch);
            
            if (tab8.i == 0) {
                tim.stop();
                tab8.b1.setBounds(100, 100, 400, 400);
            }
        }
        if (obj == tab8.b1) {
            double r = Math.random();
            double s = Math.random();
            int x = (int) (r * 500);
            int y = (int) (s * 500);
            tab8.w = tab8.w - 6;
            tab8.h = tab8.h - 6;
            Rectangle ch = new Rectangle(x, y, tab8.w, tab8.h);
            tab8.b1.setBounds(ch);
            tab5.score = tab5.score + 10;
            tab8.message2.setText("" + tab5.score);
            repaint();
        }
        
    }
    
    public void keyTyped(KeyEvent ke) {
        
    }
    
    public void keyPressed(KeyEvent evt) {
        int kk = evt.getKeyCode();
        if (kk == evt.VK_LEFT) {
            tab5.x = tab5.x - 5;
        }
        if (kk == evt.VK_RIGHT) {
            tab5.x = tab5.x + 5;
        }
        if (kk == evt.VK_UP) {
            tab5.y = tab5.y - 5;
        }
        if (kk == evt.VK_DOWN) {
            tab5.y = tab5.y + 5;
        }
        tab5.jb5.setBounds(new Rectangle(tab5.x, tab5.y, 100, 125));
        tab5.r6 = tab5.jb5.getBounds();
        if (tab5.r6.intersects(tab5.r1)) {
            tab5.x = 25;
            tab5.y = 25;
            tab5.jb5.setBounds(new Rectangle(tab5.x, tab5.y, 100, 125));
            tabsPanel.setSelectedIndex(5);
            tabsPanel.setEnabledAt(0, false);
            tabsPanel.setEnabledAt(1, false);
            tabsPanel.setEnabledAt(2, false);
            tabsPanel.setEnabledAt(3, false);
            tabsPanel.setEnabledAt(4, false);
            tabsPanel.setEnabledAt(5, true);
            tabsPanel.setEnabledAt(6, false);
            tabsPanel.setEnabledAt(7, false);
            tabsPanel.setEnabledAt(8, false);
            tab6.message2.setText("" + tab5.score);
            
        }
        if (tab5.r6.intersects(tab5.r2)) {
            tab5.x = 25;
            tab5.y = 25;
            tab5.jb5.setBounds(new Rectangle(tab5.x, tab5.y, 100, 125));
            tabsPanel.setSelectedIndex(6);
            tabsPanel.setEnabledAt(0, false);
            tabsPanel.setEnabledAt(1, false);
            tabsPanel.setEnabledAt(2, false);
            tabsPanel.setEnabledAt(3, false);
            tabsPanel.setEnabledAt(4, false);
            tabsPanel.setEnabledAt(5, false);
            tabsPanel.setEnabledAt(6, true);
            tabsPanel.setEnabledAt(7, false);
            tabsPanel.setEnabledAt(8, false);            
            tab7.message2.setText("" + tab5.score);
            
        }
        if (tab5.r6.intersects(tab5.r3)) {
            tab5.x = 25;
            tab5.y = 25;
            tab5.jb5.setBounds(new Rectangle(tab5.x, tab5.y, 100, 125));
            tabsPanel.setSelectedIndex(7);
            tabsPanel.setEnabledAt(0, false);
            tabsPanel.setEnabledAt(1, false);
            tabsPanel.setEnabledAt(2, false);
            tabsPanel.setEnabledAt(3, false);
            tabsPanel.setEnabledAt(4, false);
            tabsPanel.setEnabledAt(5, false);
            tabsPanel.setEnabledAt(6, false);
            tabsPanel.setEnabledAt(7, true);
            tabsPanel.setEnabledAt(8, false);
            tab8.message2.setText("" + tab5.score);
            
        }
        if (tab5.r6.intersects(tab5.r4)) {
            tab5.x = 25;
            tab5.y = 25;
            tab5.jb5.setBounds(new Rectangle(tab5.x, tab5.y, 100, 125));
            tabsPanel.setSelectedIndex(5);
            tabsPanel.setEnabledAt(0, false);
            tabsPanel.setEnabledAt(1, false);
            tabsPanel.setEnabledAt(2, false);
            tabsPanel.setEnabledAt(3, false);
            tabsPanel.setEnabledAt(4, false);
            tabsPanel.setEnabledAt(5, true);
            tabsPanel.setEnabledAt(6, false);
            tabsPanel.setEnabledAt(7, false);
            tabsPanel.setEnabledAt(8, false);
            tab6.message2.setText("" + tab5.score);
            
        }
        if (tab5.r6.intersects(tab5.r5)) {
            tab5.x = 25;
            tab5.y = 25;
            tab5.jb5.setBounds(new Rectangle(tab5.x, tab5.y, 100, 125));
            tabsPanel.setSelectedIndex(6);
            tabsPanel.setEnabledAt(0, false);
            tabsPanel.setEnabledAt(1, false);
            tabsPanel.setEnabledAt(2, false);
            tabsPanel.setEnabledAt(3, false);
            tabsPanel.setEnabledAt(4, false);
            tabsPanel.setEnabledAt(5, false);
            tabsPanel.setEnabledAt(6, true);
            tabsPanel.setEnabledAt(7, false);
            tabsPanel.setEnabledAt(8, false);
            tab7.message2.setText("" + tab5.score);
            
        }
        if (kk == evt.VK_SPACE) {
            if (kk == evt.VK_SPACE) {
                tab8.tim.start();
            }
        }
    }
    
    public void keyReleased(KeyEvent ke) {
    }
    
}
