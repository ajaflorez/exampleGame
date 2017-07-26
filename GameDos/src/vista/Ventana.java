package vista;

import javax.swing.JFrame;

public class Ventana extends JFrame {
    public Ventana() {
        super("Game LPS");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 500);
        this.setLocationRelativeTo(null);       
        this.setContentPane(new PanelMain());        
        this.setJMenuBar(new MenuMain());
                
        this.setVisible(true);
    }
    
    
}
