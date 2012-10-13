/**
 * 1 oct. 2012
 *TP_lofteurs	 
 */

/**
 * @author Nora
 *
 */
public class Case {

	/**
	 * @param abscisse du point
	 */
	
	protected int abscisse;
	
	
	/**
	  * 
	  * @param ordonnée du point
	  */
	
	protected int ordonnee;
	
	/**
	 * 
	 * @param un booléen : 
	 * 1 si un Neuneu est sur la case
	 * 0 sinon.
	 */
	protected boolean contientNeuneu;
	
	/**
	 * 
	 * @arg un booléen :
	 * 1 si de la nourriture est sur la case,
	 * 0 sinon.
	 */
	
	/**
	 * 
	 * @param idNourriture : entier qui identifie le type de nourriture sur la case
	 */
	
	protected int idNourriture;
	
	
	/**
	 * @return abscisse
	 */
	public int getAbscisse() {
		return abscisse;
	}


	/**
	 * @param abscisse abscisse à définir
	 */
	public void setAbscisse(int abscisse) {
		this.abscisse = abscisse;
	}


	/**
	 * @return ordonnée
	 */
	public int getOrdonnee() {
		return ordonnee;
	}


	/**
	 * @param ordonnée ordonnée à définir
	 */
	public void setOrdonnee(int ordonnee) {
		this.ordonnee = ordonnee;
	}


	
	
	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement

	}

}
