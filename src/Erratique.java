/**
 * 21 oct. 2012
 *TP_lofteurs	 
 */

/**
 * @author Nora
 *
 */
public abstract class Erratique extends Neuneu {

	/**
	 * @param energieNeuneu
	 * @param position
	 * @param estExclu
	 * @param besoinEnergetique
	 * @param loft
	 */
	public Erratique(int energieNeuneu, Case position, boolean estExclu,
			int besoinEnergetique, Loft loft) {
		super(energieNeuneu, position, estExclu, besoinEnergetique, loft);
		// TODO Stub du constructeur g�n�r� automatiquement
	}
	
	public void seDeplacer(){
		//ici, entrer les conditions de d�placement de l'erratique
	}
	
	public Neuneu seReproduire(){
		return null; //modifier le retour pour un param�tre de type Neuneu une fois la fonction bien d�finie
	
		//ici, entrer les conditions de reproduction d'un erratique
	
	}

}
