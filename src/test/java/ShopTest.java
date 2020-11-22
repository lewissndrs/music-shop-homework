import instruments.Condition;
import instruments.Guitar;
import instruments.Keyboard;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    private Shop shop;
    private Guitar guitar;
    private Keyboard keyboard;

    @Before
    public void before(){
        shop = new Shop(10.0);
        guitar = new Guitar(Condition.EXCELLENT,true,false,"Fender","Telecaster","Olympic White","electric guitar",6,"maple",330.00,499.00);
        keyboard = new Keyboard(Condition.GOOD,false,true,"Korg","Minilogue","silver","polyphonic synthesiser",41,310.0,499.0);
    }

    @Test
    public void canAddISell(){
        shop.addStock(guitar);
        assertEquals(1,shop.getStockList().size());
    }

    @Test
    public void canRemoveISell(){
        shop.addStock(keyboard);
        shop.removeStock(keyboard);
        assertEquals(0,shop.getStockList().size());
    }

    @Test
    public void hasTill(){
        assertEquals(10.00,shop.getTill(),0.01);
    }

    @Test
    public void canSellItem(){
        shop.addStock(guitar);
        shop.sellItem(guitar);
        assertEquals(509.0,shop.getTill(),0.01);
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        shop.addStock(guitar);
        shop.addStock(keyboard);
        assertEquals(358.00,shop.calculateTotalPotentialProfit(),0.01);
    }

    @Test
    public void canCalculateAverageMarkup(){
        shop.addStock(guitar);
        shop.addStock(keyboard);
        assertEquals(0.56,shop.calculateAverageMarkup(),0.01);
    }
}
