package vista;

import java.awt.BorderLayout;
import java.awt.Container;

public class PanelMain extends Container{
    PanelGame panelGame;
    PanelButton panelButton;
    
    public PanelMain() {
        this.setLayout(new BorderLayout());                
        panelGame = new PanelGame();
        panelButton = new PanelButton();        
        
        this.add(panelButton, BorderLayout.PAGE_END);
        this.add(panelGame, BorderLayout.CENTER);
        
        
    }
}
