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
	
	protected boolean contientNourriture;
	
	/**
	 * 
	 * @param idNourriture : entier qui identifie le type de nourriture sur la case
	 */
	
	protected int idNourriture;
	
	//Constructeur ci-dessous
	
	
	/**
	 * @param abscisse
	 * @param ordonnee
	 * @param contientNeuneu
	 * @param idNourriture
	 */
	public Case(int abscisse, int ordonnee, boolean contientNeuneu,
			int idNourriture) {
		super();
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
		this.contientNeuneu = contientNeuneu;
		this.idNourriture = idNourriture;
	}


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


	/**
	 *  @return type de nourriture (int)
	 */
	public int lireTypeNourriture(){
		//on aura une boucle qui lira l'identifiant de la nourriture
		
		return idNourriture;
	}
	

}
