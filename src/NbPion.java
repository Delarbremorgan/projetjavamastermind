
public class NbPion
{
private int Pionblanc;
private int Pionnoir;
public NbPion()
{
	this.Pionblanc = 0;
	this.Pionnoir = 0;
}
public void addpionblanc()
{
	// TODO Auto-generated method stub
	this.Pionblanc=this.Pionblanc+1;
}
public void getPion()
{
	// TODO Auto-generated method stub
	System.out.println("Pion blanc"+this.Pionblanc+" "+"Pion noir :"+this.Pionnoir);
}
public void addpionnoir()
{
	// TODO Auto-generated method stub
	this.Pionnoir=this.Pionnoir+1;
}

}
