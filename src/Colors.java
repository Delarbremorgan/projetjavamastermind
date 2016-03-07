
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
	*distribution of color
	*/
	public static final int blue=0;
	/**
	*distribution of color
	*/
	public static final int red=1;
	/**
	*distribution of color
	*/
	public static final int yellow=2;
	/**
	*distribution of color
	*/
	public static final int pink=3;
	/**
	*distribution of color
	*/
	public static final int green=4;
	/**
	*distribution of color
	*/
	public static final int orange=5;
	/**
	*distribution of color
	*/
	public static final int purple=6;
	/**
	*color
	*/
	public int color; 

	/**
	 * generate color random
	 * @return
	 */
	public int getrandomcolor()
		{ 
			/**
			 * generate random color
			 */
			return this.color=(int) ((mincolor)+(maxcolor-mincolor)*Math.random());
		}

}

