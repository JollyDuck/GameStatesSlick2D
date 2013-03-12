package swapBetweenGamestates;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class SwapBetweenGamestates extends StateBasedGame{
	public SwapBetweenGamestates(){
		super("Testing");
	}
    public static void main(String[] args) throws SlickException
    {
         AppGameContainer app = new AppGameContainer(new SwapBetweenGamestates());
  
         app.setDisplayMode(800, 600, false);
         app.start();
    }

	@Override
	public void initStatesList(GameContainer arg0) throws SlickException {
		this.addState(new GameStatePart1(1));
		this.addState(new GameStatePart2(2));
		
	}

}
