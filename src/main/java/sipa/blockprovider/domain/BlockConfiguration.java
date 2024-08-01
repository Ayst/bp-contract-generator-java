package sipa.blockprovider.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Internal use only, do not interact.
 */
public class BlockConfiguration {

    private String version;
    private Documentation documentation;
    private Endpoint endpoint;
    private final List<Template> templates = new ArrayList<>();

    public String getVersion() {
        return this.version;
    }

    public Endpoint getEndpoint() {
        return this.endpoint;
    }

    public void setEndpoint(final Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public List<Template> getTemplates() {
        return this.templates;
    }

    public Documentation getDocumentation() {
        return this.documentation;
    }

    public void setDocumentation(final String url) {
        if (this.documentation == null) {
            this.documentation = new Documentation();
        }
        this.documentation.url = url;
    }

    public class Documentation {
        private String url;

        public String getUrl() {
            return this.url;
        }
    }
}
