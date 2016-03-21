// TODO(Done) fix comment (ask for advice)
/**
 *  Mastermindparty class and colors utilisation 
 * @author delarbrm
 *
 */
// TODO(done) is inheritance relevant here? think about it
public class MastermindGame  
{
	/**
	 * game can be started
	 * (player is ready and ia combinaison is set)
	 */
	public MastermindGame()
	{
		/**
		 * CREATION D'UN OBJET COMBINAISON
		 * @iaCombinaison name of combinaison
		 */
	Combinaison iaCombinaison= new Combinaison();//a modifier comme attribut
	/**
	 * creation d'un objet player
	 * @Player1 name of player 
	 */
	 Player Player1= new Player(true);//a modifier en attribut
	}
	
	// TODO(Done) rename method (ask for advice)
	/**
	 * allow to start a game
	 */
	public void play() 
	{
		
		// TODO(done) Auto-generated method stub
	  /**
	   * test for see random combinaison
	   */
		System.out.println(Combinaison.geta());
		System.out.println(Combinaison.getb());
		System.out.println(Combinaison.getc());
		System.out.println(Combinaison.getd());
	  
	  
}
 
}
