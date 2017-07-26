package my.tdl.gameloop;

import my.project.gop.main.IDGameLoop;
import my.tdl.gamestate.GameStateManager;

public class GameLoop extends IDGameLoop{
    GameStateManager gameStateManager;
    
    public GameLoop(int widht, int height) {
        super(widht, height);
    }

    @Override
    public void init() {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        gameStateManager = new GameStateManager();
        gameStateManager.init();
    }

    @Override
    public void tick(double deltaTime) {
        super.tick(deltaTime); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void render() {
        super.render(); //To change body of generated methods, choose Tools | Templates.
        gameStateManager.render(graphics2d);
        clear();
    }

    @Override
    public void clear() {
        super.clear(); //To change body of generated methods, choose Tools | Templates.
    }
    
            
    
}
