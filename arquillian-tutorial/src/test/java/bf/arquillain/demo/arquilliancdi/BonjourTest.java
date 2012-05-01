/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.arquillain.demo.arquilliancdi;

import javax.inject.Inject;
import org.jboss.arquillian.container.spi.context.annotation.DeploymentScoped;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

/**
 *
 * @author faissalboutaounte
 */
@RunWith(Arquillian.class)
public class BonjourTest {
    
    @Deployment
	public static JavaArchive createArchiveAndDeploy() {
		return ShrinkWrap.create(JavaArchive.class)
				.addClasses(BonjourBean.class, SalamBean.class)
				.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
	}
        @Inject 
        BonjourBean bonjour;
        
	@Test
	public void testCreateTimestamp() {
            System.out.println("Salam");
                assertEquals(bonjour.getBonjour(),"Salam Ok Salam");
        }
}
