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
	public static int color; 
	/**
	 * name of color
	 */
	public static Namecolor name;

	/**
	 * generate color random
	 * @return name of the color
	 */
	public static Namecolor getrandomcolor()
		{ 
			/**
			 * generate random color
			 */
			color=(int) ((mincolor)+(maxcolor-mincolor)*Math.random());
			if(color==0){
				name=Namecolor.BLUE; };
			if(color==1){
				name=Namecolor.RED; };
			if(color==2){
				name=Namecolor.YELLOW; };
			if(color==3){
				name=Namecolor.PINK; };
			if(color==4){
				name=Namecolor.GREEN; };
			if(color==5){
				name=Namecolor.ORANGE; };
			if(color==6){
				name=Namecolor.PURPLE; };
				return name;
		}
	}



