package hu.elte.pos;

import hu.elte.pos.controller.ItemController;
import hu.elte.pos.controller.TableController;
import hu.elte.pos.controller.WaiterController;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;


class ApplicationTest {

    private TableController tc;
    private WaiterController wc;
    private ItemController ic;

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
    void testTables() {
        tc.addTable();
        tc.addTable();
        assertEquals(2, tc.getTable(1).getTableNumber());
        tc.removeTable(0);
        assertEquals(1, tc.getNumberOfTables());
    }

    @Test
    void testWaiters() {
        wc.addWaiter(26, "liza", "1234asd");
        wc.addWaiter(19, "csabi", "4567asd");

        assertSame("csabi", wc.getWaiter(1).getName());
        assertEquals(2, wc.getNumberOfWaiters());
    }

    @Test
    void testItems() {
        ic.addItem(1000, "palacsinta");
        ic.addItem(300, "kóla");
        ic.addItem(3000, "bélszín");
        boolean vanepalacsinta = false;
        for (int i = 0; i < ic.getNumberOfItems(); i++) {
            if (ic.getItem(i).getName().equals("palacsinta")) {
                vanepalacsinta = true;
            }
        }

        assertTrue(vanepalacsinta);
        assertEquals(3, ic.getNumberOfItems());
    }

    @Test
    void tableAndPricesTest() {
        ic.addItem(1000, "palacsinta");
        ic.addItem(300, "kóla");
        ic.addItem(3000, "bélszín");
        tc.addTable();
        tc.addTable();
        tc.getTable(0).addItem(ic.getItem(0));
        tc.getTable(0).addItem(ic.getItem(2));
        assertEquals(4000, tc.getTable(0).getTotalCostOfTable());
        tc.getTable(0).removeItem(0);
        assertEquals(3000, tc.getTable(0).getTotalCostOfTable());
        tc.getTable(0).addItem(ic.getItem(1));
        assertEquals(3300, tc.getTable(0).getTotalCostOfTable());
        tc.getTable(0).cleanTable();
        assertTrue(tc.getTable(0).getItems().size() == 0 && tc.getTable(0).getTotalCostOfTable() == 0);
    }

    @Test
    void tableAndWaiterTest() {
        tc.addTable();
        wc.addWaiter(20, "Laci", "1234asd");
        tc.getTable(0).setWaiter(wc.getWaiter(0));
        assertEquals("Laci", tc.getTable(0).getWaiter().getName());
        tc.getTable(0).cleanTable();
        assertNull(tc.getTable(0).getWaiter());
    }


}
