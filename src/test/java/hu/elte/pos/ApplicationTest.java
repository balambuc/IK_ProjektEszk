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
    }

    @Test
    void testWaiters(){
        wc.addWaiter(26, "liza", "1234asd");
        wc.addWaiter(19, "csabi", "4567asd");

        assertTrue(wc.getWaiter(1).getName()== "csabi");
    }

    @Test
    void testItems(){
        ic = new ItemController();
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
    }







}
