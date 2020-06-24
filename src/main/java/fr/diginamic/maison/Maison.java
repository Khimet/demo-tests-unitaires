package fr.diginamic.maison;

import java.util.Arrays;

/** Représente une maison avec l'ensemble de ses pièces
 * @author Khalil HIMET
 *
 */
public class Maison {
	
	/** tableau représentant les pièces de la maisons */
	private Piece[] pieces;

	/** Constructeur
	 * @param pieces pièces de la maison
	 */
	public Maison(Piece[] pieces) {
		super();
		this.pieces = pieces;
	}
	
	/** Ajoute une pièce dans le tableau qui représente la maison
	 * @param piece
	 */
	public void ajouterPiece(Piece piece) {
		
		// Si la pièce est un objet null, la pièce ne sera pas ajoutée à la maison. Elle sera considérée comme inexistante
		if (piece != null) {
			// On vérifie que la superficie de la pièce n'est pas négative, sinon une telle pièce n'aurait pas de sens
			if (piece.getSuperficie() > 0) {
				
				pieces = Arrays.copyOf(pieces, pieces.length + 1);
				
				pieces[pieces.length - 1] = piece;
				
			}
			
			
			
		}
	}

	/** Calcul la superficie totale de la maison
	 * @return (double) superficie totale de la maison
	 */
	public double superficieTotale() {
		
		double total = 0;
		
		for(Piece piece : pieces) {
			
			total += piece.getSuperficie();
		}
		
		return total;
	}
	
	/** Calcul la superficie pour un étage donnée de la maison
	 * @param numEtage numero d'étage de la maison
	 * @return (double) superficie de l'étage
	 */
	public double superficieEtage(int numEtage) {
		
		double total = 0;
		
		for (Piece piece : pieces) {
			
			if (piece.getEtage() == numEtage) {
				
				total += piece.getSuperficie();
			}
		}
		
		return total;
	}
	
	/** Calcul la superficie global pour un type de pièce donné
	 * @param piece une pièce de la maison
	 * @return (double) superficie global pour ce type de pièce donné
	 */
	public double superficiePieces(Piece piece) {
		
		String type = piece.getClass().getSimpleName();
		
		double total = 0;
		
		for(Piece p : pieces) {
			
			if (p.getClass().getSimpleName() == type) {
				
				total += p.getSuperficie();
			}
		}
		
		return total;
	}
	
	/** Calcul le nombre de pièces pour un type de pièce donné
	 * @param piece Objet pièce d'un certain type (Chambre, Cuisine, Salon...)
	 * @return (int) le nombre de pièces du même type
	 */
	public int nbPieces(Piece piece) {
		
		String type = piece.getClass().getSimpleName();
		
		int compteur = 0;
		
		for (Piece p : pieces) {
			
			if (p.getClass().getSimpleName() == type) {
				
				compteur++;
			}
		}
		
		return compteur;
	}

	/** Getter
	 * @return the pieces
	 */
	public Piece[] getPieces() {
		return pieces;
	}

	/** Setter
	 * @param pieces the pieces to set
	 */
	public void setPieces(Piece[] pieces) {
		this.pieces = pieces;
	}

}
