package hu.elte.pos;

import hu.elte.pos.view.ApplicationView;

import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;


class ApplicationTest {

    private FrameFixture applicationView;

    @Before
    void setUp() {
        applicationView = new FrameFixture(new ApplicationView());
    }

    @After
    void tearDown() {
        applicationView.cleanUp();
    }

    @Test
    void initApplication() {
        assert(applicationView == null);
    }
}
