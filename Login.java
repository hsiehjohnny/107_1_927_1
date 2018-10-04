import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
    private String idt = Integer.toString(106021383);
    private String idpw = Integer.toString(23323456);
    private JLabel id = new JLabel("ID:");
    private JLabel PW = new JLabel("PW:");
    public JTextField jtf = new JTextField("");
    private JPasswordField jpw = new JPasswordField("");
    private JButton key = new JButton("key");
    private JButton lg = new JButton("Login");
    private JButton e = new JButton("Exit");

    public Login(String pw) {
        abc(pw);
    }

    private void abc(String pw) {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 800, 600);
        this.setLayout(null);
        id.setBounds(100, 60, 80, 70);
        this.add(id);
        jtf.setBounds(190, 60, 200, 80);
        this.add(jtf);
        PW.setBounds(100, 140, 80, 70);
        this.add(PW);
        jpw.setBounds(190, 140, 200, 80);
        this.add(jpw);
        jpw.setText(pw);
        key.setBounds(80, 250, 100, 60);
        this.add(key);
        lg.setBounds(180, 250, 100, 60);
        this.add(lg);
        lg.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jtf.getText().equals(idt) && jpw.getText().equals(idpw)) {
                    game i = new game();
                    i.setVisible(true);
                    Login.this.dispose();
                }
            }
        });
        e.setBounds(280, 250, 100, 60);
        this.add(e);
        key.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mf mf = new Mf(Login.this);
                mf.setVisible(true);
            }
        });
    }
    public void setPassword(String str){
        jpw.setText(str);
    }

}
