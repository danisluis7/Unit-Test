package JavaAbstractFactoryPattern;

public abstract class AbstractFactory {
	abstract Printer getPrinter(String type);
	abstract Widget getWidget(String widget);
}

class WidgetFactory extends AbstractFactory{

	@Override
	Printer getPrinter(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Widget getWidget(String widget) {
		// TODO Auto-generated method stub
		if(widget == null){
			return null;
		}
		if(widget.equalsIgnoreCase("EMAIL")){
			return new Mail(); 
		}else if(widget.equalsIgnoreCase("USER")){
			return new User();
		}else if(widget.equalsIgnoreCase("PASS")){
			return new Pass();
		}
		return null;
	}
	
}

class PrinterFactory extends AbstractFactory{

	@Override
	Printer getPrinter(String type) {
		// TODO Auto-generated method stub
		if(type == null){
			return null;
		}
		if(type.equalsIgnoreCase("PAPER")){
			return new PaperPrinter();
		}else if(type.equalsIgnoreCase("WEB")){
			return new WebPrinter();
		}else if(type.equalsIgnoreCase("SCREEN")){
			return new ScreenPrinter();
		}
		return null;
	}

	@Override
	Widget getWidget(String widget) {
		// TODO Auto-generated method stub
		return null;
	}
	
}