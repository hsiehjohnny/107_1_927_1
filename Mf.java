import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Mf extends JFrame {
    private JLabel jlb = new JLabel("");
    private JButton jbt[] = new JButton[12];
    private Font fnt = new Font(null, Font.BOLD, 24);
    private Container cp;
    private JPanel jpc = new JPanel();
    Random r = new Random(System.currentTimeMillis());
    Login login;
    public Mf(Login login1) {
        login = login1;
        init();
    }

    private void init() {

        this.setBounds(400, 100, 800, 600);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3, 3));
        cp.add(jlb, BorderLayout.NORTH);
        jlb.setSize(4, 5);
        cp.add(jpc, BorderLayout.CENTER);
        jpc.setLayout(new GridLayout(4, 3, 3, 3));
        for (int i = 0; i < 10; i++) {
            jbt[i] = new JButton();
            jbt[i].setFont(fnt);
            jpc.add(jbt[i]);
            jbt[i].setText(Integer.toString(r.nextInt(10)));
            for (int j = 0; j < i; ) {
                if (jbt[i].getText().equals(jbt[j].getText())) {
                    jbt[i].setText(Integer.toString(r.nextInt(10)));
                    j = 0;
                } else {
                    j++;
                }
            }
            jbt[i].addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton tmp = (JButton) e.getSource();
                    jlb.setText(jlb.getText() + tmp.getText());
                }
            });
        }

        JButton jbt10 = new JButton("Submit");
        JButton jbt11 = new JButton("RE");
        jpc.add(jbt10);
        jbt10.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pw = jlb.getText();
               login.setPassword(pw);
                Mf.this.dispose();
            }
        });
        jbt11.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int a = 0; a < 10; a++) {
                    jbt[a].setText(Integer.toString(r.nextInt(10)));
                    for (int b = 0; b < a; ) {
                        if (jbt[a].getText().equals(jbt[b].getText())) {
                            jbt[a].setText(Integer.toString(r.nextInt(10)));
                            b = 0;
                        } else {
                            b++;
                        }
                    }
                }
            }
        });
        jpc.add(jbt11);

    }
}
