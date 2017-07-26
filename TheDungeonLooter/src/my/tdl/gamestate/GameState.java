package my.tdl.gamestate;

import java.awt.Graphics2D;

public abstract class GameState {

    GameStateManager gameStateManager;

    public GameState(GameStateManager gameStateManager) {
        this.gameStateManager = gameStateManager;
    }
    public abstract void init();
    public abstract void tick(double deltaTime);
    public abstract void render(Graphics2D g);
    
    
    
}
