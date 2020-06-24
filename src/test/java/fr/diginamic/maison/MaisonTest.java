package fr.diginamic.maison;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/** Classe de tests de la classe Maison
 * @author Khalil HIMET
 *
 */
public class MaisonTest {
	
	/** Les pièces qui vont composer la maison */
	private Piece[] pieces;
	/** La maison */
	private Maison maison;
	/** Le nombre de pièces qui composent la maison */
	private int nbPieces;
	/** Superficie d'une pièce */
	private int superficie;
	
	/** Initialisation des variables nécessaires pour les tests
	 * 
	 */
	@Before
	public void init() {
		
		// Initialisation de l'Array contenant les pièces de la maison
		pieces = new Piece[0];
		
		// Création d'une maison vide
		maison = new Maison(pieces);
		
		// Nombres de pièces qui composent la maison
		int nbPieces = pieces.length;
	}
	
	/** Test de l'ajout d'un objet Piece null dans une maison
	 * 
	 * Résultat attendu : Une pièce null n'a pas de sens et ne doit pas être ajouter parmi les pièces de la maison.
	 *
	 */
	@Test
	public void testAjouterPiece_null() {
		
		maison.ajouterPiece(null);
		
		pieces = maison.getPieces();
		
		nbPieces = pieces.length;
		
		assertEquals(0, nbPieces);	
	}
	 
	/** Test de l'ajout d'une chambre dans la maison
	 * Résultat attendu: La dernière place ajouté à la maison doit être un objet Piece de type Chambre
	 */
	@Test
	public void testAjouterPiece_Chambre() {
		
		Piece chambre = new Chambre(5, 0);
		
		maison.ajouterPiece(chambre);
		
		pieces = maison.getPieces();
		
		// Vérification si le dernier élément ajouté est un objet de la classe Chambre
		assertEquals("Ajout de chambre", chambre.getClass().getSimpleName(),
				pieces[pieces.length-1].getClass().getSimpleName());
	}
	
	/** Test l'ajout d'une Pièce dans la maison avec une superficie négative
	 * 
	 * Resultat attendu: Une pièce avec superficie négative n'aurait pas de sens. 
	 * L'ajout d'une telle pièce ne devrait pas être prise en compte. Et par conséquent,
	 * la taille du tableau contenant les pièces de la maison ne devraient pas augmenté.
	 * 
	 */
	@Test
	public void TestSuperficiePieceNegative() {
		
		Piece chambre = new Chambre(-15, 2);
		
		maison.ajouterPiece(chambre);
		
		pieces = maison.getPieces();
		
		assertEquals(0, pieces.length);
		
		
	}

}
