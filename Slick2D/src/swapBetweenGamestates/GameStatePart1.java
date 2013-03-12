package swapBetweenGamestates;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class GameStatePart1 extends BasicGameState {
	/*
	 * Create a variable to hold stateID - a way of storing numerically what
	 * state is being run at any time. Initially this can be anything, as on
	 * creation in the main class it is allocated in the constructor below.
	 */
	int stateID = -1;

	// Create an image variable to be rendered later.

	Image land = null;

	/**
	 * Constructor to create GameStatePart1.
	 * 
	 * @param stateID
	 *            The stateID you want it to hold. In this example, it should be
	 *            '1'.
	 */
	GameStatePart1(int stateID) {
		this.stateID = stateID;
	}

	@Override
	public void init(GameContainer gc, StateBasedGame arg1)
			throws SlickException {
		// set land as an image (Found in data/land. Change to wherever is
		// applicable.)
		land = new Image("data/land.jpg");

	}

	@Override
	public void render(GameContainer gc, StateBasedGame arg1, Graphics g)
			throws SlickException {
		// Draw the land image at 0,0.
		land.draw();

	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		// Create an Input reader called input.
		Input input = gc.getInput();
		// If the A key is pressed, then StateBasedGame sbg should enter state
		// 2.
		if (input.isKeyDown(Input.KEY_A)) {
			sbg.enterState(2);
		}
	}

	@Override
	public int getID() {
		return stateID;
	}

}