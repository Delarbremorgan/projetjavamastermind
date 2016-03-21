/**
 * class Combinaison
 * @author delarbrm
 *
 */
public class Combinaison
{
	/**
	 * first ball of ia
	 */
	private static Namecolor a; 
	/**
	 * second ball of ia
	 */
	private static Namecolor b; 
	/**
	 * third ball of ia
	 */
	private static Namecolor c;
	/**
	 * fourth ball of ia
	 */
	private static Namecolor d; 
	/**
	 * create new combinaison
	 */
public Combinaison() {
/**
 * first ball color
 */
   this.a=Colors.getrandomcolor();
   /**
    * second ball color
    */
   this.b=Colors.getrandomcolor();
   /**
    * third ball color
    */
   this.c=Colors.getrandomcolor();
    /**
 * fourth ball color
    */
   this.d=Colors.getrandomcolor();	   
}
/**
 * allow to see attribut
 * @return attribut
 */
public static Namecolor geta(){
	return a;
}
/**
 * allow to see attribut
 * @return attribut
 */
public static Namecolor getb(){
	return b;
}
/**
 * allow to see attribut
 * @return attribut
 */
public static Namecolor getc(){
	return c;
}
/**
 * allow to see attribut
 * @return attribut
 */
public static Namecolor getd(){
	return d;
}
}
