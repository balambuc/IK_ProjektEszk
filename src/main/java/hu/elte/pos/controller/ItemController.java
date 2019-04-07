package hu.elte.pos.controller;

import hu.elte.pos.model.ItemModel;

import java.util.ArrayList;

public class ItemController {

    private ArrayList<ItemModel> items;

    public ItemController(){}

    public void addItem(int cost, String name){
        items.add(new ItemModel(cost, name));
    }

    public void removeItem(int index){
        items.remove(index);
    }
    public void removeItem(Object o){
        items.remove(o);
    }

    public ItemModel getItem(int index){
        return items.get(index);
    }


}
