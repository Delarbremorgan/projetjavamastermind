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
		
		for (int index = 0; index < this.colors.length; index++)
				{ 
			     
			     this.colors[index] = Colors.getrandomcolor();
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
		boolean[] bp = {false, false, false, false};

		for(int i =0 ;i < this.colors.length;i++)
		{
		    if (this.colors[i] == other.Jcolors[i]){
		        blanc++;
		        bp[i]=true;
		            									
		    }
		}
		boolean[] np =  {false, false, false, false};
		System.arraycopy(bp, 0, np, 0, bp.length);
		
		for(int i =0 ;i < this.colors.length;i++){
			if(bp[i]) continue;
			for(int j=0;j < this.colors.length;j++){
				if(np[j]) continue;
				 if (this.colors[i] == other.Jcolors[j]){
					 noir++;
					 np[j]=true;
				 }
			}
			
		}
		NbPion comp = new NbPion(blanc,noir);
		// done Auto-generated method stub
		return comp;

	}
 


	@Override
	public String toString() {
		return "Combinaison [colors=" + Arrays.toString(colors) + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
		
		

}
