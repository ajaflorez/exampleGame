package vista;

import java.awt.BorderLayout;
import java.awt.Container;

public class MainPanel extends Container{
    PanelButton panelButton;
    PanelGame panelGame;
    // se tiene que especificar el Layout a Utilizar
    public MainPanel() {
        this.setLayout(new BorderLayout());
        
        panelButton = new PanelButton();        
        this.add(panelButton, BorderLayout.PAGE_END);
        
        panelGame = new PanelGame();
        this.add(panelGame, BorderLayout.CENTER);
        
        
        
        
    }
    
    
}
