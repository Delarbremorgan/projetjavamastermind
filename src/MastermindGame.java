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
	private Namecolor a; 
	/**
	 * second ball of ia
	 */
	private Namecolor b; 
	/**
	 * third ball of ia
	 */
	private Namecolor c;
	/**
	 * fourth ball of ia
	 */
	private Namecolor d; 
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
	public void play() 
	{
		// TODO Auto-generated method stub
	  
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println(this.d);
		System.out.println(this.player);
	  
	  
}
 
}
