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
	private Namecolor a; 
	/**
	 * second ball of ia
	 */
	private Namecolor b; 
	/**
	 * third ball of ia
	 */
	private Namecolor c;
	/**
	 * fourth ball of ia
	 */
	private Namecolor d; 
	/**
	 * first ball of player
	 */
	private Namecolor e; 
	/**
	 * second ball player
	 */
	private Namecolor f; 
	/**
	 * third ball of player
	 */
	private Namecolor g;
	/**
	 * fourth ball of player
	 */
	private Namecolor h; 
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
 * creation of new combinaison
 * @param A first color
 * @param B second
 * @param C  third
 * @param D fourth
 */
public Combinaison(Namecolor A,Namecolor B,Namecolor C,Namecolor D){
	this.e=A;
	this.f=B;
	this.g=C;
	this.h=D;
}
/**
 * allow to see attribut
 * @return attribut
 */
public Namecolor geta(){
	return this.a;
}
/**
 * allow to see attribut
 * @return attribut
 */
public Namecolor getb(){
	return this.b;
}
/**
 * allow to see attribut
 * @return attribut
 */
public Namecolor getc(){
	return this.c;
}
/**
 * allow to see attribut
 * @return attribut
 */
public Namecolor getd(){
	return this.d;
}
/**
 * allow to see attribut
 * @return attribut
 */
public Namecolor gete(){
	return this.e;
}
/**
 * allow to see attribut
 * @return attribut
 */
public Namecolor getf(){
	return this.f;
}
/**
 * allow to see attribut
 * @return attribut
 */
public Namecolor getg(){
	return this.g;
}
/**
 * allow to see attribut
 * @return attribut
 */
public Namecolor geth(){
	return this.h;
}
}