package my.project.gop.main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class IDGameLoop extends JPanel implements Runnable{
    private Thread thread;
    private boolean running;
    
    private int framePerSecond;
    private int tickPerSecond;
    
    private int width;
    private int height;
    
    public Graphics2D graphics2d;
    public BufferedImage image; 
    
    public static double currentFPS = 120D; // Current Frame Per Second
    
    public IDGameLoop(int widht, int height) {
        this.width = width;
        this.height = height;
        
        this.setPreferredSize(new Dimension(width, height));
        this.setFocusable(false);
        this.requestFocus();        
    }

    @Override
    public void addNotify() {
        super.addNotify(); //To change body of generated methods, choose Tools | Templates.
        
        if(thread == null) {
            thread = new Thread();
            thread.start();
        }
    }

    
    
    @Override
    public void run() {
        // INIT
        init();
        long lastTimeJVM = System.nanoTime();  //Returns the current value of the running Java Virtual Machine's high-resolution time source,
        double nsPerTick = 1000000000D / currentFPS;    // nanosecond per Tick
        int frames = 0;  // frame
        int ticks = 0;  // tick
        long lastTimeMil = System.currentTimeMillis();    // Returns the current time in milliseconds. 
        double deltaTime = 0;   // permite incrementar el tick y render
        
        while(this.running) {
            long nowTimeJVM = System.nanoTime();    // Time actual del JVM
            deltaTime += (nowTimeJVM - lastTimeJVM) / nsPerTick;
            lastTimeJVM = nowTimeJVM;   //  El tiempo NOW se convierte el LAST
            boolean shouldRender = false;   // TRUE para RENDER
            
            while(deltaTime >= 1) {
                ticks++;
                // TICK + DELTATIME
                tick(deltaTime);
                deltaTime -= 1;
                shouldRender = true;    // Render                
            }
            if(shouldRender) {
                frames++;
                render();
            }
            
            // SLEEP
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            if(System.currentTimeMillis() - lastTimeMil >= 1000) {
                lastTimeMil += 1000;
                framePerSecond = frames;
                tickPerSecond = ticks;
                frames = 0;
                ticks = 0;
            }
            
            
        }
        
        
    }

    public void init() {
        this.image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        this.graphics2d = (Graphics2D)image.getGraphics();
        this.running = true;
        
        
    }

    public void tick(double deltaTime) {
        
    }

    public void render() {
        graphics2d.clearRect(0, 0, width, height);
    }
    public void clear() {
        Graphics g2 = this.getGraphics();
        if(this.image != null) {
            g2.drawImage(image, 0, 0, null);
        }
        g2.dispose();   // Disposes of this graphics context and releases any system resources that it is using.
    }
    
}
