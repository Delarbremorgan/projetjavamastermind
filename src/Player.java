/**
 * player class
 * @author delarbrm
 *
 */
public class Player
{
	/**
	 * default state of the player
	 */
	public final static boolean default_state=false;
	private boolean state;
	/**
	 * create player with default_state
	 */
public Player(){
	this.state=default_state;	
}

/**
 * create player with defined state
 * @param state
 */
public Player(boolean state){
	this.state=state;
}
	/***
	 * change player state to ready
	 * @return the new state
	 */
public boolean Playerready(){
	return this.state=true;
}
/**
 * allow to see state of player
 * @return state
 */
public boolean getstate(){
	return this.state;
}



}
