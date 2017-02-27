package JavaAbstractFactoryPattern;

public interface Printer {
	void print();
}

class PaperPrinter implements Printer{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("paper");
	}
	
}

class WebPrinter implements Printer{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("web");
	}
	
}

class ScreenPrinter implements Printer{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("screen");
	}
	
}
