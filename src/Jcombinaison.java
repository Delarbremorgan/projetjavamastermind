import java.util.Scanner;
public class Jcombinaison extends Combinaison {
	Scanner sa = new Scanner(System.in);
	Scanner sb = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);
	Scanner sd = new Scanner(System.in);
     public Jcombinaison(){
    	 System.out.println("1ere boule saisir 1 pour bleu ou 2 pour rouge ou 3 pour jaune ou 4 pour vert ou 5 pour rose ou 6 pour orange ou 7 pour violet");
    	 
         int sta = sa.nextInt();
    	 if (sta==1) this.a=Namecolor.BLUE;
    	 if (sta==2) this.a=Namecolor.RED;
    	 if (sta==3) this.a=Namecolor.YELLOW;
    	 if (sta==4) this.a=Namecolor.GREEN;
    	 if (sta==5) this.a=Namecolor.PINK;
    	 if (sta==6) this.a=Namecolor.ORANGE;
    	 if (sta==7) this.a=Namecolor.PURPLE;
    	 System.out.println("2eme boule saisir 1 pour bleu ou 2 pour rouge ou 3 pour jaune ou 4 pour vert ou 5 pour rose ou 6 pour orange ou 7 pour violet");
    	 
         int stb = sb.nextInt();
         if (stb==1) this.b=Namecolor.BLUE;
    	 if (stb==2) this.b=Namecolor.RED;
    	 if (stb==3) this.b=Namecolor.YELLOW;
    	 if (stb==4) this.b=Namecolor.GREEN;
    	 if (stb==5) this.b=Namecolor.PINK;
    	 if (stb==6) this.b=Namecolor.ORANGE;
    	 if (stb==7) this.b=Namecolor.PURPLE;
    	 System.out.println("3eme boule saisir 1 pour bleu ou 2 pour rouge ou 3 pour jaune ou 4 pour vert ou 5 pour rose ou 6 pour orange ou 7 pour violet");
    	 
         int stc = sc.nextInt();
         if (stc==1) this.c=Namecolor.BLUE;
    	 if (stc==2) this.c=Namecolor.RED;
    	 if (stc==3) this.c=Namecolor.YELLOW;
    	 if (stc==4) this.c=Namecolor.GREEN;
    	 if (stc==5) this.c=Namecolor.PINK;
    	 if (stc==6) this.c=Namecolor.ORANGE;
    	 if (stc==7) this.c=Namecolor.PURPLE;
    	 System.out.println("4eme boule saisir 1 pour bleu ou 2 pour rouge ou 3 pour jaune ou 4 pour vert ou 5 pour rose ou 6 pour orange ou 7 pour violet");
    	
         int std = sd.nextInt();
         if (std==1) this.d=Namecolor.BLUE;
    	 if (std==2) this.d=Namecolor.RED;
    	 if (std==3) this.d=Namecolor.YELLOW;
    	 if (std==4) this.d=Namecolor.GREEN;
    	 if (std==5) this.d=Namecolor.PINK;
    	 if (std==6) this.d=Namecolor.ORANGE;
    	 if (std==7) this.d=Namecolor.PURPLE; 
     }
    
}
