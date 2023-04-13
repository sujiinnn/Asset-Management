package deu.ood.assetmanagementsystem.login;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class admin extends JFrame{
    public admin(){
                 JPanel panel = new JPanel();
            setResizable(false);
            setVisible(true);
            setPreferredSize(new Dimension(840, 840/12*9));
            setSize(840, 840/12*9);
            setLocationRelativeTo(null);
        add(panel);
    }
}
//관리자 모드 txt파일에 저장된 값을 불러와서 회원가입된 회원목록을 표로 표시후 삭제 및 수정 가능 구현