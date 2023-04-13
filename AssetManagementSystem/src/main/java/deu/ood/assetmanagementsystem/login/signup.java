package deu.ood.assetmanagementsystem.login;

import java.awt.event.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
 
class signup extends JFrame implements ActionListener{
    
    JPanel panel;
    JLabel lblid, lblpw, lblname, lblemail, lbladdr;
    JButton b1, b2;
    JTextField  txtid, txtname, txtemail, txtaddr;
    JPasswordField txtpw ;
    signup(){
        setTitle("회원가입");
        setSize(500, 500/8*5);
        setResizable(false);
        setLocationRelativeTo(null);
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2));
        
        lblid = new JLabel("ID");
        lblpw = new JLabel("PW");
        lblname = new JLabel("이름");
        lblemail = new JLabel("EMAIL");
        lbladdr = new JLabel("주소");
        
        txtid = new JTextField(10);
        txtpw = new JPasswordField(10);
        txtname = new JTextField(10);
        txtemail = new JTextField(20);
        txtaddr = new JTextField(30);
        
        b1 = new JButton("가입");
        b2 = new JButton("지우기");
        
        panel.add(lblid);
        panel.add(txtid);
        panel.add(lblpw);
        panel.add(txtpw);
        panel.add(lblname);
        panel.add(txtname);
        panel.add(lblemail);
        panel.add(txtemail);
        panel.add(lbladdr);
        panel.add(txtaddr);
        panel.add(b1);
        panel.add(b2);
        
        add(panel);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setVisible(true);
    }
    
        public void actionPerformed(ActionEvent e) {
            try{
                String s = null;
                boolean isOk = false;
                BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\sujin\\tester\\tester\\members.txt", true));
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sujin\\tester\\tester\\members.txt"));
                
                
                if(e.getSource() == b1) {
                    while((s = br.readLine()) != null) {
                        
                        String[] array = s.split("/");
                        if(array[0].equals(txtid.getText())){
                                isOk = true;
                                break;
                        }
                    }
                            if(!isOk) {
                            bw.write(txtid.getText() + "/");
                            bw.write(txtpw.getText() + "/");
                            bw.write(txtname.getText() + "/");
                            bw.write(txtemail.getText() + "/");
                            bw.write(txtaddr.getText() + "\r\n");
                            bw.close();
 
                            JOptionPane.showMessageDialog(null, "회원가입을 축하합니다.");
                            dispose();
                            }else {
                                JOptionPane.showMessageDialog(null, "회원가입에 실패하였습니다.");
                            }
                    
                }else if(e.getSource() == b2) {
                    txtid.setText("");
                    txtpw.setText("");
                    txtname.setText("");
                    txtemail.setText("");
                    txtaddr.setText("");
                }
            }catch (IOException  ex){
                JOptionPane.showMessageDialog(null, "실패");
            }
        }
        
}