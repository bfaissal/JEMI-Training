/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.arquillain.demo.arquilliancdi;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author faissalboutaounte
 */
@Named
@RequestScoped
public class SalamBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    @PostConstruct
    public void salam(){
     name = "Salam Ok "+test();
    }
    
    private String test(){
        return "Salam";
    }
}
