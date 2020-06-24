package dev.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import org.junit.rules.ExpectedException;

import dev.exceptions.NullException;


/** Test de la classe StringUtils
 * @author Khalil HIMET
 *
 */
public class StringUtilsTest {
	
	/** Test la distance de levenshtein entre les mots "java" et "jva".
	 * Résultat attendu: la distance doit être égale à 1.
	 * @throws NullException
	 */
	@Test
	public void testLevenshteinDistance_java_et_jva() throws NullException {
		
		int resultat = StringUtils.levenshteinDistance("java", "jva");
		
		assertEquals(1, resultat);
	}
	
	/** Test la distance de levenshtein entre les mots "java" et "jva".
	 * Résultat attendu: la distance doit être égale à 1
	 * @throws NullException
	 */
	@Test
	public void testLevenshteinDistance_java_et_Java() throws NullException {
		
		int resultat = StringUtils.levenshteinDistance("Java", "java");
		
		assertEquals(1, resultat);
	}
	
	/** Test la distance de levenshtein entre deux objets null
	 * Résultat attendu: cette distance ne peut pas être calculée et l'exception NullException doit être jetée
	 * @throws NullException
	 */
	@Test(expected = NullException.class)
	public void testLevenshteinDistance_null_et_null() throws NullException {
		
		int resultat = StringUtils.levenshteinDistance(null, null);
		assertEquals(0, resultat);
		
		
	}

}
