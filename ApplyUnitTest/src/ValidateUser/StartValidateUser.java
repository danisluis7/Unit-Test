package ValidateUser;

import org.junit.Assert;
import org.junit.Test;
/**
 * @author Lorence
 * @description Instruct everyone understand some things that I code
 *
 */
public class StartValidateUser {
	@Test
	public void validateUserTest(){
		Assert.assertTrue(new DataUserTest().isValidate("Lorence","Abc@123456"));
	}
}
