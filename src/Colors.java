import java.util.Scanner;

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
	public static  int color; 
	/**
	 * name of color
	 */
	public static Namecolor name;
	private Namecolor Cname;

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
	
static Scanner sa = new Scanner(System.in);
 public Namecolor getselectcolor()
 {
	 int sta = sa.nextInt();
	 if (sta==1) name=Namecolor.BLUE;
	 if (sta==2) name=Namecolor.RED;
	 if (sta==3) name=Namecolor.YELLOW;
	 if (sta==4) name=Namecolor.GREEN;
	 if (sta==5) name=Namecolor.PINK;
	 if (sta==6) name=Namecolor.ORANGE;
	 if (sta==7) name=Namecolor.PURPLE;
	return name;
 }
public Namecolor getCname() {
	return Cname;
}

 
}

