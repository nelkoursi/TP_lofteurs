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
		// TODO Stub du constructeur g�n�r� automatiquement
	}

	public Neuneu seReproduire(){
		return null; //� d�finir suivant la fa�on dont on �crit la fonction; en revanche, le retour DOIT �tre un Neuneu
	}
}
