// TODO fix comment (ask for advice)
/**
 *  Mastermindparty class and colors utilisation 
 * @author delarbrm
 *
 */
// TODO is inheritance relevant here? think about it
public class MastermindGame extends Colors 
{
	/**
	 * first ball of ia
	 */
	private int a; 
	/**
	 * second ball of ia
	 */
	private int b; 
	/**
	 * third ball of ia
	 */
	private int c;
	/**
	 * fourth ball of ia
	 */
	private int d; 
	/**
	 * player ready or not
	 */
	private boolean player; 
	
	/**
	 * game can be start
	 */
	public MastermindGame()
	{
		/**
		 *  combinaison de l'ia
		 */
	   this.a=getrandomcolor();  
	   /**
		 *  combinaison de l'ia
		 */
       this.b=getrandomcolor(); 
       /**
		 *  combinaison de l'ia
		 */
       this.c=getrandomcolor();	
       /**
		 *  combinaison de l'ia
		 */
	   this.d=getrandomcolor();	
	 /**
	  * player ready
	  */
	   this.player=true; 
	}
	
	// TODO rename method (ask for advice)
	/**
	 * allow to start a game 
	 */
	public void start() 
	{
		// TODO Auto-generated method stub
		
	}
 
}
