package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonneService {
    public String personne(String name){
        return "Salem "+ name;
    }
}
