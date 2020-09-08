
import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class InitialFrame extends JFrame {

    ControlPanel mjp;

    public InitialFrame() {
        super("Final IST240 FA18");
        LayoutUIManager();
        mjp = new ControlPanel();
        add(mjp);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1400, 800);
        setVisible(true);
    }

    void LayoutUIManager() {

        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
