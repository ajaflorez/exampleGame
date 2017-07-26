package vista;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelButton extends JPanel {
    JButton botonExit;
    // El JPanel tiene por defecto el FlowLayout y en CENTER
    public PanelButton() {
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        ImageIcon iconExit = new ImageIcon(this.getClass().getResource("/icon/exit.png"));
        botonExit = new JButton("Salir", iconExit);
        botonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        this.add(botonExit);
    }
    
}
