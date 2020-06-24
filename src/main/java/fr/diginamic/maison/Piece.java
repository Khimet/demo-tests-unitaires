package fr.diginamic.maison;

/** Représente la pièce d'une maison
 * @author Khalil HIMET
 *
 */
public abstract class Piece {
	
	/** superficie de la pièce */
	private double superficie;
	/** numéro de l'étage dans lequel se trouve la pièce */
	private int etage;
	
	/** Constructeur
	 * @param superficie superficie de la pièce
	 * @param numEtage numéro de l'étage
	 */
	public Piece(double superficie, int etage) {
		super();
		// Vérification que la superficie entré soit bien positive
		// Si cette condition n'est pas respecté l'objet Piece ne sera pas instancié ou sera null
		if (superficie > 0) {
			this.superficie = superficie;
			this.etage = etage;
		}
		
	}

	/** Getter
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/** Setter
	 * @param superficie superficie
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/** Getter
	 * @return etage
	 */
	public int getEtage() {
		return etage;
	}

	/** Setter
	 * @param etage etage
	 */
	public void setEtage(int etage) {
		this.etage = etage;
	}
	
	
	
	
	
	

}
