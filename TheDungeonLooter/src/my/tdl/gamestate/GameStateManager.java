package my.tdl.gamestate;

import java.awt.Graphics2D;
import java.util.Stack;

public class GameStateManager {
    public static Stack<GameState> states;

    public GameStateManager() {
        states = new Stack<GameState>();
        states.push(new DungeonLevelLoader(this));
    }
    public void init() {
        this.states.peek().init();
    }
    public void tick(double deltaTime) {
       this.states.peek().tick(deltaTime);  //peek(): Looks at the object at the top of this stack without removing it from the stack.
    }
    public void  render(Graphics2D g) {
        this.states.peek().render(g);
    }
    
    
    
    
}
