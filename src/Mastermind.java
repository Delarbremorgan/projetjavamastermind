/**
 *  Mastermindparty class and colors utilisation 
 * @author delarbrm
 *
 */
public class Mastermind extends Colors 
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
	public Mastermind()
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
	
	/**
	 * allow to start a game 
	 */
	public void start() 
	{
		// TODO Auto-generated method stub
		
	}
 
}
