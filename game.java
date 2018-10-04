import com.sun.glass.ui.Menu;
import com.sun.glass.ui.MenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class game extends JFrame {
    private JMenuBar menuBar = new JMenuBar();
    private JMenu jf = new JMenu("File");
    private JMenu js = new JMenu("Tool");
    private JMenu jg = new JMenu("Game");
    private JMenu jh = new JMenu("Help");
    private JMenuItem jo = new JMenuItem("Open");
    private JMenuItem jn = new JMenuItem("New");
    private JMenuItem je = new JMenuItem("Exit");
    private JMenuItem jox = new JMenuItem("OOXX");

    public game() {
        inthis();
    }

    private void inthis() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 800, 600);
        this.setLayout(null);

        this.setJMenuBar(menuBar);
        menuBar.add(jf);
        jf.add(jo);
        jo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser();
                Component parent = null;
                jfc.showOpenDialog(parent);
            }
        });
        jf.add(jn);
        menuBar.add(jg);
        jg.add(jox);
        jox.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        jn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game g2= new game();
                g2.setVisible(true);
                game.this.dispose();
            }
        });
        jf.add(je);
        menuBar.add(js);
        //menuBar.add();
        menuBar.add(jh);
        je.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
