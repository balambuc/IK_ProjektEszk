package hu.elte.pos.controller;

import hu.elte.pos.model.WaiterModel;

import java.util.ArrayList;

public class WaiterController {

    private ArrayList<WaiterModel> waiterList= new ArrayList<>();

    public WaiterController(){}

    public void addWaiter(int age, String name, String id){
        waiterList.add(new WaiterModel(name, age, id));
    }

    public WaiterModel getWaiter(int index){
        return waiterList.get(index);
    }

    public void removeWaiter(int index){
        waiterList.remove(index);
    }

    public int getNumberOfWaiters(){
        return waiterList.size();
    }

}
