/**
 * 21 oct. 2012
 *TP_lofteurs	 
 */

/**
 * @author Nora
 *
 */
public class Nourriture {

	
	/**
	 *@param valeurEnergetique
	 */
	protected int valeurEnergetique;
	
	/**
	 *@param estConsomme
	 */
	protected boolean estConsomme;
	
	/* *
	 * @param position
	 */
	protected Case position;
	
	/**
	 *@param idNourriture 
	 */
	protected int idNourriture;
	
	
	//constructeur ci-dessous :
	
	
	/**
	 * @param valeurEnergetique
	 * @param estConsomme
	 * @param position
	 * @param idNourriture
	 */
	public Nourriture(int valeurEnergetique, boolean estConsomme,
			Case position, int idNourriture) {
		this.valeurEnergetique = valeurEnergetique;
		this.estConsomme = estConsomme;
		this.position = position;
		this.idNourriture = idNourriture;
	}


	/**
	 * @return le valeurEnergetique
	 */
	public int getValeurEnergetique() {
		return valeurEnergetique;
	}


	/**
	 * @param valeurEnergetique le valeurEnergetique à définir
	 */
	public void setValeurEnergetique(int valeurEnergetique) {
		this.valeurEnergetique = valeurEnergetique;
	}


	/**
	 * @return le idNourriture
	 */
	public int getIdNourriture() {
		return idNourriture;
	}


	/**
	 * @param idNourriture le idNourriture à définir
	 */
	public void setIdNourriture(int idNourriture) {
		this.idNourriture = idNourriture;
	}
	
	
	public void afficherNourriture(){
		
	}

	
	
	
}
