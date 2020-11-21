import instruments.Condition;
import instruments.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    private Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard(Condition.GOOD,false,true,"Korg","Minilogue","silver","polyphonic synthesiser",41,310.0,499.0);
    }

    @Test
    public void hasCondition(){
        assertEquals(Condition.GOOD,keyboard.getCondition());
    }

    @Test
    public void isSecondHand(){
        assertEquals(false,keyboard.isSecondHand());
    }

    @Test
    public void isOnDisplay(){
        assertEquals(true,keyboard.isOnDisplay());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Korg",keyboard.getManufacturer());
    }

    @Test
    public void hasModel(){
        assertEquals("Minilogue",keyboard.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("silver",keyboard.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("polyphonic synthesiser",keyboard.getKeyboardType());
    }

    @Test
    public void hasKeys(){
        assertEquals(41,keyboard.getKeys());
    }

    @Test
    public void hasPlay(){
        assertEquals("plink plonk",keyboard.play());
    }

    @Test
    public void hasBohemianRhapsody(){
        assertEquals("Hi, could you kindly please stop playing that song and never go near a keyboard again?",keyboard.bohemianRhapsody());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(310.00,keyboard.getBuyPrice(),0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(499.00,keyboard.getSellPrice(),0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(0.61,keyboard.CalculateMarkup(),0.01);
    }
}
