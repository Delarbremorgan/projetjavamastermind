import java.util.Arrays;

/**
 * class Combinaison
 * 
 * @author delarbrm
 *
 */
public class Combinaison
{
    private Namecolor[] colors ;
/**
 * combinaison object
 */
	public Combinaison()
	{ 
		colors =new Namecolor[4]; // allocate array
		
		for (int index = 0; index <4; index++)
				{ 
			     
			     colors[index] = Colors.getrandomcolor();
				}
	}

	

	/**
	 * do comparaison
	 * 
	 * @param other

	 * @return 
	 */
	public NbPion compareTo(Jcombinaison other)
	{   
		int blanc=0;
		int noir=0;
		
		for(int i =0 ;i < 4;i++)
		{
			 for (int j=0; j <4; j++)
		        {
		            if (this.colors[i] == other.Jcolors[j] && i==j) {
		            	blanc++;
		            break;	
		            };
		            
		            if (this.colors[i] == other.Jcolors[j]) 
		            	{noir++;
		            	break;
		            	}
		
		        }
		}
		NbPion comp = new NbPion(blanc,noir);
		// TODO Auto-generated method stub
		return comp;

	}
 


	@Override
	public String toString() {
		return "Combinaison [colors=" + Arrays.toString(colors) + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
		
		

}
