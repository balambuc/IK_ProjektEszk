package hu.elte.pos.model;

import java.util.ArrayList;

public class TableModel {

    private ArrayList<ItemModel> itemList;
    private int totalCostOfTable=0;
    private int tableNumber;
    private static int numberOfTables=1;
    private WaiterModel waiter;

    public TableModel(){
        this.tableNumber= TableModel.numberOfTables;
        TableModel.numberOfTables++;
    }

    public ArrayList<ItemModel> getItems(){
        return this.itemList;
    }

    public void addItem(ItemModel item){
        itemList.add(item);
        totalCostOfTable += item.getCost();
    }

    public ItemModel getItem(int index){
        return itemList.get(index);
    }

    public void removeItem(int index){
        totalCostOfTable -= itemList.get(index).getCost();
        itemList.remove(index);
    }

    public int getTotalCostOfTable(){
        return totalCostOfTable;
    }

    public int getTableNumber(){
        return this.tableNumber;
    }

    public void cleanTable(){
        itemList.clear();
        totalCostOfTable=0;
    }

    public void setWaiter(WaiterModel waiter){
        this.waiter = waiter;
    }

    public WaiterModel getWaiter(){
        return this.waiter;
    }
}
