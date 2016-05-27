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
		boolean[] bp;
		bp=new boolean[4];
		for(int i =0 ;i < this.colors.length;i++)
		{
		    if (this.colors[i] == other.Jcolors[i]){
		        blanc++;
		        bp[i]=true;
		            								}	
		    else{ bp[i] = false;}
		}
		boolean[] np;
		np = new boolean[4];
		for(int i =0 ;i < this.colors.length;i++){
			if(bp[i]) continue;
			for(int j=0;j < 4;j++){
				if(np[j]) continue;
				 if (this.colors[i] == other.Jcolors[j]){
					 noir++;
					 np[j]=true;
				 }
				 else{np[j] = false;}
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
