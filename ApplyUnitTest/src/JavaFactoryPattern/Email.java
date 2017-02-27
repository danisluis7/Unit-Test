package JavaFactoryPattern;

public class Email implements Widget{

	@Override
	public boolean validate(String temp) {
		// TODO Auto-generated method stub
		return temp.equals("lorence@enclave.vn");
	}
		
}
