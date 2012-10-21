/**
 * 21 oct. 2012
 *TP_lofteurs	 
 */

/**
 * @author Nora
 *
 */
public abstract class Lapin extends Erratique {

	/**
	 * @param energieNeuneu
	 * @param position
	 * @param estExclu
	 * @param besoinEnergetique
	 * @param loft
	 */
	public Lapin(int energieNeuneu, Case position, boolean estExclu,
			int besoinEnergetique, Loft loft) {
		super(energieNeuneu, position, estExclu, besoinEnergetique, loft);
		// TODO Stub du constructeur généré automatiquement
	}

	public Neuneu seReproduire(){
		return null; //à définir suivant la façon dont on écrit la fonction; en revanche, le retour DOIT être un Neuneu
	}
}
