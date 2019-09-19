package com.msaure;

import org.apache.wicket.util.tester.FormTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCreateProjectPage {

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
        tester.startPage(CreateProjectPage.class);
        tester.assertRenderedPage(CreateProjectPage.class);
    }

    @Test
    public void thatItAcceptsValidInput() {
        FormTester formTester = tester.newFormTester("newProjectForm");

        formTester.setValue("name", "myProject");
        formTester.setValue("description", "This is a description of my new project");

        formTester.submit();

        tester.assertNoErrorMessage();
    }
}
