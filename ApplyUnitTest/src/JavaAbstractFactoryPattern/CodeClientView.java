package JavaAbstractFactoryPattern;

import org.junit.Assert;
import org.junit.Test;

public class CodeClientView {
	
    AbstractFactory shapeFactory = FactoryProducer.getFactory("WIDGET");
	AbstractFactory printerFactory = FactoryProducer.getFactory("PRINTER");
	
    Mail email = (Mail) shapeFactory.getWidget("EMAIL");
    //get printer factory
    
    @Test
    public void shouldEmailValidate(){
    	Assert.assertTrue(email.validate("lorence@enclave.vn"));
    }
}
