package JavaFactoryPattern;

public class WidgetLogin {

	public Widget getWidget(String widget) {
		// TODO Auto-generated method stub
		if(widget == null){
			return null;
		}
		if(widget.equalsIgnoreCase("EMAIL")){
			return new Email();
		}else if(widget.equalsIgnoreCase("PASS")){
			return new Pass();
		}else if(widget.equalsIgnoreCase("USER")){
			return new User();
		}
		return null;
	}
}
