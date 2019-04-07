package hu.elte.pos.controller;

import hu.elte.pos.model.TableModel;

import java.util.ArrayList;

public class TableController {

    private ArrayList<TableModel> tables = new ArrayList<>();

    public TableController(){}


    public void addTable(){
        tables.add(new TableModel());
    }

    public void removeTable(int index){
        tables.remove(index);
    }

    public void removeTable(Object o){
        tables.remove(o);
    }

    public TableModel getTable(int index){
        return tables.get(index);
    }

    public int getNumberOfTables(){
        return tables.size();
    }


}
