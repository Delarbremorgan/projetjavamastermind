/**
 * class Combinaison
 * 
 * @author delarbrm
 *
 */
public class Combinaison
{
	private Namecolor[] colors;
/**
 * combinaison object
 */
	public Combinaison()
	{
		this.colors =new Namecolor[4]; // allocate array
		
		for (int index = 0; index <= 4; index++)
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
	public NbPion compareTo(Combinaison other)
	{   
		NbPion comp = new NbPion();
		for(int i =0 ;i <= 4;i++)
		{
			 for (int j=0; j <=4; j++)
		        {
		            if (this.colors[i] == other.colors[j] && i==j) comp.addpionblanc();
		            
		            if (this.colors[i] == other.colors[j]) comp.addpionnoir();
		
		        }
		}
		// TODO Auto-generated method stub
		return comp;

	}
		
		public String toString()
		{
			return "todo";
		}

}
