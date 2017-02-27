package JavaFactoryPattern;

import org.junit.Assert;
import org.junit.Test;

public class CodeClient {
	/**
	 * @author enclaveit
	 * We call a method to validate email when user login
	 * => Call validate, not care what is validate?
	 * @return 
	 */
	@Test
	public void validateEmailLogin(){
		/**
		 * Step 1: Please, see the picture 1 and understand all widget inside picture
		 * There are are some many widget:
		 * + email
		 * + password
		 * + remember me
		 * + avatar => the picture of UI Login
		 * + ...
		 */
		WidgetLogin widgetLogin = new WidgetLogin();
		Email email = (Email) widgetLogin.getWidget("EMAIL");
		Assert.assertTrue(email.validate("lorence@enclave.vn"));
	}
}
