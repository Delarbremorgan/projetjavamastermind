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
	
Scanner sa = new Scanner(System.in);
 public static Namecolor getselectcolor()
 { 
	 Scanner sa = new Scanner(System.in);
	 int sta = sa.nextInt();
	 if (sta==0) name=Namecolor.BLUE;
	 if (sta==1) name=Namecolor.RED;
	 if (sta==2) name=Namecolor.YELLOW;
	 if (sta==3) name=Namecolor.PINK;
	 if (sta==4) name=Namecolor.GREEN;
	 if (sta==5) name=Namecolor.ORANGE;
	 if (sta==6) name=Namecolor.PURPLE;
	 System.out.println(name);
	return name;
 }
}

