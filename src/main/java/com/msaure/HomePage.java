package com.msaure;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;

public class HomePage extends WebPage {

    @Override
    protected void onInitialize() {
        super.onInitialize();

        add(new Link("newProject") {

            @Override
            public void onClick() {
                setResponsePage(CreateProjectPage.class);
            }
        });
    }
}
