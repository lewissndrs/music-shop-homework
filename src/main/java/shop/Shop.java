package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stockList;

    public Shop() {
        this.stockList = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStockList() {
        return stockList;
    }

    public void addStock(ISell newStock){
        this.stockList.add(newStock);
    }

    public ISell removeStock(ISell item){
        int index = this.stockList.indexOf(item);
        return this.stockList.remove(index);
    }
}
