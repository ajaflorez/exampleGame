package my.tdl.gamestate;

import java.awt.Graphics2D;

public class DungeonLevelLoader extends GameState{

    public DungeonLevelLoader(GameStateManager gameStateManager) {
        super(gameStateManager);
    }

    @Override
    public void init() {
        
    }

    @Override
    public void tick(double deltaTime) {
        
    }

    @Override
    public void render(Graphics2D g) {
        g.drawString("Hello Word", 200, 200);
    }
    
}
