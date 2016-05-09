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
	public Namecolor a; 
	/**
	 * second ball of ia
	 */
	public Namecolor b; 
	/**
	 * third ball of ia
	 */
	public Namecolor c;
	/**
	 * fourth ball of ia
	 */
	public Namecolor d; 
	/**
	 * first ball of player
	 */
	public Namecolor e; 
	/**
	 * second ball player
	 */
	public Namecolor f; 
	/**
	 * third ball of player
	 */
	public Namecolor g;
	/**
	 * fourth ball of player
	 */
	public Namecolor h; 
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
/**
 * do comparaison
 * @param Un
 * @param Deux
 * @return boolean
 */
public static boolean docomp(Combinaison Un,Combinaison Deux){
	
	if(Un.a==Deux.e  && Un.b==Deux.f && Un.c==Deux.g && Un.d==Deux.h){
		System.out.println("4 pion blanc");
	 return true;
	}
	else{
		int blanc = 0;
		int noir = 0;
		if(Un.a==Deux.e) blanc=blanc+1;
		if(Un.a==Deux.f && Un.b==Deux.f ){}
		else{if(Un.a==Deux.f)noir=noir+1;};
		if(Un.a==Deux.g && Un.c==Deux.g){}
		else{if(Un.a==Deux.g)noir=noir+1;};
		if(Un.a==Deux.h && Un.d==Deux.h){} 
		else{if(Un.a==Deux.h)noir=noir+1;};
		if(Un.b==Deux.e && Un.a==Deux.e){}
		else{if(Un.b==Deux.e)noir=noir+1;};
		if(Un.b==Deux.f) blanc=blanc+1;
		if(Un.b==Deux.g && Un.c==Deux.g){}
		else{if(Un.b==Deux.g)noir=noir+1;};
		if(Un.b==Deux.h && Un.d==Deux.h){}
		else{if(Un.b==Deux.h)noir=noir+1;};
		if(Un.c==Deux.e && Un.a==Deux.e){}
		else {if(Un.c==Deux.e)noir=noir+1;};
		if(Un.c==Deux.f && Un.b==Deux.f){}
		else{if(Un.c==Deux.f)noir=noir+1;};
		if(Un.c==Deux.g) blanc=blanc+1;
		if(Un.c==Deux.h && Un.d==Deux.h){}
		else{if(Un.c==Deux.h)noir=noir+1;};
		if(Un.d==Deux.e && Un.a==Deux.e ){}
		else{if(Un.d==Deux.e)noir=noir+1;};
		if(Un.d==Deux.f && Un.b==Deux.f){}
		else{if(Un.d==Deux.f)noir=noir+1;};
		if(Un.d==Deux.g && Un.c==Deux.g){}
		else{if(Un.d==Deux.g)noir=noir+1;};
		if(Un.d==Deux.h) blanc=blanc+1;
		System.out.println(blanc+" "+"pion blanc"+"  "+noir+" "
				+" "+"pion noir");	
	 return false;
	}
	// TODO Auto-generated method stub
	
}

}
