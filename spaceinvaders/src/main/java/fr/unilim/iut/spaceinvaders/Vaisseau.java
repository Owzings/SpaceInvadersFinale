package fr.unilim.iut.spaceinvaders;

public class Vaisseau {

    int x;
    int y;
    int longueur;
    int hauteur;

    public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}

    public Vaisseau(int longueur, int hauteur, int x, int y) {
	   this.longueur=longueur;
	   this.hauteur=hauteur;
	   this.x = x;
	   this.y = y;
    }

	public boolean occupeLaPosition(int x, int y) {
		return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
	}

	public boolean estOrdonneeCouverte(int y) {
		return ordonneeLaPlusBasse(y) && ordonneeLaPlusHaute(y);
	}

	public boolean ordonneeLaPlusHaute(int y) {
		return y <= this.y;
	}

	public boolean ordonneeLaPlusBasse(int y) {
		return this.y - this.hauteur + 1 <= y;
	}

	public boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche() <= x) && (x <= abscisseLaPlusADroite());
	}
    public void positionner(int x, int y) {
	    this.x = x;
	    this.y = y;
    }

	public void seDeplacerVersLaDroite() {
		this.x = this.x + 1 ;
		
	}
	public int abscisseLaPlusAGauche() {
        return this.x;
	}

	public void seDeplacerVersLaGauche() {
		this.x = this.x-1;
		
	}

	public int abscisseLaPlusADroite() {
		return this.x;
	}

}
