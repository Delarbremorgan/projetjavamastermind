
public class Jcombinaison extends Combinaison {
	protected Namecolor[] Jcolors;
     public Jcombinaison(){
     				this.Jcolors = new Namecolor[4]; // allocate array
    				
    				for (int index = 0; index <= 4; index++)
    						{
    							this.Jcolors[index] = Colors.getselectcolor();
    						}
     
     }
}
