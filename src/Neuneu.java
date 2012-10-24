/**
 * 1 oct. 2012
 *TP_lofteurs	 
 */

/**
 * @author Nora
 *Pour le moment tous les param�tres de la classe sont d�finis; les m�thodes restent � faire
 */
public abstract class Neuneu {

	/**
	 * @param energieNeuneu
	 * @param position
	 * @param estExclu
	 * @param besoinEnergetique
	 * @param loft
	 */
	protected int energieNeuneu;
	protected Case position;
	protected boolean estExclu; //bool�en qui permet d'affirmer si le Neuneu est encore dans le loft ou non
	protected int besoinEnergetique;
	protected Loft loft;
	/**
	 * @param energieNeuneu
	 * @param position
	 * @param estExclu
	 * @param besoinEnergetique
	 * @param loft
	 */
	
	
	//constructeur ci-dessous
	
	public Neuneu(int energieNeuneu, Case position, boolean estExclu,
			int besoinEnergetique, Loft loft) {
		this.energieNeuneu = energieNeuneu;
		this.position = position;
		this.estExclu = estExclu;
		this.besoinEnergetique = besoinEnergetique;
		this.loft = loft;
	}
	
	public abstract void seDeplacer();
	
	public abstract void manger();
	
	public abstract Neuneu seReproduire();
	
	public abstract void afficherNeuneu();
	

	
	
}

