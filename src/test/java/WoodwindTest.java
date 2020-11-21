import instruments.Condition;
import instruments.Woodwind;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WoodwindTest {

    private Woodwind woodwind;

    @Before
    public void before(){
        woodwind = new Woodwind(Condition.OKAY,true,true,"Selmer","MK IV","brass","tenor saxophone","synthetic",330.0,499.0);
    }

    @Test
    public void hasCondition(){
        assertEquals(Condition.OKAY,woodwind.getCondition());
    }

    @Test
    public void isSecondHand(){
        assertEquals(true,woodwind.isSecondHand());
    }

    @Test
    public void isOnDisplay(){
        assertEquals(true,woodwind.isOnDisplay());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Selmer",woodwind.getManufacturer());
    }

    @Test
    public void hasModel(){
        assertEquals("MK IV",woodwind.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("brass",woodwind.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("tenor saxophone",woodwind.getWoodwindType());
    }

    @Test
    public void hasReed(){
        assertEquals("synthetic",woodwind.getReed());
    }

    @Test
    public void hasPlay(){
        assertEquals("DOOT",woodwind.play());
    }

    @Test
    public void hasBakerStreet(){
        assertEquals("OH BOY, THAT'S SEXY",woodwind.bakerStreet());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(330.00,woodwind.getBuyPrice(),0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(499.00,woodwind.getSellPrice(),0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(0.51,woodwind.CalculateMarkup(),0.01);
    }
}
