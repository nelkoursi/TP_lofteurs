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
	  * @param ordonn�e du point
	  */
	
	protected int ordonnee;
	
	/**
	 * 
	 * @param un bool�en : 
	 * 1 si un Neuneu est sur la case
	 * 0 sinon.
	 */
	protected boolean contientNeuneu;
	
	/**
	 * 
	 * @arg un bool�en :
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
	 * @param abscisse abscisse � d�finir
	 */
	public void setAbscisse(int abscisse) {
		this.abscisse = abscisse;
	}


	/**
	 * @return ordonn�e
	 */
	public int getOrdonnee() {
		return ordonnee;
	}


	/**
	 * @param ordonn�e ordonn�e � d�finir
	 */
	public void setOrdonnee(int ordonnee) {
		this.ordonnee = ordonnee;
	}


	
	
	public static void main(String[] args) {
		// TODO Stub de la m�thode g�n�r� automatiquement

	}

}
