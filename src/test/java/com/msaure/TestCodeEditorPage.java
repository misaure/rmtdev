package com.msaure;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Simple test using the WicketTester
 */
public class TestCodeEditorPage
{
	private WicketTester tester;

	@Before
	public void setUp()
	{
		tester = new WicketTester(new WicketApplication());
	}

	@After
	public void tearDown() {
		if (tester != null) {
			tester.destroy();
		}
	}

	@Test
	public void homepageRendersSuccessfully()
	{
		//start and render the test page
		tester.startPage(CodeEditorPage.class);

		//assert rendered page class
		tester.assertRenderedPage(CodeEditorPage.class);
	}
}
