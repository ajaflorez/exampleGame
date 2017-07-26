package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class Ventana extends JFrame{
    MainPanel panelMain;
    MainMenu menuMain; 
    public Ventana() {
        super("Game Tres");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        menuMain = new MainMenu();
        this.setJMenuBar(menuMain);               
        
        panelMain = new MainPanel();
        this.setContentPane(panelMain);
        
        /*Container container = this.getContentPane();
        container.add(new PanelButton(), BorderLayout.PAGE_END);*/
        
        
        
        
        this.setVisible(true);
    }
    
}
