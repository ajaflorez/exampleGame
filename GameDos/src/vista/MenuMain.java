package vista;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class MenuMain extends JMenuBar {    
    JMenu menuJuego;
    public MenuMain() {  
        super();
        this.initComp();
        this.configComp();        
    }    
    public void initComp() {
        menuJuego = new JMenu("Juego");
    }
    public void configComp() {
        JMenuItem itemNuevo = new JMenuItem("Nuevo Juego");
        itemNuevo.setMnemonic(KeyEvent.VK_N);
        itemNuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        
        JMenuItem itemGuardar = new JMenuItem("Guardar Juego");
        
        JMenuItem itemSalir = new JMenuItem("Salir");
        itemSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        menuJuego.add(itemNuevo);
        menuJuego.add(itemGuardar);
        menuJuego.addSeparator();
        menuJuego.add(itemSalir);

        this.add(menuJuego);        
    }
}
