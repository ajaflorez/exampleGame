package vista;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelButton extends JPanel {
    JButton botonSalir;
    
    public PanelButton() {
        super();
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        initComp();
        configComp();
        
        
    }
    public void initComp() {
        botonSalir = new JButton("Salir");
    }
    public void configComp() {
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.add(botonSalir);
        
    }
    
}
