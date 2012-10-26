/**
 * 21 oct. 2012
 *TP_lofteurs	 
 */

/**
 * @author Nora
 *
 */
public class Erratique extends Neuneu {

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
		
		Neuneu neuneuANaitre = null;
		Neuneu neuneuPapa = null;
		Neuneu neuneuMaman = null;
		
		if (neuneuPapa.getPosition().equals(neuneuMaman.getPosition())){
			loft.ajouterNeuneu(neuneuANaitre);
			neuneuANaitre.getPosition().equals(neuneuMaman.getPosition()); // le nouveau n� est sur la case des parents :3
		}
		
		return neuneuANaitre;
	
	}

}
