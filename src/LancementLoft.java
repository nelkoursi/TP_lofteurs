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
		
	}

}
