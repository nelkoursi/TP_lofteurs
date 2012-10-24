/**
 * 21 oct. 2012
 *TP_lofteurs	 
 */

/**
 * @author Nora
 *
 */

import java.util.*;

public class Loft {

	/**
	 * @param args
	 */

	protected int nbCasesHorizontales;
	protected int nbCasesVerticales;
	protected int nbLofteurs;
	protected int temps;
	protected LinkedList<Neuneu> listeLofteur;
	
	
	//constructeur ci-dessous :
	
	
	/**
	 * @param nbCasesHorizontales
	 * @param nbCasesVerticales
	 * @param nbLofteurs
	 * @param temps
	 * @param listeLofteur
	 */
	public Loft(int nbCasesHorizontales, int nbCasesVerticales, int nbLofteurs,
			int temps, LinkedList<Neuneu> listeLofteur) {
		super();
		this.nbCasesHorizontales = nbCasesHorizontales;
		this.nbCasesVerticales = nbCasesVerticales;
		this.nbLofteurs = nbLofteurs;
		this.temps = temps;
		this.listeLofteur = listeLofteur;
	}
	
	
	/**
	 * @return le nbCasesHorizontales
	 */
	public int getNbCasesHorizontales() {
		return nbCasesHorizontales;
	}
	/**
	 * @param nbCasesHorizontales le nbCasesHorizontales à définir
	 */
	public void setNbCasesHorizontales(int nbCasesHorizontales) {
		this.nbCasesHorizontales = nbCasesHorizontales;
	}
	/**
	 * @return le nbCasesVerticales
	 */
	public int getNbCasesVerticales() {
		return nbCasesVerticales;
	}
	/**
	 * @param nbCasesVerticales le nbCasesVerticales à définir
	 */
	public void setNbCasesVerticales(int nbCasesVerticales) {
		this.nbCasesVerticales = nbCasesVerticales;
	}
	/**
	 * @return le nbLofteurs
	 */
	public int getNbLofteurs() {
		return nbLofteurs;
	}
	/**
	 * @param nbLofteurs le nbLofteurs à définir
	 */
	public void setNbLofteurs(int nbLofteurs) {
		this.nbLofteurs = nbLofteurs;
	}
	/**
	 * @return le temps
	 */
	public int getTemps() {
		return temps;
	}
	/**
	 * @param temps le temps à définir
	 */
	public void setTemps(int temps) {
		this.temps = temps;
	}
	/**
	 * @return le listeLofteur
	 */
	public LinkedList<Neuneu> getListeLofteur() {
		return listeLofteur;
	}
	/**
	 * @param listeLofteur le listeLofteur à définir
	 */
	public void setListeLofteur(LinkedList<Neuneu> listeLofteur) {
		this.listeLofteur = listeLofteur;
	}

	
	public void exclure(Neuneu neuneuExclu){ 	//Neuneu en paramètre pour l'enlever de la LinkedList 
		
		listeLofteur.remove(neuneuExclu);
		nbLofteurs = nbLofteurs --;
		System.out.println ("Il reste donc " + nbLofteurs + " neuneus dans le Loft !");
		
	}
	
		
}
