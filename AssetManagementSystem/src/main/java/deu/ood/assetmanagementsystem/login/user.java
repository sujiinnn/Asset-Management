package deu.ood.assetmanagementsystem.login;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class user extends JFrame {

    public user() {
        JPanel panel = new JPanel();
        setResizable(false);
        setVisible(true);
        setPreferredSize(new Dimension(840, 840 / 12 * 9));
        setSize(840, 840 / 12 * 9);

        add(panel);
    }
}
//로그인 후 실행되는 모든 기능 구현
