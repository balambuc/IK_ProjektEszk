package hu.elte.pos.model;

import java.util.ArrayList;
import hu.elte.pos.model.ItemModel;

public class TableModel {

    private ArrayList<ItemModel> itemList;

    public TableModel(){}


    public void addItem(ItemModel item){
        itemList.add(item);
    }

    public ItemModel getItem(int index){
        return itemList.get(index);
    }

    public void removeItem(int index){
        itemList.remove(index);

    }

    public int getCostOfItems(){
        int total = 0;
        for(int i = 0; i<itemList.size(); i++){
            total += itemList.get(i).getCost();
        }
        return total;
    }
}
