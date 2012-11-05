import java.util.LinkedList;

/**
 * 25 oct. 2012
 *TP_lofteurs	 
 */

/**
 * @author Nora
 *
 */
public class LancementLoft {
	
	public static int nombreLofteurs = 10;
	public static int tailleLoftHorizontal = 30;
	public static int tailleLoftVertical = 30;
	public static int tempsLoft;
	public LinkedList<Neuneu> listeLofteur;
	public static float proportionErratique = .60f;
	public static float proportionVorace = .20f;
	public static float proportionLapin = .20f;
	public static float proportionCannibale = 20f;
	/**
	 * @param args
	*/		
	
	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement
		new LancementLoft().primetime();
		}
	
	public void primetime(){
		ZoneGraphique zone = new ZoneGraphique("Un documentaire animalier sur les Neuneus");
		Loft loft = new Loft(tailleLoftHorizontal, tailleLoftVertical, nombreLofteurs, tempsLoft, listeLofteur);
		loft.remplirLoft();
		zone.ajouterObjet(loft);
		
		//ajout des Voraces de façon aléatoire
		for (int i=0; i< nombreLofteurs; i++){
			double x = Math.random();
			int energieVorace;
			if (x < proportionVorace){
				int absVorace = (int) (Math.random());
				int ordVorace = (int) (Math.random());
				Case positionVorace1 = new Case(absVorace, ordVorace, true, 0);
				boolean estExcluVorace;
				int besoinVorace;
				Vorace nouveauVorace = new Vorace(energieVorace, positionVorace1, estExcluVorace, besoinVorace, loft);
				loft.getListeLofteur().add(nouveauVorace);
			}
			else {
				x -= proportionVorace;
				if (x< proportionErratique){
					int absErratique= (int) (Math.random());
					int ordErratique = (int) (Math.random());
					Case positionErratique= new Case(absErratique, ordErratique, true, 0);
					boolean estExcluErratique;
					int energieErratique;
					int besoinErratique;
					Erratique nouveauErratique= new Erratique(energieErratique, positionErratique, estExcluErratique, besoinErratique, loft);
					loft.getListeLofteur().add(nouveauErratique);
				}
				
				else{
					x -= proportionErratique;
					if (x< proportionCannibale){
					int absCannibale= (int) (Math.random());
					int ordCannibale = (int) (Math.random());
					Case positionCannibale = new Case(absCannibale, ordCannibale, true, 0);
					int energieCannibale;
					boolean estExcluCannibale;
					int besoinCannibale;
					Cannibale nouveauCannibale= new Cannibale(energieCannibale, positionCannibale, estExcluCannibale, besoinCannibale, loft);
					loft.getListeLofteur().add(nouveauCannibale);
					}
				}
			}
		}
	}
}
