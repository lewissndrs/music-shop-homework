import instruments.Condition;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(Condition.EXCELLENT,true,false,"Fender","Telecaster","Olympic White","electric guitar",6,"maple",330.00,499.00);
    }

   @Test
    public void hasCondition(){
        assertEquals(Condition.EXCELLENT,guitar.getCondition());
   }

   @Test
    public void isSecondHand(){
        assertEquals(true,guitar.isSecondHand());
   }

   @Test
    public void isOnDisplay(){
        assertEquals(false,guitar.isOnDisplay());
   }

   @Test
    public void hasManufacturer(){
        assertEquals("Fender",guitar.getManufacturer());
   }

   @Test
    public void hasModel(){
        assertEquals("Telecaster",guitar.getModel());
   }

   @Test
    public void hasColour(){
        assertEquals("Olympic White",guitar.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("electric guitar",guitar.getGuitarType());
    }

    @Test
    public void hasStrings(){
        assertEquals(6,guitar.getStrings());
    }

    @Test
    public void hasFretboardMaterial(){
        assertEquals("maple",guitar.getFretboardMaterial());
    }

    @Test
    public void hasPlay(){
        assertEquals("TWANG",guitar.play());
    }

    @Test
    public void hasStairway(){
        assertEquals("NO STAIRWAY! DENIED!",guitar.stairway());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(330.00,guitar.getBuyPrice(),0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(499.00,guitar.getSellPrice(),0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(0.51,guitar.CalculateMarkup(),0.01);
    }
}

