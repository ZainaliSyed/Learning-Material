package mixmaterial;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class MouseListenrDemo extends JFrame implements MouseListener{
   JButton bb=new JButton("ok");
    public MouseListenrDemo() {
        setLayout(null);
        setBounds(0,0,500,500);
        bb.setBounds(100,100,100,100);
        add(bb);
        bb.addMouseListener(this);
        show();
    }
    public static void main(String arg[]){
        MouseListenrDemo ob=new MouseListenrDemo();
    }
    public void mouseClicked(MouseEvent e) {
        bb.setBackground(Color.red);
    }

    public void mousePressed(MouseEvent e) {
        bb.setBackground(Color.pink);
    }

    public void mouseReleased(MouseEvent e) {
        bb.setBackground(Color.green);
    }

    public void mouseEntered(MouseEvent e) {
        bb.setBackground(Color.blue);
    }

    public void mouseExited(MouseEvent e) {
                bb.setBackground(Color.cyan);

    }
    
}
