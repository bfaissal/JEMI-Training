/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.arquillain.demo.arquilliancdi;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author faissalboutaounte
 */
@Named
@RequestScoped
public class BonjourBean {
    @Inject
    SalamBean salam;
    private String bonjour;
    @PostConstruct
    public void init(){
        bonjour = salam.getName();
    }
    
    public String getBonjour() {
        return bonjour;
    }

    public void setBonjour(String bonjour) {
        this.bonjour = bonjour;
    }
    
}
