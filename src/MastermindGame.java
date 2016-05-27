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
		// done Auto-generated method stub
		/*
		 * creation of player combinaison
		 */
		// this.Jcombinaison = new Combinaison(Namecolor.BLUE, Namecolor.RED,
		// Namecolor.YELLOW, Namecolor.GREEN);
		while (!isGameOver)
		{
			 /* for test method compareto System.out.println(this.iaCombinaison);*/
			Jcombinaison combi = this.Player.getcombi();
			NbPion pion = this.iaCombinaison.compareTo(combi);
			System.out.println("Nombre de pion blanc ="+" "+pion.getPionblanc()+" "+ "&"+" "+"Nombre de pion noir ="+" "+pion.getPionnoir());
			this.nbtour = this.nbtour + 1;
			System.out.println("Vous êtes au tour n°"+this.nbtour+"/12");
			if (pion.getPionblanc()==4) isGameOver=true ;
			if (this.nbtour == 12) isGameOver=true  ;
			if (pion.getPionblanc()==4) System.out.println("Victoire"+" "+"la combinaison a trouver etait :"+ this.iaCombinaison);
			if (this.nbtour == 12) System.out.println("défaite"+" "+"la combinaison a trouver etait :"+this.iaCombinaison)  ;
		}
	}

}
