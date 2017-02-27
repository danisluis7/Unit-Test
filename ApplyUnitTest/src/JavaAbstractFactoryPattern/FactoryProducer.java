package JavaAbstractFactoryPattern;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("WIDGET")){
			return new WidgetFactory();
		}else if(choice.equalsIgnoreCase("PRINTER")){
			return new PrinterFactory();
		}
		return null;
	}
}
