/**
 * class colors
 */
public class Colors
{
	/**
	 * number of color max
	 */
	public static final int maxcolor=6; 
	/**
	 * number of color min
	 */
	public static final int mincolor=0; 
	
	/**
	*color
	*/
	public int color; 
	/**
	 * name of color
	 */
	public Namecolor name;

	/**
	 * generate color random
	 * @return name of the color
	 */
	public Namecolor getrandomcolor()
		{ 
			/**
			 * generate random color
			 */
			this.color=(int) ((mincolor)+(maxcolor-mincolor)*Math.random());
			if(this.color==0){
				this.name=Namecolor.BLUE; };
			if(this.color==1){
				this.name=Namecolor.RED; };
			if(this.color==2){
				this.name=Namecolor.YELLOW; };
			if(this.color==3){
				this.name=Namecolor.PINK; };
			if(this.color==4){
				this.name=Namecolor.GREEN; };
			if(this.color==5){
				this.name=Namecolor.ORANGE; };
			if(this.color==6){
				this.name=Namecolor.PURPLE; };
				return this.name;
		}
	}



