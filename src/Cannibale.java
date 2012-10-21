/**
 * 21 oct. 2012
 *TP_lofteurs	 
 */

/**
 * @author Nora
 *
 */
public abstract class Cannibale extends Vorace {

	/**
	 * @param energieNeuneu
	 * @param position
	 * @param estExclu
	 * @param besoinEnergetique
	 * @param loft
	 */
	public Cannibale(int energieNeuneu, Case position, boolean estExclu,
			int besoinEnergetique, Loft loft) {
		super(energieNeuneu, position, estExclu, besoinEnergetique, loft);
		// TODO Stub du constructeur généré automatiquement
	}

	public void manger(){
		//definir le manger du cannibale
	}
}
