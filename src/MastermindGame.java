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
	public final Combinaison iaCombinaison;
	/**
	 * creation Player attribute
	 * 
	 **/
	private final Player Player;

	private int nbtour;

	/**
	 * Create a new game, that can be played (player is ready and ia combinaison
	 * is set)
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
	 * while (<game is not over>) <ask player for combinaison> <compute code
	 * comparison> <show comparison to player>
	 */
	public void play()
	{
		boolean isGameOver = false;
		// TODO(done) Auto-generated method stub
		/*
		 * creation of player combinaison
		 */
		// this.Jcombinaison = new Combinaison(Namecolor.BLUE, Namecolor.RED,
		// Namecolor.YELLOW, Namecolor.GREEN);
		while (!isGameOver)
		{
			Combinaison combi = this.Player.getcombi();
			System.out.println(combi);
			
			/* boolean comp = */iaCombinaison.docomp(combi);
			// System.out.println(comp);
			this.nbtour = this.nbtour + 1;
		}
	}

	/**
	 * Method gameover
	 * 
	 * @return boolean
	 */
	/*private boolean gameover()
	{
		if (Combinaison.docomp(this.Player.Jcombinaison, this.iaCombinaison))
		{
			System.out.println("bonne Combinaison");
			System.out.println(this.iaCombinaison.e + " " + this.iaCombinaison.f + " " + this.iaCombinaison.g + " "
					+ this.iaCombinaison.h);
			return true;
		}
		else
		{
			if (this.nbtour >= 10)
			{
				System.out.println("nombre de tour max atteint");
				System.out.println(this.iaCombinaison.e + " " + this.iaCombinaison.f + " " + this.iaCombinaison.g + " "
						+ this.iaCombinaison.h);
				return true;
			}
			else
			{
				return false;
			}
		}
	}*/

}
