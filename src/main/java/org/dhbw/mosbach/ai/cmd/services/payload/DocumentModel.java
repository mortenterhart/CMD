package org.dhbw.mosbach.ai.cmd.services.payload;

import org.dhbw.mosbach.ai.cmd.services.JsonParameters;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DocumentModel {

    @XmlElement(name = JsonParameters.DOCUMENT_NAME, required = true)
    private String name;

    public String getName() {
        return name;
    }
}
