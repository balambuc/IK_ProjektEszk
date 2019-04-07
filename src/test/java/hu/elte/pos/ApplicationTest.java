package hu.elte.pos;

import hu.elte.pos.controller.ItemController;
import hu.elte.pos.controller.TableController;
import hu.elte.pos.controller.WaiterController;
import hu.elte.pos.view.ApplicationView;

import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
//import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;



class ApplicationTest {

    TableController tc;
    WaiterController wc;
    ItemController ic;

    private FrameFixture applicationView;

    @BeforeEach
    void setUp() {
        tc = new TableController();
        wc = new WaiterController();
        ic = new ItemController();
    }

    @After
    void tearDown() {
        applicationView.cleanUp();
    }


    @Test
    void testTables(){
        tc.addTable();
        tc.addTable();
        assertTrue(tc.getTable(1).getTableNumber() == 2);
        tc.removeTable(0);
        assertTrue(tc.getNumberOfTables()==1);
    }

    @Test
    void testWaiters(){
        wc.addWaiter(26, "liza", "1234asd");
        wc.addWaiter(19, "csabi", "4567asd");

        assertTrue(wc.getWaiter(1).getName()== "csabi");
        assertTrue(wc.getNumberOfWaiters()==2);
    }

    @Test
    void testItems(){
        ic.addItem(1000, "palacsinta");
        ic.addItem(300, "kóla");
        ic.addItem(3000, "bélszín");
        boolean vanepalacsinta= false;
        for(int i = 0; i<ic.getNumberOfItems(); i++){
            if(ic.getItem(i).getName().equals("palacsinta")){
                vanepalacsinta = true;
            }
        }

        assertTrue(vanepalacsinta);
        assertTrue(ic.getNumberOfItems()==3);
    }

    @Test
    void tableAndPricesTest(){
        ic.addItem(1000, "palacsinta");
        ic.addItem(300, "kóla");
        ic.addItem(3000, "bélszín");
        tc.addTable();
        tc.addTable();
        tc.getTable(0).addItem(ic.getItem(0));
        tc.getTable(0).addItem(ic.getItem(2));
        assertTrue(tc.getTable(0).getTotalCostOfTable()==4000);
        tc.getTable(0).removeItem(0);
        assertTrue(tc.getTable(0).getTotalCostOfTable()==3000);
        tc.getTable(0).addItem(ic.getItem(1));
        assertTrue(tc.getTable(0).getTotalCostOfTable()==3300);
        tc.getTable(0).cleanTable();
        assertTrue(tc.getTable(0).getItems().size()==0 && tc.getTable(0).getTotalCostOfTable() == 0);
    }

    @Test
    void tableAndWaiterTest(){
        tc.addTable();
        wc.addWaiter(20,"Laci", "1234asd");
        tc.getTable(0).setWaiter(wc.getWaiter(0));
        assertTrue(tc.getTable(0).getWaiter().getName().equals("Laci"));
        tc.getTable(0).cleanTable();
        assertTrue(tc.getTable(0).getWaiter()== null);
    }







}
