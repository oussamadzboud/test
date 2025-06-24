

package model;
import org.junit.Test;
import static org.junit.Assert.*;

public class produitTest {
  @Test
    public void testPrixTotal() {
     
        System.out.println("Test de la méthode prix_total");
   produit p = new produit("", 500, 4);
 int expResult = 2000;
int result = p.prix_total(500, 4);
assertEquals(expResult, result);
    }
}