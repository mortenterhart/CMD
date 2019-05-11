package org.dhbw.mosbach.ai.cmd.services.payload;

import org.dhbw.mosbach.ai.cmd.services.JsonParameters;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RegisterModel implements Payload {

    @XmlElement(name = JsonParameters.USERNAME, required = true)
    private String username;

    @XmlElement(name = JsonParameters.EMAIL, required = true)
    private String email;

    @XmlElement(name = JsonParameters.PASSWORD, required = true)
    private String password;

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
