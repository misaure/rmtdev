package com.msaure;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestHomePage {

    WicketTester tester;

    @Before
    public void setUp() {
        tester = new WicketTester(new WicketApplication());
    }

    @After
    public void tearDown() {
        if (tester != null) {
            tester.destroy();
        }
    }

    @Test
    public void thatItRendersWithoutErrors() {
        tester.startPage(HomePage.class);
        tester.assertRenderedPage(HomePage.class);
    }
}
