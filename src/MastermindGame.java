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
	/**
	 * creation Jcombinaison attribute
	 * 
	 **/
	private Combinaison Jcombinaison;
	private int nbtour;

	/**
	 * Create a new game, that can be played (player is ready and ia combinaison is set)
	 */
	public MastermindGame()
	{
		/*
		 * CREATION D'UN OBJET COMBINAISON
		 */
		this.iaCombinaison = new Combinaison(Namecolor.BLUE, Namecolor.RED, Namecolor.YELLOW, Namecolor.GREEN);
		/*
		 * creation d'un objet player
		 */
		this.Player = new Player(true);
		this.Jcombinaison = new Combinaison(Namecolor.BLUE, Namecolor.RED, Namecolor.YELLOW, Namecolor.GREEN);
		
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
	while(this.gameover()){
		  System.out.println(this.Player.getcombi());
		  docomp();
		  System.out.println(docomp());
		  this.nbtour=this.nbtour+1;
		}	
	}
/**
 * methode docomp
 * @return boolean
 */
	private boolean docomp()
	{
		if(this.iaCombinaison.a==this.Jcombinaison.e){
			return true;
		}
		else{
		return false;		
		}
		// TODO Auto-generated method stub
		
	}
/**
 * methode gameover
 * @return boolean 
 */
	private boolean gameover()
	{
		if (this.docomp() || this.nbtour>=10){
			
			return false;
		}
		else{
			return true;
		
					}
		}
	}

