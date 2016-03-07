
public class Colors
{
	/**
	 * number of color max
	 */
	public int maxcolor=6; 
	/**
	 * number of color min
	 */
	public int mincolor=0; 
	/**
	*distribution of color
	*/
	public int blue=0;
	/**
	*distribution of color
	*/
	public int red=1;
	/**
	*distribution of color
	*/
	public int yellow=2;
	/**
	*distribution of color
	*/
	public int pink=3;
	/**
	*distribution of color
	*/
	public int green=4;
	/**
	*distribution of color
	*/
	public int orange=5;
	/**
	*distribution of color
	*/
	public int purple=6;
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

