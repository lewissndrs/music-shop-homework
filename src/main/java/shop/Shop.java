package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stockList;
    private double till;

    public Shop(double till) {
        this.stockList = new ArrayList<ISell>();
        this.till = till;
    }

    public ArrayList<ISell> getStockList() {
        return stockList;
    }

    public double getTill() {
        return till;
    }

    public void addStock(ISell newStock){
        this.stockList.add(newStock);
    }

    public ISell removeStock(ISell item){
        int index = this.stockList.indexOf(item);
        return this.stockList.remove(index);
    }

    public void sellItem(ISell item){
        till += item.getSellPrice();
        removeStock(item);
    }

    public double calculateTotalPotentialProfit(){
        double totalProfit = stockList
                .stream()
                .map(item -> (item.getSellPrice() - item.getBuyPrice()))
                .reduce(0.0, (sum,profit) -> sum += profit);
        return totalProfit;
    }

    public double calculateAverageMarkup(){
        return stockList
                .stream()
                .mapToDouble(ISell::CalculateMarkup)
                .average().getAsDouble();
    }
}
