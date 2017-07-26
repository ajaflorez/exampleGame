package my.project.gop.main;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

public class GameWindow extends JFrame{
    boolean fullScreen = false;     // estado del fullscreen
    int fullScreenType = 0;         // tipo del Screen
    
    // Obtiene el device del graphics
    GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
    
    public GameWindow(String title, int width, int height) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        //this.setVisible(true);
        
    }
    private void setFullScreenPri() {
        switch(this.fullScreenType) {
            case 0: System.out.println("No FullScreen");
                this.setUndecorated(false);
                break;
            case 1: this.setUndecorated(true);
                this.setExtendedState(JFrame.MAXIMIZED_BOTH);
                break;
            case 2: this.setUndecorated(true);
                this.device.setFullScreenWindow(this);                
                break;
        }
    }
    public void setFullScreen(int fullScreenType) {
        this.fullScreen = true;
        if(fullScreenType <= 2) {
            this.fullScreenType = fullScreenType;
            this.setFullScreenPri();
        }            
        else
            System.err.println("Error " + fullScreenType + " is not Supported !");
    
    }
    
}
