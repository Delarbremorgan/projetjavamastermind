/**
 * class Nbpion
 */
public class NbPion
{
private int Pionblanc;
private int Pionnoir;
/**
 * new object Nbpion
 * @param blanc
 * @param noir
 */
public NbPion(int blanc,int noir)
{
	this.Pionblanc = blanc;
	this.Pionnoir = noir;
}
/**
 * allow to see the number of white Pawn
 * @return Pionblanc
 */
public int getPionblanc() {
	return this.Pionblanc;
}
/**
 * allow to see the number of black Pawn
 * @return Pionnoir
 */

public int getPionnoir() {
	return this.Pionnoir;
}
}


