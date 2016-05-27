/**
 * player combinaison
 * @author delarbrm
 *
 */
public class Jcombinaison extends Combinaison {
	protected Namecolor[] Jcolors;
	/**
	 * allow to create a new combinaison
	 */
     public Jcombinaison(){
     				this.Jcolors = new Namecolor[4]; // allocate array
     				System.out.println("tapez 0 pour bleu , 1 pour rouge , 2 pour jaune , 3 pour rose , 4 pour vert , 5 pour orange , 6 pour violet");
    				for (int index = 0; index < Jcolors.length; index++)
    						{   
    					 		
    							this.Jcolors[index] = Colors.getselectcolor();
    						}
     
     }
}
