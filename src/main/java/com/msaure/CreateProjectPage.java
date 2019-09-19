package com.msaure;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.io.IClusterable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateProjectPage extends WebPage {

    private static final Logger LOG = LoggerFactory.getLogger(CreateProjectPage.class);

    public CreateProjectPage(PageParameters params) {
        this(new CompoundPropertyModel(new ProjectFormData()));
    }

    public CreateProjectPage(IModel<ProjectFormData> defaultModel) {
        setDefaultModel(defaultModel);
    }

    @Override
    protected void onInitialize() {
        super.onInitialize();

        createForm();
    }

    private void createForm() {
        Form<ProjectFormData> newProjectForm = new Form<ProjectFormData>("newProjectForm") {
            @Override
            protected void onInitialize() {
                super.onInitialize();

                add(new TextField("name"));
                add(new TextArea("description"));
            }

            @Override
            protected void onSubmit() {
                LOG.info("submmitting with project data {}", getDefaultModel().getObject());
            }
        };
        add(newProjectForm);
    }

    public static class ProjectFormData implements IClusterable {
        private String name;
        private String description;
        private String groupId;
        private String artifactId;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getGroupId() {
            return groupId;
        }

        public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        public String getArtifactId() {
            return artifactId;
        }

        public void setArtifactId(String artifactId) {
            this.artifactId = artifactId;
        }
    }
}
