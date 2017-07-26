
package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PanelGame extends JPanel implements ActionListener{
    Robot robot; 
    Timer time;

    public PanelGame() {
        this.setBackground(Color.BLACK);
        robot = new Robot();        
        time = new Timer(200, this);
        this.addKeyListener(new KeyEscucha(robot));        
        this.setFocusable(true);
        
        time.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        robot.paint(g);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        repaint();
    }
    
}
