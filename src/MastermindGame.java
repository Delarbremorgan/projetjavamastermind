// TODO(Done) fix comment (ask for advice)
/**
 * Mastermindparty class and colors utilisation
 * 
 * @author delarbrm
 *
 */
// TODO(done) is inheritance relevant here? think about it
public class MastermindGame
{
	/**
	 * creation iaCombinaison attribute
	 */
	private final Combinaison iaCombinaison;
	/**
	 * creation Player attribute
	 * 
	 **/
	private final Player Player;
	/**
	 * creation Jcombinaison attribute
	 * 
	 **/
	private Combinaison Jcombinaison;

	/**
	 * Create a new game, that can be played (player is ready and ia combinaison is set)
	 */
	public MastermindGame()
	{
		/*
		 * CREATION D'UN OBJET COMBINAISON
		 */
		this.iaCombinaison = new Combinaison();
		/*
		 * creation d'un objet player
		 */
		this.Player = new Player(true);

	}

	// TODO(Done) rename method (ask for advice)
	/**
	 * play the game
	 * 
	 * 		while (<game is not over>)
	 * 			<ask player for combinaison>
	 * 			<compute code comparison>
	 * 			<show comparison to player>
	*/
	public void play()
	{
		// TODO(done) Auto-generated method stub
		/*
		 * creation of player combinaison
		 */
		//this.Jcombinaison = new Combinaison(Namecolor.BLUE, Namecolor.RED, Namecolor.YELLOW, Namecolor.GREEN);
	}
}
