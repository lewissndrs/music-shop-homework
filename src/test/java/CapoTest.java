import org.junit.Before;
import org.junit.Test;
import sundries.Capo;

import static org.junit.Assert.assertEquals;

public class CapoTest {

    private Capo capo;

    @Before
    public void before(){
        capo = new Capo("Dunlop B54",9.55,15.99);
    }

    @Test
    public void hasDescription(){
        assertEquals("Dunlop B54",capo.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(9.55,capo.getBuyPrice(),0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(15.99,capo.getSellPrice(),0.01);
    }

    @Test
    public void hasGetMarkup(){
        assertEquals(0.67,capo.CalculateMarkup(),0.01);
    }
}
