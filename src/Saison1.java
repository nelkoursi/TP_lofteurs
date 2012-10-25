

/*
 * Quelques remarques sur cette classe :
 *  les Lapins ne sont pas d�finis
 *  on peut am�liorer en laissant � l'utilisateur le choix de la taille du Loft 
 *  (pas tr�s dur avec un Scanner en d�but de saison et un param�tre choisi !)
 *  On peut ajouter des m�thodes au Loft (ce script montre bien qu'il nous manque notamment une m�thode pour que
 *  le Loft se remplisse ;) )
 *  Revoir les param�tres du Loft : l� o� on parle de m�thode "affichage", l� l'affichage du Loft est g�r� en param�tre
 *  
 *  
 */

public class Saison1 {

	public static int nombreLofteurs = 4;
	public static int tailleLoft = 30;
	public static float proportionErratique = .75f;
	public static float proportionVorace = .25f;
	public static float proportionCannibale = 0f;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Saison1().primeTime();
	}
	
	public void primeTime() {
		ZoneGraphique zone = new ZoneGraphique("Mon premier loft");
		Loft loft = new Loft(tailleLoft,zone);
		loft.remplissageAleatoire(0.1f);
		zone.ajouterObjet(loft);
		
		for (int i=0 ; i<nombreLofteurs ; i++) {
			double x = Math.random();
			if (x<proportionVorace) {
				loft.add(new Vorace(loft,
						(int)(Math.random()*29),
						(int)(Math.random()*29),
						3));
			}
			else {
				x -= proportionVorace;
				if (x<proportionErratique) {
					loft.add(new Erratique(loft,
							(int)(Math.random()*29),
							(int)(Math.random()*29)));
				}
				else {
					x -= proportionErratique;
					if (x<proportionCannibale) {
						loft.add(new Cannibale(loft,
						(int)(Math.random()*29),
						(int)(Math.random()*29),
						5));
					}
				}
			}
		}
		
		loft.go();
	}

}
